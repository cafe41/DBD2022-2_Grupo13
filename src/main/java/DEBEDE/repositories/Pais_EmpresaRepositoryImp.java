package DEBEDE.repositories;

import DEBEDE.models.Pais_Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository

public class Pais_EmpresaRepositoryImp implements Pais_EmpresaRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Pais_Empresa crear(Pais_Empresa Pais_Empresa){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Pais_Empresa (ID_Pais_Empresa,ID_Pais,ID_Empresa)" +
                    "VALUES (:ID_Pais_Empresa,:ID_Pais ,:ID_Empresa)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Pais_Empresa", Pais_Empresa.getID_Pais_Empresa().toString())
                    .addColumnMapping("ID_Pais", Pais_Empresa.getID_Pais().toString())
                    .addColumnMapping("ID_Empresa", Pais_Empresa.getID_Empresa().toString())
                    .executeUpdate();
            return Pais_Empresa;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }



    @Override
    public List<Pais_Empresa> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Pais_Empresa order by ID_Pais_Empresa ASC")
                    .executeAndFetch(Pais_Empresa.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Pais_Empresa> show(Integer ID_Pais_Empresa) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Pais_Empresa where ID_Pais_Empresa = :ID_Pais_Empresa ")
                    .addParameter("ID_Pais_Empresa",ID_Pais_Empresa)
                    .executeAndFetch(Pais_Empresa.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




    @Override
    public void delete(Integer ID_Pais_Empresa) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Pais_Empresa where ID_Pais_Empresa = :ID_Pais_Empresa ")
                    .addParameter("ID_Pais_Empresa",ID_Pais_Empresa)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    @Override
    public String update(Pais_Empresa Pais_Empresa, Integer ID_Pais_Empresa){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Pais_Empresa set ID_Pais=:ID_Pais, ID_Empresa=:ID_Empresa WHERE ID_Pais_Empresa=:ID_Pais_Empresa";
            conn.createQuery(updateSql)
                    .addParameter("ID_Pais_Empresa", ID_Pais_Empresa)
                    .addParameter("ID_Pais", Pais_Empresa.getID_Pais())
                    .addParameter("ID_Empresa", Pais_Empresa.getID_Empresa())
                    .executeUpdate();
            return "Se actualizo el Pais_Empresa";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Pais_Empresa";
        }
    }
}
