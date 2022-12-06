package DEBEDE.repositories;

import DEBEDE.models.Pais;

import java.util.List;

public interface PaisRepository {
    /**
     * Inserta una Pais en la tabla Pais.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Pais objeto de la clase Pais que tiene los atributos correspondientes a insertar como Pais.
     * @return retorna una Pais que contiene la Pais creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Pais crear(Pais Pais);

    /**
     * Inserta datos en una Pais en la tabla Pais.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Pais objeto de la clase Pais que tiene los atributos correspondientes a insertar en una Pais.
     * @param id_Pais string alfanumerico correspondiente al id de la Pais  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Pais Pais, String id_Pais);


    /**
     * Lista todos las Paiss de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Pais que contiene las Paiss o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Pais> getAll();


    /**
     * Lista una Pais con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Pais identificador de la Pais que se desea mostrar.
     * @return retorna una lista de Pais que contiene la Pais con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Pais> show(String id_Pais);



    /**
     * Elimina una Pais de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Pais identificador de la Pais que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String id_Pais);
}
