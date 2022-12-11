package DEBEDE.repositories;

import DEBEDE.models.Producto_Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Producto_CategoriaRepositoryImp implements Producto_CategoriaRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Producto_Categoria crear(Producto_Categoria Producto_Categoria){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Producto_Categoria (ID_Producto_Categoria,ID_Producto,ID_Categoria)" +
                    "VALUES (:ID_Producto_Categoria, :ID_Producto, :ID_Categoria)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Producto_Categoria", Producto_Categoria.getID_Producto_Categoria().toString())
                    .addColumnMapping("ID_Producto", Producto_Categoria.getID_Producto().toString())
                    .addColumnMapping("ID_Categoria", Producto_Categoria.getID_Categoria().toString())
                    .executeUpdate();
            return Producto_Categoria;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Producto_Categoria> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Producto_Categoria order by ID_Producto_Categoria ASC")
                    .executeAndFetch(Producto_Categoria.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Producto_Categoria> show(Integer ID_Producto_Categoria) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Boleta where ID_Producto_Categoria = :ID_Producto_Categoria ")
                    .addParameter("ID_Producto_Categoria",ID_Producto_Categoria)
                    .executeAndFetch(Producto_Categoria.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(Integer ID_Producto_Categoria) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Producto_Categoria where ID_Producto_Categoria = :ID_Producto_Categoria ")
                    .addParameter("ID_Producto_Categoria",ID_Producto_Categoria)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public String update(Producto_Categoria Producto_Categoria, Integer ID_Producto_Categoria){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Producto_Categoria set tipo_tarjeta=:tipo_tarjeta, numero_tarjeta=:numero_tarjeta, monto=:monto, fecha=:fecha , id_usuario=:id_usuario ,id_empresa=:id_empresa WHERE ID_Producto_Categoria=:ID_Producto_Categoria";
            conn.createQuery(updateSql)
                    .addParameter("ID_Producto_Categoria", ID_Producto_Categoria)
                    .addParameter("ID_Producto", Producto_Categoria.getID_Producto())
                    .addParameter("ID_Categoria", Producto_Categoria.getID_Categoria())

                    .executeUpdate();
            return "Se actualizó el Producto_Categoria";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Producto_Categoria";
        }
    }



}
