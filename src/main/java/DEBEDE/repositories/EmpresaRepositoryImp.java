package DEBEDE.repositories;

import DEBEDE.models.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;

@Repository

public class EmpresaRepositoryImp implements EmpresaRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Empresa crear(Empresa Empresa){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Empresa (nombre_empresa,es_explicita,id_ranking)" +
                    "VALUES (:nombre_empresa ,:es_explicita, :id_ranking)";
            conn.createQuery(sql, true)
                    .addParameter("nombre_empresa", Empresa.getNombre_empresa())
                    .addParameter("es_explicita", Empresa.getEs_explicita())
                    .addParameter("id_ranking", Empresa.getId_ranking())
                    .executeUpdate();
            return Empresa;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }



    @Override
    public List<Empresa> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Empresa order by nombre_empresa ASC")
                    .executeAndFetch(Empresa.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Empresa> getNonExplicit() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Empresa where es_explicita = 0")
                    .executeAndFetch(Empresa.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Empresa> show(Integer id_empresa) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Empresa where id_empresa = :id_empresa ")
                    .addParameter("id_empresa",id_empresa)
                    .executeAndFetch(Empresa.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




    @Override
    public void delete(Integer id_empresa) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Empresa where id_empresa = :id_empresa ")
                    .addParameter("id_empresa",id_empresa)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    @Override
    public String update(Empresa Empresa, Integer id_empresa){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Empresa set nombre_empresa=:nombre_empresa, es_explicita=:es_explicita, id_ranking=:id_ranking WHERE id_empresa=:id_empresa";
            conn.createQuery(updateSql)
                    .addParameter("id_empresa", id_empresa)
                    .addParameter("nombre_empresa", Empresa.getNombre_empresa())
                    .addParameter("es_explicita", Empresa.getEs_explicita())
                    .addParameter("id_ranking", Empresa.getId_ranking())
                    .executeUpdate();
            return "Se actualizo la Empresa";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar la Empresa";
        }
    }
}
