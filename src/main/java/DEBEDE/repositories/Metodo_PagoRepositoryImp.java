package DEBEDE.repositories;

import DEBEDE.models.Metodo_Pago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

@Repository
public class Metodo_PagoRepositoryImp implements Metodo_PagoRepository{

    @Autowired
    private Sql2o sql2o;

    @Override
    public Metodo_Pago crear(Metodo_Pago Metodo_Pago){
        try(Connection conn = sql2o.open()){
            String sql = "INSERT INTO Metodo_Pago (ID_Metodo_Pago,Tipo_Tarjeta,Numero_Tarjeta, Fecha, ID_Usuario)" +
                    "VALUES (:ID_Metodo_Pago, :Tipo_Tarjeta, :Numero_Tarjeta, :Fecha, :ID_Usuario)";
            conn.createQuery(sql, true)
                    .addColumnMapping("ID_Metodo_Pago", Metodo_Pago.getID_Metodo_Pago().toString())
                    .addParameter("Tipo_Tarjeta", Metodo_Pago.getTipo_Tarjeta())
                    .addParameter("numero_tarjeta", Metodo_Pago.getNumero_Tarjeta())
                    .addColumnMapping("Fecha", Metodo_Pago.getFecha().toString())
                    .addColumnMapping("ID_Usuario", Metodo_Pago.getID_Usuario().toString())
                    .executeUpdate();
            return Metodo_Pago;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Metodo_Pago> getAll() {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Metodo_Pago order by Numero_Tarjeta ASC")
                    .executeAndFetch(Metodo_Pago.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Metodo_Pago> show(Integer ID_Metodo_Pago) {
        try(Connection conn = sql2o.open()){
            return conn.createQuery("select * from Metodo_Pago where ID_Metodo_Pago = :ID_Metodo_Pago ")
                    .addParameter("ID_Metodo_Pago",ID_Metodo_Pago)
                    .executeAndFetch(Metodo_Pago.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(Integer ID_Metodo_Pago) {
        try(Connection conn = sql2o.open()){
            conn.createQuery("DELETE from Metodo_Pago where ID_Metodo_Pago = :ID_Metodo_Pago ")
                    .addParameter("ID_Metodo_Pago",ID_Metodo_Pago)
                    .executeUpdate();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public String update(Metodo_Pago Metodo_Pago, Integer ID_Metodo_Pago){
        try(Connection conn = sql2o.open()){
            String updateSql = "update Metodo_Pago set Tipo_Tarjeta=:Tipo_Tarjeta, Numero_Tarjeta=:Numero_Tarjeta, Fecha=:Fecha, ID_Usuario=:ID_Usuario WHERE ID_Metodo_Pago=:ID_Metodo_Pago";
            conn.createQuery(updateSql)
                    .addParameter("ID_Metodo_Pago", ID_Metodo_Pago)
                    .addParameter("Tipo_Tarjeta", Metodo_Pago.getTipo_Tarjeta())
                    .addParameter("Numero_Tarjeta", Metodo_Pago.getNumero_Tarjeta())
                    .addParameter("Fecha", Metodo_Pago.getFecha())
                    .addParameter("ID_Usuario", Metodo_Pago.getID_Usuario())

                    .executeUpdate();
            return "Se actualizó el Metodo_Pago";
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fallo al actualizar el Metodo_Pago";
        }
    }



}
