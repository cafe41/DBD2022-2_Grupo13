package DEBEDE.repositories;

import DEBEDE.models.Usuario;

import java.util.List;

public interface UsuarioRepository {
    /**
     * Inserta un Usuario en la tabla Usuario.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Usuario objeto de la clase Usuario que tiene los atributos correspondientes a insertar como Usuario.
     * @return retorna un Usuario que contiene al Usuario creado o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Usuario crear(Usuario Usuario);

    /**
     * Inserta datos en un Usuario en la tabla Usuario.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Usuario objeto de la clase Usuario que tiene los atributos correspondientes a insertar en un Usuario.
     * @param id_usuario integer correspondiente al id del Usuario al cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Usuario Usuario, Integer id_usuario);


    /**
     * Lista todos los Usuarios de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Usuarios que contiene las Usuarios o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Usuario> getAll();


    /**
     * Lista una Usuario con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_usuario identificador del Usuario que se desea mostrar.
     * @return retorna una lista de Usuarios que contiene al Usuario con la id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Usuario> show(Integer id_usuario);



    /**
     * Elimina un Usuario de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_usuario identificador del Usuario que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(Integer id_usuario);

}
