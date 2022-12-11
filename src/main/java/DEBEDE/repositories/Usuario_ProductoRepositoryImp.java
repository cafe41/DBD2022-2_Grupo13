package DEBEDE.repositories;

import DEBEDE.models.Usuario_Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Usuario_ProductoRepositoryImp implements Usuario_ProductoRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Usuario_Producto crear(Usuario_Producto Usuario_Producto){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Usuario_Producto (ID_Carrito, fecha_creacion, ID_Usuario, ID_Producto)" +
                    "VALUES (:ID_Carrito, :fecha_creacion, :ID_Usuario, :ID_Producto)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Carrito", Usuario_Producto.getID_Carrito().toString())
                    .addParameter("fecha_creacion", Usuario_Producto.getFecha_creacion())
                    .addColumnMapping("ID_Usuario", Usuario_Producto.getID_Usuario().toString())
                    .addColumnMapping("ID_Producto", Usuario_Producto.getID_Usuario().toString())
                    .executeUpdate();
            return Usuario_Producto;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Usuario_Producto> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Usuario_Producto order by fecha_creacion ASC")
                    .executeAndFetch(Usuario_Producto.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Usuario_Producto> show(Integer ID_Carrito) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Usuario_Producto where ID_Carrito = :ID_Carrito ")
                    .addParameter("ID_Carrito",ID_Carrito)
                    .executeAndFetch(Usuario_Producto.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(Integer ID_Carrito) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Usuario_Producto where ID_Carrito = :ID_Carrito ")
                    .addParameter("ID_Carrito",ID_Carrito)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public String update(Usuario_Producto Usuario_Producto, Integer ID_Carrito){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Rol_Usuario set fecha_creacion=:fecha_creacion, ID_Usuario=:ID_Usuario, ID_Producto=:ID_Producto WHERE ID_Carrito=:ID_Carrito";
            conn.createQuery(updateSql)
                    .addParameter("ID_Carrito", ID_Carrito)
                    .addParameter("fecha_creacion", Usuario_Producto.getFecha_creacion())
                    .addParameter("ID_Usuario", Usuario_Producto.getID_Usuario())
                    .addParameter("ID_Producto", Usuario_Producto.getID_Producto())

                    .executeUpdate();
            return "Se actualizó el Usuario_Producto";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Usuario_Producto";
        }
    }



}
