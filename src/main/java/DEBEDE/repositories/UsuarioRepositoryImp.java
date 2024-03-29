package DEBEDE.repositories;

import DEBEDE.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;
import java.util.List;

@Repository
public class UsuarioRepositoryImp implements UsuarioRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Usuario crear(Usuario Usuario){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Usuario (Nombre_Usuario,Nombre,Fecha_Nacimiento,Contrasena,Correo, ID_Pais)" +
                    "VALUES (:Nombre_Usuario,:Nombre,:Fecha_Nacimiento,:Contrasena,:Correo, :ID_Pais)";
            conn.createQuery(sql, true)
                    .addParameter("Nombre_Usuario", Usuario.getNombre_Usuario())
                    .addParameter("Nombre", Usuario.getNombre())
                    .addParameter("Fecha_Nacimiento", Usuario.getFecha_Nacimiento())
                    .addParameter("Contrasena", Usuario.getContrasena())
                    .addParameter("Correo", Usuario.getCorreo())
                    .addParameter("ID_Pais", Usuario.getID_Pais())
                    .executeUpdate();
            return Usuario;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Usuario> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Usuario order by Nombre ASC")
                    .executeAndFetch(Usuario.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Usuario> show(Integer ID_Usuario) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Usuario where ID_Usuario = :ID_Usuario ")
                    .addParameter("ID_Usuario",ID_Usuario)
                    .executeAndFetch(Usuario.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Boolean userExists(String nombre_Usuario, String contrasena){
        try(Connection conn = sql2o.open()){
            List c = conn.createQuery("select * from Usuario where nombre_Usuario = :nombre_Usuario AND  contrasena = :contrasena")
                    .addParameter("nombre_Usuario",nombre_Usuario)
                    .addParameter("contrasena",contrasena)
                    .executeAndFetch(Usuario.class);
            if (c.size() != 0) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Boolean.FALSE;
        }
    }

    @Override
    public void delete(Integer ID_Usuario) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Usuario where ID_Usuario = :ID_Usuario ")
                    .addParameter("ID_Usuario",ID_Usuario)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public String update(Usuario Usuario, Integer ID_Usuario){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Usuario set Nombre_Usuario=:Nombre_Usuario, Nombre=:Nombre, Fecha_Nacimiento=:Fecha_Nacimiento, Contrasena=:Contrasena , Correo=:Correo ,ID_Pais=:ID_Pais WHERE ID_Usuario=:ID_Usuario";
            conn.createQuery(updateSql)
                    .addParameter("ID_Usuario", ID_Usuario)
                    .addParameter("Nombre_Usuario", Usuario.getNombre_Usuario())
                    .addParameter("Nombre", Usuario.getNombre())
                    .addParameter("Fecha_Nacimiento", Usuario.getFecha_Nacimiento())
                    .addParameter("Contrasena", Usuario.getContrasena())
                    .addParameter("Correo", Usuario.getCorreo())
                    .addParameter("ID_Pais", Usuario.getID_Pais())

                    .executeUpdate();
            return "Se actualizó al Usuario";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Usuario";
        }
    }



}
