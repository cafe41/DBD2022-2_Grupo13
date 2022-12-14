package DEBEDE.repositories;

import DEBEDE.models.Valoracion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class ValoracionRepositoryImp implements ValoracionRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Valoracion crear(Valoracion Valoracion){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Valoracion (cantidad_estrellas,desc_valoracion,ID_Usuario,ID_Empresa)" +
                    "VALUES (:cantidad_estrellas, :desc_valoracion, :ID_Usuario, :ID_Empresa)";
            conn.createQuery(sql, true)
                    .addParameter("cantidad_estrellas", Valoracion.getCantidad_estrellas())
                    .addParameter("desc_valoracion", Valoracion.getDesc_valoracion())
                    .addParameter("ID_Usuario", Valoracion.getID_Usuario())
                    .addParameter("ID_Empresa", Valoracion.getID_Empresa())
                    .executeUpdate();
            return Valoracion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Valoracion> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Valoracion order by cantidad_estrellas ASC")
                    .executeAndFetch(Valoracion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Valoracion> show(Integer ID_Valoracion) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Valoracion where ID_Valoracion = :ID_Valoracion ")
                    .addParameter("ID_Valoracion",ID_Valoracion)
                    .executeAndFetch(Valoracion.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(Integer ID_Valoracion) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Valoracion where ID_Valoracion = :ID_Valoracion ")
                    .addParameter("ID_Valoracion",ID_Valoracion)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public String update(Valoracion Valoracion, Integer ID_Valoracion){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Valoracion set cantidad_estrellas=:cantidad_estrellas, desc_valoracion=:desc_valoracion, ID_Usuario=:ID_Usuario, ID_Empresa=:ID_Empresa WHERE ID_Valoracion=:ID_Valoracion";
            conn.createQuery(updateSql)
                    .addParameter("ID_Valoracion", ID_Valoracion)
                    .addParameter("cantidad_estrellas", Valoracion.getCantidad_estrellas())
                    .addParameter("desc_valoracion", Valoracion.getDesc_valoracion())
                    .addParameter("ID_Usuario", Valoracion.getID_Usuario())
                    .addParameter("ID_Empresa", Valoracion.getID_Empresa())

                    .executeUpdate();
            return "Se actualizó la Valoracion";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar La Valoracion";
        }
    }



}
