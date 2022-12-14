package DEBEDE.repositories;

import DEBEDE.models.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;
@Repository

public class RolRepositoryImp implements RolRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Rol crear(Rol Rol){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Rol (tipo,descripcion)" +
                    "VALUES (:tipo ,:descripcion)";
            conn.createQuery(sql, true)
                    .addParameter("tipo", Rol.getTipo())
                    .addParameter("descripcion", Rol.getDescripcion())
                    .executeUpdate();
            return Rol;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }



    @Override
    public List<Rol> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Rol order by tipo ASC")
                    .executeAndFetch(Rol.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Rol> show(Integer id_rol) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Rol where id_rol = :id_rol ")
                    .addParameter("id_rol",id_rol)
                    .executeAndFetch(Rol.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




    @Override
    public void delete(Integer id_rol) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Rol where id_rol = :id_rol ")
                    .addParameter("id_rol",id_rol)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    @Override
    public String update(Rol Rol, Integer id_rol){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Rol set tipo=:tipo, descripcion=:descripcion WHERE id_rol=:id_rol";
            conn.createQuery(updateSql)
                    .addParameter("id_rol", id_rol)
                    .addParameter("tipo", Rol.getTipo())
                    .addParameter("descripcion", Rol.getDescripcion())
                    .executeUpdate();
            return "Se actualizo el Rol";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Rol";
        }
    }
}
