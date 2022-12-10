package DEBEDE.repositories;

import DEBEDE.models.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository

public class PaisRepositoryImp implements PaisRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Pais crear(Pais Pais){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Pais (ID_Pais,nombre_pais,idioma,ID_Region)" +
                    "VALUES (:ID_Pais,:nombre_pais ,:idioma,:ID_Region)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Pais", Pais.getID_Pais().toString())
                    .addParameter("tipo", Pais.getNombre_pais())
                    .addParameter("descripcion", Pais.getIdioma())
                    .addColumnMapping("ID_Region", Pais.getID_Region().toString())
                    .executeUpdate();
            return Pais;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }



    @Override
    public List<Pais> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Pais order by tipo ASC")
                    .executeAndFetch(Pais.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Pais> show(Integer ID_Pais) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Pais where ID_Pais = :ID_Pais ")
                    .addParameter("ID_Pais",ID_Pais)
                    .executeAndFetch(Pais.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




    @Override
    public void delete(Integer ID_Pais) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from ID_Pais where ID_Pais = :ID_Pais ")
                    .addParameter("ID_Pais",ID_Pais)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    @Override
    public String update(Pais Pais, Integer ID_Pais){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Pais set nombre_pais=:nombre_pais, idioma=:idioma, ID_Region=:ID_Region WHERE ID_Pais=:ID_Pais";
            conn.createQuery(updateSql)
                    .addParameter("ID_Pais", ID_Pais)
                    .addParameter("nombre_pais", Pais.getNombre_pais())
                    .addParameter("idioma", Pais.getIdioma())
                    .addParameter("ID_Region", Pais.getID_Region())
                    .executeUpdate();
            return "Se actualizo el Pais";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Pais";
        }
    }
}
