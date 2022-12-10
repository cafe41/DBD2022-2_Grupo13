package DEBEDE.repositories;

import DEBEDE.models.Pais_Empresa;

import java.util.List;

public interface Pais_EmpresaRepository {
    /**
     * Inserta una Pais_Empresa en la tabla Pais_Empresa.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Pais_Empresa objeto de la clase Pais_Empresa que tiene los atributos correspondientes a insertar como Pais_Empresa.
     * @return retorna una Pais_Empresa que contiene la Pais_Empresa creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Pais_Empresa crear(Pais_Empresa Pais_Empresa);

    /**
     * Inserta datos en una Pais_Empresa en la tabla Pais_Empresa.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Pais_Empresa objeto de la clase Pais_Empresa que tiene los atributos correspondientes a insertar en una Pais_Empresa.
     * @param id_Pais_Empresa string alfanumerico correspondiente al id de la Pais_Empresa  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Pais_Empresa Pais_Empresa, Integer id_Pais_Empresa);


    /**
     * Lista todos las Pais_Empresas de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Pais_Empresa que contiene las Pais_Empresas o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Pais_Empresa> getAll();


    /**
     * Lista una Pais_Empresa con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Pais_Empresa identificador de la Pais_Empresa que se desea mostrar.
     * @return retorna una lista de Pais_Empresa que contiene la Pais_Empresa con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Pais_Empresa> show(Integer id_Pais_Empresa);



    /**
     * Elimina una Pais_Empresa de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Pais_Empresa identificador de la Pais_Empresa que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(Integer id_Pais_Empresa);
}
