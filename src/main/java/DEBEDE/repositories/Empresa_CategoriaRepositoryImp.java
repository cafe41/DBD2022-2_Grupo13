package DEBEDE.repositories;

import DEBEDE.models.Empresa_Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository

public class Empresa_CategoriaRepositoryImp implements Empresa_CategoriaRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Empresa_Categoria crear(Empresa_Categoria Empresa_Categoria){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO empresa_categoria (ID_Empresa,ID_Categoria)" +
                    "VALUES (:ID_Empresa ,:ID_Categoria)";
            conn.createQuery(sql, true)
                    .addParameter("ID_Empresa", Empresa_Categoria.getID_Empresa())
                    .addParameter("ID_Categoria", Empresa_Categoria.getID_Categoria())
                    .executeUpdate();
            return Empresa_Categoria;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }



    @Override
    public List<Empresa_Categoria> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from empresa_categoria order by ID_Empresa_Categoria ASC")
                    .executeAndFetch(Empresa_Categoria.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Empresa_Categoria> show(Integer ID_Empresa_Categoria) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from empresa_categoria where ID_Empresa_Categoria = :ID_Empresa_Categoria ")
                    .addParameter("ID_Empresa_Categoria",ID_Empresa_Categoria)
                    .executeAndFetch(Empresa_Categoria.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




    @Override
    public void delete(Integer ID_Empresa_Categoria) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from empresa_categoria where ID_Empresa_Categoria = :ID_Empresa_Categoria ")
                    .addParameter("ID_Empresa_Categoria",ID_Empresa_Categoria)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    @Override
    public String update(Empresa_Categoria Empresa_Categoria, Integer ID_Empresa_Categoria){
        try(Connection conn = sql2o.open()){
            String updateSql = "update empresa_categoria set ID_Empresa=:ID_Empresa, ID_Empresa=:ID_Categoria WHERE ID_Empresa_Categoria=:ID_Empresa_Categoria";
            conn.createQuery(updateSql)
                    .addParameter("ID_Empresa_Categoria", ID_Empresa_Categoria)
                    .addParameter("ID_Empresa", Empresa_Categoria.getID_Empresa())
                    .addParameter("ID_Categoria", Empresa_Categoria.getID_Categoria())
                    .executeUpdate();
            return "Se actualizo la Empresa_Categoria";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar la Empresa_Categoria";
        }
    }
}
