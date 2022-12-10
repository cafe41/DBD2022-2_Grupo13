package DEBEDE.repositories;

import DEBEDE.models.Ranking_Empresa;

import java.util.List;

public interface Ranking_EmpresaRepository {
    /**
     * Inserta una Ranking_Empresa en la tabla Ranking_Empresa.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Ranking_Empresa objeto de la clase Ranking_Empresa que tiene los atributos correspondientes a insertar como Ranking_Empresa.
     * @return retorna una Ranking_Empresa que contiene la Ranking_Empresa creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Ranking_Empresa crear(Ranking_Empresa Ranking_Empresa);

    /**
     * Inserta datos en una Ranking_Empresa en la tabla Ranking_Empresa.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Ranking_Empresa objeto de la clase Ranking_Empresa que tiene los atributos correspondientes a insertar en una Ranking_Empresa.
     * @param id_Ranking_Empresa string alfanumerico correspondiente al id de la Ranking_Empresa  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Ranking_Empresa Ranking_Empresa, String id_Ranking_Empresa);


    /**
     * Lista todos las Ranking_Empresas de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Ranking_Empresa que contiene las Ranking_Empresas o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Ranking_Empresa> getAll();


    /**
     * Lista una Ranking_Empresa con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Ranking_Empresa identificador de la Ranking_Empresa que se desea mostrar.
     * @return retorna una lista de Ranking_Empresa que contiene la Ranking_Empresa con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Ranking_Empresa> show(String id_Ranking_Empresa);



    /**
     * Elimina una Ranking_Empresa de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Ranking_Empresa identificador de la Ranking_Empresa que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String id_Ranking_Empresa);
}
