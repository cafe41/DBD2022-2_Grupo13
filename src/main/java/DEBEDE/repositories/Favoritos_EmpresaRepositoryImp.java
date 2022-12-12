package DEBEDE.repositories;

import DEBEDE.models.Favoritos_Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository

public class Favoritos_EmpresaRepositoryImp implements Favoritos_EmpresaRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Favoritos_Empresa crear(Favoritos_Empresa Favoritos_Empresa){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO favoritos_empresa (ID_Favoritos_Empresa,ID_Favorito,ID_Empresa)" +
                    "VALUES (:ID_Favoritos_Empresa,:ID_Favorito ,:ID_Empresa)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Favoritos_Empresa", Favoritos_Empresa.getID_Favoritos_Empresa().toString())
                    .addColumnMapping("ID_Favorito", Favoritos_Empresa.getID_Favorito().toString())
                    .addColumnMapping("ID_Empresa", Favoritos_Empresa.getID_Empresa().toString())
                    .executeUpdate();
            return Favoritos_Empresa;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }



    @Override
    public List<Favoritos_Empresa> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Favoritos_Empresa order by ID_Favoritos_Empresa ASC")
                    .executeAndFetch(Favoritos_Empresa.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Favoritos_Empresa> show(Integer ID_Favoritos_Empresa) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Favoritos_Empresa where ID_Favoritos_Empresa = :ID_Favoritos_Empresa ")
                    .addParameter("ID_Favoritos_Empresa",ID_Favoritos_Empresa)
                    .executeAndFetch(Favoritos_Empresa.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




    @Override
    public void delete(Integer ID_Favoritos_Empresa) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from favoritos_empresa where ID_Favoritos_Empresa = :ID_Favoritos_Empresa ")
                    .addParameter("ID_Favoritos_Empresa",ID_Favoritos_Empresa)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    @Override
    public String update(Favoritos_Empresa Favoritos_Empresa, Integer ID_Favoritos_Empresa){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Favoritos_Empresa set ID_Favorito=:ID_Favorito, ID_Empresa=:ID_Empresa WHERE ID_Favoritos_Empresa=:ID_Favoritos_Empresa";
            conn.createQuery(updateSql)
                    .addParameter("ID_Favoritos_Empresa", ID_Favoritos_Empresa)
                    .addParameter("ID_Favorito", Favoritos_Empresa.getID_Favorito())
                    .addParameter("ID_Empresa", Favoritos_Empresa.getID_Empresa())
                    .executeUpdate();
            return "Se actualizo el Favoritos_Empresa";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Favoritos_Empresa";
        }
    }
}
