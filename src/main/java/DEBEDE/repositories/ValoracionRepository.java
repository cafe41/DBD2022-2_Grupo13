package DEBEDE.repositories;

import DEBEDE.models.Valoracion;

import java.util.List;

public interface ValoracionRepository {
    /**
     * Inserta una Valoracion en la tabla Valoracion.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Valoracion objeto de la clase Valoracion que tiene los atributos correspondientes a insertar como Valoracion.
     * @return retorna una Valoracion que contiene la Valoracion creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Valoracion crear(Valoracion Valoracion);

    /**
     * Inserta datos en una Valoracion en la tabla Valoracion.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Valoracion objeto de la clase Valoracion que tiene los atributos correspondientes a insertar en una Valoracion.
     * @param id_Valoracion string alfanumerico correspondiente al id de la Valoracion  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Valoracion Valoracion, String id_Valoracion);


    /**
     * Lista todos las Valoracions de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Valoracion que contiene las Valoracions o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Valoracion> getAll();


    /**
     * Lista una Valoracion con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Valoracion identificador de la Valoracion que se desea mostrar.
     * @return retorna una lista de Valoracion que contiene la Valoracion con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Valoracion> show(String id_Valoracion);



    /**
     * Elimina una Valoracion de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Valoracion identificador de la Valoracion que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String id_Valoracion);
}
