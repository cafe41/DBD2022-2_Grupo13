package DEBEDE.repositories;

import DEBEDE.models.Favoritos_Empresa;

import java.util.List;

public interface Favoritos_EmpresaRepository {
    /**
     * Inserta una Favoritos_Empresa en la tabla Favoritos_Empresa.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Favoritos_Empresa objeto de la clase Favoritos_Empresa que tiene los atributos correspondientes a insertar como Favoritos_Empresa.
     * @return retorna una Favoritos_Empresa que contiene la Favoritos_Empresa creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Favoritos_Empresa crear(Favoritos_Empresa Favoritos_Empresa);

    /**
     * Inserta datos en una Favoritos_Empresa en la tabla Favoritos_Empresa.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Favoritos_Empresa objeto de la clase Favoritos_Empresa que tiene los atributos correspondientes a insertar en una Favoritos_Empresa.
     * @param id_Favoritos_Empresa string alfanumerico correspondiente al id de la Favoritos_Empresa  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Favoritos_Empresa Favoritos_Empresa, Integer id_Favoritos_Empresa);


    /**
     * Lista todos las Favoritos_Empresas de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Favoritos_Empresa que contiene las Favoritos_Empresas o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Favoritos_Empresa> getAll();


    /**
     * Lista una Favoritos_Empresa con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Favoritos_Empresa identificador de la Favoritos_Empresa que se desea mostrar.
     * @return retorna una lista de Favoritos_Empresa que contiene la Favoritos_Empresa con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Favoritos_Empresa> show(Integer id_Favoritos_Empresa);



    /**
     * Elimina una Favoritos_Empresa de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Favoritos_Empresa identificador de la Favoritos_Empresa que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(Integer id_Favoritos_Empresa);
}
