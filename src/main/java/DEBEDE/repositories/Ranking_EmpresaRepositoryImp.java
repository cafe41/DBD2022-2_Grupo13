package DEBEDE.repositories;

import DEBEDE.models.Ranking_Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Ranking_EmpresaRepositoryImp implements Ranking_EmpresaRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Ranking_Empresa crear(Ranking_Empresa Ranking_Empresa){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Ranking_Empresa (ID_Ranking,cantidad_ventas,ranking)" +
                    "VALUES (:Ranking_Empresa, :cantidad_ventas, :ranking)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Ranking", Ranking_Empresa.getID_Ranking().toString())
                    .addParameter("cantidad_ventas", Ranking_Empresa.getCantidad_ventas())
                    .addParameter("ranking", Ranking_Empresa.getRanking())
                    .executeUpdate();
            return Ranking_Empresa;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Ranking_Empresa> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Ranking_Empresa order by ranking ASC")
                    .executeAndFetch(Ranking_Empresa.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Ranking_Empresa> show(Integer ID_Ranking) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Ranking_Empresa where ID_Ranking = :ID_Ranking ")
                    .addParameter("ID_Ranking",ID_Ranking)
                    .executeAndFetch(Ranking_Empresa.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(Integer ID_Ranking) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Ranking_Empresa where ID_Ranking = :ID_Ranking ")
                    .addParameter("ID_Ranking",ID_Ranking)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public String update(Ranking_Empresa Ranking_Empresa, Integer ID_Ranking){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Ranking_Empresa set cantidad_ventas=:cantidad_ventas, ranking=:ranking WHERE ID_Ranking=:ID_Ranking";
            conn.createQuery(updateSql)
                    .addParameter("ID_Ranking", ID_Ranking)
                    .addParameter("cantidad_ventas", Ranking_Empresa.getCantidad_ventas())
                    .addParameter("ranking", Ranking_Empresa.getRanking())

                    .executeUpdate();
            return "Se actualizó el Ranking_Empresa";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Ranking_Empresa";
        }
    }



}
