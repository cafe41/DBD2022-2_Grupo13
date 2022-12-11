package DEBEDE.repositories;

import DEBEDE.models.Favoritos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class FavoritosRepositoryImp implements FavoritosRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Favoritos crear(Favoritos Favoritos){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Favoritos (ID_Favorito,ID_Usuario)" +
                    "VALUES (:ID_Favorito, :ID_Usuario)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Favorito", Favoritos.getID_Favorito().toString())
                    .addColumnMapping("ID_Usuario", Favoritos.getID_Usuario().toString())

                    .executeUpdate();
            return Favoritos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Favoritos> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Favoritos order by ID_Favorito ASC")
                    .executeAndFetch(Favoritos.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Favoritos> show(Integer ID_Favorito) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Boleta where ID_Favorito = :ID_Favorito ")
                    .addParameter("ID_Favorito",ID_Favorito)
                    .executeAndFetch(Favoritos.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(Integer ID_Favorito) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Favoritos where ID_Favorito = :ID_Favorito ")
                    .addParameter("ID_Favorito",ID_Favorito)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public String update(Favoritos Favoritos, Integer ID_Favorito){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Favoritos set ID_Usuario=:ID_Usuario WHERE ID_Favorito=:ID_Favorito";
            conn.createQuery(updateSql)
                    .addParameter("ID_Favorito", ID_Favorito)
                    .addParameter("ID_Usuario", Favoritos.getID_Usuario())

                    .executeUpdate();
            return "Se actualizó el Favoritos";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Favoritos";
        }
    }



}
