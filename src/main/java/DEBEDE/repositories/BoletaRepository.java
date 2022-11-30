package DEBEDE.repositories;

import DEBEDE.models.Boleta;

import java.util.List;

public interface BoletaRepository {
    /**
     * Inserta una Boleta en la tabla Boleta.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Boleta objeto de la clase Boleta que tiene los atributos correspondientes a insertar como Boleta.
     * @return retorna una Boleta que contiene la Boleta creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Boleta crear(Boleta Boleta);

    /**
     * Inserta datos en una Boleta en la tabla Boleta.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Boleta objeto de la clase Boleta que tiene los atributos correspondientes a insertar en una Boleta.
     * @param id_boleta string alfanumerico correspondiente al id de la Boleta  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Boleta Boleta, String id_boleta);


    /**
     * Lista todos las Boletas de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Boleta que contiene las Boletas o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Boleta> getAll();


    /**
     * Lista una Boleta con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_boleta identificador de la Boleta que se desea mostrar.
     * @return retorna una lista de Boleta que contiene la Boleta con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Boleta> show(String id_boleta);



    /**
     * Elimina una Boleta de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_boleta identificador de la Boleta que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String id_boleta);

}
