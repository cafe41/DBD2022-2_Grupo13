package DEBEDE.repositories;

import DEBEDE.models.Rol_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Rol_UsuarioRepositoryImp implements Rol_UsuarioRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Rol_Usuario crear(Rol_Usuario Rol_Usuario){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Rol_Usuario (ID_Rol_Usuario, ID_Rol, ID_Usuario)" +
                    "VALUES (:ID_Rol_Usuario, :ID_Rol, :ID_Usuario)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Rol_Usuario", Rol_Usuario.getID_Rol_Usuario().toString())
                    .addColumnMapping("ID_Rol", Rol_Usuario.getID_Rol().toString())
                    .addColumnMapping("id_usuario", Rol_Usuario.getID_Usuario().toString())
                    .executeUpdate();
            return Rol_Usuario;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Rol_Usuario> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Rol_Usuario order by ID_Rol_Usuario ASC")
                    .executeAndFetch(Rol_Usuario.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Rol_Usuario> show(Integer ID_Rol_Usuario) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Rol_Usuario where ID_Rol_Usuario = :ID_Rol_Usuario ")
                    .addParameter("ID_Rol_Usuario",ID_Rol_Usuario)
                    .executeAndFetch(Rol_Usuario.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(Integer ID_Rol_Usuario) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Rol_Usuario where ID_Rol_Usuario = :ID_Rol_Usuario ")
                    .addParameter("ID_Rol_Usuario",ID_Rol_Usuario)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public String update(Rol_Usuario Rol_Usuario, Integer ID_Rol_Usuario){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Rol_Usuario set ID_Rol=:ID_Rol, ID_Usuario=:ID_Usuario WHERE ID_Rol_Usuario=:ID_Rol_Usuario";
            conn.createQuery(updateSql)
                    .addParameter("ID_Rol_Usuario", ID_Rol_Usuario)
                    .addParameter("ID_Rol", Rol_Usuario.getID_Rol())
                    .addParameter("ID_Usuario", Rol_Usuario.getID_Usuario())

                    .executeUpdate();
            return "Se actualizó el Rol_Usuario";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Rol_Usuario";
        }
    }



}
