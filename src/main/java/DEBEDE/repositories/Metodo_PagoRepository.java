package DEBEDE.repositories;

import DEBEDE.models.Metodo_Pago;

import java.util.List;

public interface Metodo_PagoRepository {
    /**
     * Inserta un Metodo_Pago en la tabla Metodo_Pago.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Metodo_Pago objeto de la clase Metodo_Pago que tiene los atributos correspondientes a insertar como Metodo_Pago.
     * @return retorna un Metodo_Pago que contiene el Metodo_Pago creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Metodo_Pago crear(Metodo_Pago Metodo_Pago);

    /**
     * Inserta datos en un Metodo_Pago en la tabla Metodo_Pago.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Metodo_Pago objeto de la clase Metodo_Pago que tiene los atributos correspondientes a insertar en un Metodo_Pago.
     * @param ID_Metodo_Pago Integer correspondiente al id del Metodo_Pago al cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Metodo_Pago Metodo_Pago, Integer ID_Metodo_Pago);


    /**
     * Lista todos las Metodo_Pago de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Metodo_Pagos que contiene las Metodo_Pagos o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Metodo_Pago> getAll();


    /**
     * Lista un Metodo_Pago con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param ID_Metodo_Pago identificador del Metodo_Pagos que se desea mostrar.
     * @return retorna una lista de Metodo_Pagos que contiene el Metodo_Pago con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Metodo_Pago> show(Integer ID_Metodo_Pago);



    /**
     * Elimina una Metodo_Pago de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param ID_Metodo_Pago identificador del Metodo_Pago que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(Integer ID_Metodo_Pago);

}
