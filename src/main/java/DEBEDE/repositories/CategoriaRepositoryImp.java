package DEBEDE.repositories;

import DEBEDE.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import java.util.List;

@Repository
public class CategoriaRepositoryImp implements CategoriaRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Categoria crear(Categoria Categoria){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Categoria (ID_Categoria,Nombre_Categoria,Descripcion_Categoria)" +
            "VALUES (ID_Categoria, :Nombre_Categoria, :Descripcion_Categoria)";
            conn.createQuery(sql, true)
                .addColumnMapping("ID_Categoria", Categoria.getID_Categoria().toString())
                .addParameter("Nombre_Categoria", Categoria.getNombre_Categoria())
                .addParameter("Descripcion_Categoria", Categoria.getDescripcion_Categoria())
                .executeUpdate();
                return Categoria;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }


    
    @Override
    public List<Categoria> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Categoria order by Nombre_Categoria ASC")
                    .executeAndFetch(Categoria.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Categoria> show(Integer ID_Categoria) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Categoria where ID_Categoria = :ID_Categoria ")
                    .addParameter("ID_Categoria",ID_Categoria)
                    .executeAndFetch(Categoria.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




    @Override
    public void delete(Integer ID_Categoria) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Categoria where ID_Categoria = :ID_Categoria ")
                    .addParameter("ID_Categoria",ID_Categoria)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }


    @Override
    public String update(Categoria Categoria, Integer ID_Categoria){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Categoria set Nombre_Categoria=:Nombre_Categoria, " +
                    "Descripcion_Categoria=:Descripcion_Categoria WHERE ID_Categoria=:ID_Categoria";
            conn.createQuery(updateSql)
                .addParameter("ID_Categoria", ID_Categoria)
                .addParameter("Nombre_Categoria", Categoria.getNombre_Categoria())
                .addParameter("Descripcion_Categoria", Categoria.getDescripcion_Categoria())
                .executeUpdate();
            return "Se actualizó el Categoria";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar Categoria";
        }
    }

}