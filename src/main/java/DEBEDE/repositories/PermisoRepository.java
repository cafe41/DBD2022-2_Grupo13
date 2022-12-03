package DEBEDE.repositories;

import DEBEDE.models.Permiso;

import java.util.List;

public interface PermisoRepository {
    /**
     * Inserta un Permiso en la tabla Permiso.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Permiso objeto de la clase Permiso que tiene los atributos correspondientes a insertar como Permiso.
     * @return retorna un Permiso que contiene el Permiso creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Permiso crear(Permiso Permiso);

    /**
     * Inserta datos en un Permiso en la tabla Permiso.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Permiso objeto de la clase Permiso que tiene los atributos correspondientes a insertar en un Permiso.
     * @param ID_Permiso Integer correspondiente al id del Permiso  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Permiso Permiso, Integer ID_Permiso);


    /**
     * Lista todos los Permisos de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Permisos que contiene los Permisos o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Permiso> getAll();


    /**
     * Lista unos Permiso con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param ID_Permiso identificador del Permiso que se desea mostrar.
     * @return retorna una lista de Permisos que contiene el Permiso con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Permiso> show(Integer ID_Permiso);



    /**
     * Elimina un Permiso de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param ID_Permiso identificador del Permiso que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String ID_Permiso);

}
