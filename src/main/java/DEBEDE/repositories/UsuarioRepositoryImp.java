package DEBEDE.repositories;

import DEBEDE.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;

@Repository
public class UsuarioRepositoryImp implements UsuarioRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Usuario crear(Usuario Usuario){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Usuario (ID_Usuario,Nombre_Usuario,Nombre,Fecha_Nacimiento,Contrasena,Correo, ID_Pago)" +
                    "VALUES (:ID_Usuario,:Nombre_Usuario,:Nombre,:Fecha_Nacimiento,:Contrasena,:Correo, :ID_Pago)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Usuario", Usuario.getID_Usuario().toString())
                    .addParameter("Nombre_Usuario", Usuario.getNombre_Usuario())
                    .addParameter("Nombre", Usuario.getNombre())
                    .addParameter("Fecha_Nacimiento", Usuario.getFecha_Nacimiento())
                    .addParameter("Contrasena", Usuario.getContrasena())
                    .addParameter("Correo", Usuario.getCorreo())
                    .addColumnMapping("ID_Pago", Usuario.getID_Pago().toString())
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
            String updateSql = "update Usuario set Nombre_Usuario=:Nombre_Usuario, Nombre=:Nombre, Fecha_Nacimiento=:Fecha_Nacimiento, Contrasena=:Contrasena , Correo=:Correo ,ID_Pago=:ID_Pago WHERE ID_Usuario=:ID_Usuario";
            conn.createQuery(updateSql)
                    .addParameter("ID_Usuario", ID_Usuario)
                    .addParameter("Nombre_Usuario", Usuario.getNombre_Usuario())
                    .addParameter("Nombre", Usuario.getNombre())
                    .addParameter("Fecha_Nacimiento", Usuario.getFecha_Nacimiento())
                    .addParameter("Contrasena", Usuario.getContrasena())
                    .addParameter("Correo", Usuario.getCorreo())
                    .addParameter("ID_Pago", Usuario.getID_Pago())

                    .executeUpdate();
            return "Se actualizó al Usuario";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Usuario";
        }
    }



}
