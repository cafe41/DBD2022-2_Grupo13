package DEBEDE.repositories;

import DEBEDE.models.Permiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class PermisoRepositoryImp implements PermisoRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Permiso crear(Permiso Permiso){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Permiso (ID_Permiso, Descripcion_Permiso)" +
                    "VALUES (:ID_Permiso, :Descripcion_Permiso)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Permiso", Permiso.getID_Permiso().toString())
                    .addParameter("Descripcion_Permiso", Permiso.getDescripcion_Permiso())
                    .executeUpdate();
            return Permiso;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Permiso> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Permiso order by ID_Permiso ASC")
                    .executeAndFetch(Permiso.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Permiso> show(Integer ID_Permiso) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Permiso where ID_Permiso = :ID_Permiso ")
                    .addParameter("ID_Permiso",ID_Permiso)
                    .executeAndFetch(Permiso.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(Integer ID_Permiso) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Permiso where ID_Permiso = :ID_Permiso ")
                    .addParameter("ID_Permiso",ID_Permiso)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public String update(Permiso Permiso, Integer ID_Permiso){
        try(Connection conn = sql2o.open()){
            String updateSql = "update permiso set Descripcion_Permiso=:Descripcion_Permiso WHERE ID_Permiso=:ID_Permiso";
            conn.createQuery(updateSql)
                    .addParameter("ID_Permiso", ID_Permiso)
                    .addParameter("Descripcion_Permiso", Permiso.getDescripcion_Permiso())

                    .executeUpdate();
            return "Se actualizó el Permiso";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Permiso";
        }
    }



}
