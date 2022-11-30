package DEBEDE.repositories;

import DEBEDE.models.Boleta;
import cl.DBD.ejemplo.models.Boleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class BoletaRepositoryImp implements BoletaRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Boleta crear(Boleta Boleta){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Boleta (id_boleta,tipo_tarjeta,numero_tarjeta,monto,fecha,id_usuario,id_empresa)" +
                    "VALUES (id_boleta, :tipo_tarjeta, :numero_tarjeta, :monto, fecha, id_usuario, id_empresa)";
            conn.createQuery(sql, true)
                    .addColumnMapping("id_boleta", Boleta.getId_boleta())
                    .addParameter("tipo_tarjeta", Boleta.getTipo_tarjeta())
                    .addParameter("numero_tarjeta", Boleta.getNumero_tarjeta())
                    .addParameter("monto", Boleta.getMonto())
                    .addColumnMapping("fecha", Boleta.getFecha())
                    .addColumnMapping("id_usuario", Boleta.getId_usuario())
                    .addColumnMapping("id_empresa", Boleta.getId_empresa())
                    .executeUpdate();
            return Boleta;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Boleta> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Boleta order by monto ASC")
                    .executeAndFetch(Boleta.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Boleta> show(String id_boleta) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Boleta where id_boleta = :id_boleta ")
                    .addParameter("id_boleta",id_boleta)
                    .executeAndFetch(Boleta.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(String id_boleta) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Boleta where id_boleta = :id_boleta ")
                    .addParameter("id_boleta",id_boleta)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public String update(Boleta Boleta, String id_boleta){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Boleta set tipo_tarjeta=:tipo_tarjeta, numero_tarjeta=:numero_tarjeta, monto=:monto, fecha=:fecha , id_usuario=:id_usuario ,id_empresa=:id_empresa WHERE id_boleta=:id_boleta";
            conn.createQuery(updateSql)
                    .addParameter("id_boleta", id_boleta)
                    .addParameter("tipo_tarjeta", Boleta.getTipo_tarjeta())
                    .addParameter("numero_tarjeta", Boleta.getNumero_tarjeta())
                    .addParameter("monto", Boleta.getMonto())
                    .addParameter("fecha", Boleta.getFecha())
                    .addParameter("id_usuario", Boleta.getId_usuario())
                    .addParameter("id_empresa", Boleta.getId_empresa())

                    .executeUpdate();
            return "Se actualizó la Boleta";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar La Boleta";
        }
    }



}
