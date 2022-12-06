package DEBEDE.repositories;

import DEBEDE.models.Favoritos;

import java.util.List;

public interface FavoritosRepository {
    /**
     * Inserta una Favoritos en la tabla Favoritos.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Favoritos objeto de la clase Favoritos que tiene los atributos correspondientes a insertar como Favoritos.
     * @return retorna una Favoritos que contiene la Favoritos creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Favoritos crear(Favoritos Favoritos);

    /**
     * Inserta datos en una Favoritos en la tabla Favoritos.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Favoritos objeto de la clase Favoritos que tiene los atributos correspondientes a insertar en una Favoritos.
     * @param id_Favoritos string alfanumerico correspondiente al id de la Favoritos  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Favoritos Favoritos, String id_Favoritos);


    /**
     * Lista todos las Favoritoss de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Favoritos que contiene las Favoritoss o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Favoritos> getAll();


    /**
     * Lista una Favoritos con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Favoritos identificador de la Favoritos que se desea mostrar.
     * @return retorna una lista de Favoritos que contiene la Favoritos con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Favoritos> show(String id_Favoritos);



    /**
     * Elimina una Favoritos de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Favoritos identificador de la Favoritos que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String id_Favoritos);
}
