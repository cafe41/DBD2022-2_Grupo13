package DEBEDE.repositories;

import DEBEDE.models.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository

public class RegionRepositoryImp implements RegionRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Region crear(Region Region){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Region (ID_Region,nombre_region)" +
                    "VALUES (:ID_Region,:nombre_region)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Region", Region.getID_Region().toString())
                    .addParameter("nombre_region", Region.getNombre_region())
                    .executeUpdate();
            return Region;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }



    @Override
    public List<Region> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Region order by id_region ASC")
                    .executeAndFetch(Region.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    @Override
    public List<Region> show(Integer ID_Region) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Region where ID_Region = :ID_Region ")
                    .addParameter("ID_Region",ID_Region)
                    .executeAndFetch(Region.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




    @Override
    public void delete(Integer ID_Region) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Region where ID_Region = :ID_Region ")
                    .addParameter("ID_Region",ID_Region)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    @Override
    public String update(Region Region, Integer ID_Region){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Region set nombre_region=:nombre_region WHERE ID_Region=:ID_Region";
            conn.createQuery(updateSql)
                    .addParameter("ID_Region", ID_Region)
                    .addParameter("nombre_region", Region.getNombre_region())
                    .executeUpdate();
            return "Se actualizo la Region";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar la Region";
        }
    }
}
