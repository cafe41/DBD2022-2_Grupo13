package DEBEDE.repositories;

import DEBEDE.models.Permiso_Rol;

import java.util.List;

public interface Permiso_RolRepository {
    /**
     * Inserta una Permiso_Rol en la tabla Permiso_Rol.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Permiso_Rol objeto de la clase Permiso_Rol que tiene los atributos correspondientes a insertar como Permiso_Rol.
     * @return retorna una Permiso_Rol que contiene la Permiso_Rol creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Permiso_Rol crear(Permiso_Rol Permiso_Rol);

    /**
     * Inserta datos en una Permiso_Rol en la tabla Permiso_Rol.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Permiso_Rol objeto de la clase Permiso_Rol que tiene los atributos correspondientes a insertar en una Permiso_Rol.
     * @param id_Permiso_Rol string alfanumerico correspondiente al id de la Permiso_Rol  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Permiso_Rol Permiso_Rol, Integer id_Permiso_Rol);


    /**
     * Lista todos las Permiso_Rols de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Permiso_Rol que contiene las Permiso_Rols o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Permiso_Rol> getAll();


    /**
     * Lista una Permiso_Rol con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Permiso_Rol identificador de la Permiso_Rol que se desea mostrar.
     * @return retorna una lista de Permiso_Rol que contiene la Permiso_Rol con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Permiso_Rol> show(Integer id_Permiso_Rol);



    /**
     * Elimina una Permiso_Rol de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Permiso_Rol identificador de la Permiso_Rol que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(Integer id_Permiso_Rol);
}
