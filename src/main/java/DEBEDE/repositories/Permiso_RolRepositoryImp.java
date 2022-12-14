package DEBEDE.repositories;

import DEBEDE.models.Permiso_Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository

public class Permiso_RolRepositoryImp implements Permiso_RolRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Permiso_Rol crear(Permiso_Rol Permiso_Rol){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO permiso_rol (ID_Permiso,ID_rol)" +
                    "VALUES (:ID_Permiso ,:ID_rol)";
            conn.createQuery(sql, true)
                    .addParameter("ID_Permiso", Permiso_Rol.getID_Permiso())
                    .addParameter("ID_rol", Permiso_Rol.getID_rol())
                    .executeUpdate();
            return Permiso_Rol;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }



    @Override
    public List<Permiso_Rol> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Permiso_Rol order by id_permiso ASC")
                    .executeAndFetch(Permiso_Rol.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Permiso_Rol> show(Integer ID_Permiso_Rol) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Permiso_Rol where ID_Permiso_Rol = :ID_Permiso_Rol ")
                    .addParameter("ID_Permiso_Rol",ID_Permiso_Rol)
                    .executeAndFetch(Permiso_Rol.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




    @Override
    public void delete(Integer ID_Permiso_Rol) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Permiso_Rol where ID_Permiso_Rol = :ID_Permiso_Rol ")
                    .addParameter("ID_Permiso_Rol",ID_Permiso_Rol)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    @Override
    public String update(Permiso_Rol Permiso_Rol, Integer ID_Permiso_Rol){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Permiso_Rol set ID_Permiso=:ID_Permiso, ID_rol=:ID_rol WHERE ID_Permiso_Rol=:ID_Permiso_Rol";
            conn.createQuery(updateSql)
                    .addParameter("ID_Permiso_Rol", ID_Permiso_Rol)
                    .addParameter("ID_Permiso", Permiso_Rol.getID_Permiso())
                    .addParameter("ID_rol", Permiso_Rol.getID_rol())
                    .executeUpdate();
            return "Se actualizo el Permiso_Rol";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Permiso_Rol";
        }
    }
}
