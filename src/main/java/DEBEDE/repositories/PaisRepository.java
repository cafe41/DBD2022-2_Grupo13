package DEBEDE.repositories;

import DEBEDE.models.Pais;

import java.util.List;

public interface PaisRepository {
    /**
     * Inserta un Pais en la tabla Pais.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Pais objeto de la clase Pais que tiene los atributos correspondientes a insertar como Pais.
     * @return retorna un Pais que contiene el Pais creado o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Pais crear(Pais Pais);

    /**
     * Inserta datos en un Pais en la tabla Pais.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Pais objeto de la clase Pais que tiene los atributos correspondientes a insertar en un Pais.
     * @param ID_Pais Integer correspondiente al id del Pais al cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Pais Pais, Integer ID_Pais);


    /**
     * Lista todos los Paises de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Paises que contiene los Paises o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Pais> getAll();


    /**
     * Lista un Pais con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param ID_Pais identificador del Pais que se desea mostrar.
     * @return retorna una lista de Paises que contiene el Pais con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Pais> show(Integer ID_Pais);



    /**
     * Elimina un Pais de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param ID_Pais identificador del Pais que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(Integer ID_Pais);
}
