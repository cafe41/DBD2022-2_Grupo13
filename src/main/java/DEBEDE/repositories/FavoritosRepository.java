package DEBEDE.repositories;

import DEBEDE.models.Favoritos;

import java.util.List;

public interface FavoritosRepository {
    /**
     * Inserta un Favoritos en la tabla Favoritos.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Favoritos objeto de la clase Favoritos que tiene los atributos correspondientes a insertar como Favoritos.
     * @return retorna un Favoritos que contiene el Favoritos creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Favoritos crear(Favoritos Favoritos);

    /**
     * Inserta datos en un Favoritos en la tabla Favoritos.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Favoritos objeto de la clase Favoritos que tiene los atributos correspondientes a insertar en unos Favoritos.
     * @param ID_Favorito Integer correspondiente al id de los Favoritos  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Favoritos Favoritos, Integer ID_Favorito);


    /**
     * Lista todos los Favoritos de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Favoritos que contiene los Favoritos o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Favoritos> getAll();


    /**
     * Lista unos Favoritos con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param  ID_Favorito identificador de los Favoritos que se desea mostrar.
     * @return retorna una lista de Favoritos que contiene los Favoritos con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Favoritos> show(Integer ID_Favorito);



    /**
     * Elimina un Favorito de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param ID_Favorito identificador de los Favoritos que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(Integer ID_Favorito);

}
