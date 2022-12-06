package DEBEDE.repositories;

import DEBEDE.models.Rol_Usuario;

import java.util.List;

public interface Rol_UsuarioRepository {
    /**
     * Inserta una Rol_Usuario en la tabla Rol_Usuario.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Rol_Usuario objeto de la clase Rol_Usuario que tiene los atributos correspondientes a insertar como Rol_Usuario.
     * @return retorna una Rol_Usuario que contiene la Rol_Usuario creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Rol_Usuario crear(Rol_Usuario Rol_Usuario);

    /**
     * Inserta datos en una Rol_Usuario en la tabla Rol_Usuario.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Rol_Usuario objeto de la clase Rol_Usuario que tiene los atributos correspondientes a insertar en una Rol_Usuario.
     * @param id_Rol_Usuario string alfanumerico correspondiente al id de la Rol_Usuario  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Rol_Usuario Rol_Usuario, String id_Rol_Usuario);


    /**
     * Lista todos las Rol_Usuarios de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Rol_Usuario que contiene las Rol_Usuarios o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Rol_Usuario> getAll();


    /**
     * Lista una Rol_Usuario con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Rol_Usuario identificador de la Rol_Usuario que se desea mostrar.
     * @return retorna una lista de Rol_Usuario que contiene la Rol_Usuario con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Rol_Usuario> show(String id_Rol_Usuario);



    /**
     * Elimina una Rol_Usuario de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Rol_Usuario identificador de la Rol_Usuario que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String id_Rol_Usuario);
}
