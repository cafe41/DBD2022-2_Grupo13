package DEBEDE.repositories;

import DEBEDE.models.Rol;

import java.util.List;

public interface RolRepository {
    /**
     * Inserta un Rol en la tabla Rol.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Rol objeto de la clase Rol que tiene los atributos correspondientes a insertar como Rol.
     * @return retorna un Rol que contiene el Rol creado o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Rol crear(Rol Rol);

    /**
     * Inserta datos en un Rol en la tabla Rol.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Rol objeto de la clase Rol que tiene los atributos correspondientes a insertar en un Rol.
     * @param id_rol string alfanumerico correspondiente al id del Rol al cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Rol Rol, String id_rol);


    /**
     * Lista todos los Roles de la base de datos ascendente por Descripcion.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Rol que contiene los Roles o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Rol> getAll();


    /**
     * Lista un Rol con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_rol identificador del Rol que se desea mostrar.
     * @return retorna una lista de Categoria que contiene el Rol con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Rol> show(String id_rol);



    /**
     * Elimina un Rol de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_rol identificador del Categoria que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String id_rol);
}
