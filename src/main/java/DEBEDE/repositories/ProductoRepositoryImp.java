package DEBEDE.repositories;

import DEBEDE.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;

@Repository
public class ProductoRepositoryImp implements ProductoRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Producto crear(Producto producto){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO producto (ID_Producto,Nombre_Producto, Stock,Precio ,EsExplicito, Descripcion, Link_pagina, Imagen_producto, ID_Empresa)" +
            "VALUES (:ID_Producto, :Nombre_Producto, :Stock, :Precio ,:EsExplicito, :Descripcion, :Link_pagina, :Imagen_producto, :ID_Empresa)";
            conn.createQuery(sql, true)
                .addParameter("ID_Producto", producto.getID_Producto())
                .addParameter("Nombre_Producto", producto.getNombre_Producto())
                .addParameter("Stock", producto.getStock())
                    .addParameter("Precio", producto.getPrecio())
                .addParameter("EsExplicito", producto.getEsExplicito())
                .addParameter("Descripcion", producto.getDescripcion())
                .addParameter("Link_pagina", producto.getLink_pagina())
                .addParameter("Imagen_producto", producto.getImagen_producto())
                .addParameter("ID_Empresa", producto.getID_Empresa())
                .executeUpdate();
                return producto;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }


    
    @Override
    public List<Producto> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from producto order by Nombre_Producto ASC")
                    .executeAndFetch(Producto.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Producto> show(Integer ID_Producto) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from producto where ID_Producto = :ID_Producto ")
                    .addParameter("Integer ID_Producto", ID_Producto)
                    .executeAndFetch(Producto.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Producto> showLessThan(Integer Stock) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from producto where Stock< :Stock ::int")
                    .addParameter("Stock",Stock)
                    .executeAndFetch(Producto.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Producto> showByID_Empresa(Integer ID_Empresa) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from producto where ID_Empresa = :ID_Empresa")
                    .addParameter("ID_Empresa", ID_Empresa)
                    .executeAndFetch(Producto.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public void delete(Integer ID_Producto) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from producto where ID_Producto = :ID_Producto")
                    .addParameter("ID_Producto",ID_Producto)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public String update(Producto producto, Integer ID_Producto){
        try(Connection conn = sql2o.open()){
<<<<<<< HEAD
            String updateSql = "update producto set ID_Producto=:ID_Producto, Nombre_Producto=:Nombre_Producto, Stock=:Stock, Precio=:Precio ,EsExplicito=:EsExplicito, " +
                    "Descripcion=:Descripcion, Link_pagina=:Link_pagina, Imagen_producto=:Imagen_producto, ID_Empresa=:ID_Empresa";
=======
            String updateSql = "update producto set ID_Producto=:ID_Producto, Nombre_Producto=:Nombre_Producto, " +
                    "Stock=:Stock, EsExplicito=:EsExplicito, Descripcion=:Descripcion, Link_pagina=:Link_pagina, " +
                    "Imagen_producto=:Imagen_producto, ID_Empresa=:ID_Empresa WHERE ID_Producto=:ID_Producto";
>>>>>>> e8d01cb753aefe50df90c414f0495b9f28b69e9d
            conn.createQuery(updateSql)
                .addParameter("ID_Producto", producto.getID_Producto())
                .addParameter("Nombre_Producto", producto.getNombre_Producto())
                .addParameter("Stock", producto.getStock())
                    .addParameter("Precio", producto.getPrecio())
                .addParameter("EsExplicito", producto.getEsExplicito())
                .addParameter("Descripcion", producto.getDescripcion())
                .addParameter("Link_pagina", producto.getLink_pagina())
                .addParameter("Imagen_producto", producto.getImagen_producto())
                .addParameter("ID_Empresa", producto.getID_Empresa())
                .executeUpdate();
            return "Se actualizó el producto";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar producto";
        }
    }

}