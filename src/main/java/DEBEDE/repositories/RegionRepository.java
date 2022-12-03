package DEBEDE.repositories;

import DEBEDE.models.Region;

import java.util.List;

public interface RegionRepository {
    /**
     * Inserta una Region en la tabla Region.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Region objeto de la clase Region que tiene los atributos correspondientes a insertar como Region.
     * @return retorna una Region que contiene la Region creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Region crear(Region Region);

    /**
     * Inserta datos en una Region en la tabla Region.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Region objeto de la clase Region que tiene los atributos correspondientes a insertar en una Region.
     * @param ID_Region Integer correspondiente al id de la Region a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Region Region, Integer ID_Region);


    /**
     * Lista todas las Region de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Regiones que contiene las Regiones o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Region> getAll();


    /**
     * Lista una Region con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param ID_Region identificador de la Region que se desea mostrar.
     * @return retorna una lista de Regiones que contiene la Region con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Region> show(Integer ID_Region);



    /**
     * Elimina una Region de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param ID_Region identificador de la Region que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(Integer ID_Region);
}
