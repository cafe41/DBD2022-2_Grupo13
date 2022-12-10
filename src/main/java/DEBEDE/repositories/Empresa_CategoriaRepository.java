package DEBEDE.repositories;

import DEBEDE.models.Empresa_Categoria;

import java.util.List;

public interface Empresa_CategoriaRepository {
    /**
     * Inserta una Empresa_Categoria en la tabla Empresa_Categoria.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Empresa_Categoria objeto de la clase Empresa_Categoria que tiene los atributos correspondientes a insertar como Empresa_Categoria.
     * @return retorna una Empresa_Categoria que contiene la Empresa_Categoria creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Empresa_Categoria crear(Empresa_Categoria Empresa_Categoria);

    /**
     * Inserta datos en una Empresa_Categoria en la tabla Empresa_Categoria.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Empresa_Categoria objeto de la clase Empresa_Categoria que tiene los atributos correspondientes a insertar en una Empresa_Categoria.
     * @param id_Empresa_Categoria string alfanumerico correspondiente al id de la Empresa_Categoria  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Empresa_Categoria Empresa_Categoria, String id_Empresa_Categoria);


    /**
     * Lista todos las Empresa_Categorias de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Empresa_Categoria que contiene las Empresa_Categorias o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Empresa_Categoria> getAll();


    /**
     * Lista una Empresa_Categoria con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Empresa_Categoria identificador de la Empresa_Categoria que se desea mostrar.
     * @return retorna una lista de Empresa_Categoria que contiene la Empresa_Categoria con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Empresa_Categoria> show(String id_Empresa_Categoria);



    /**
     * Elimina una Empresa_Categoria de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Empresa_Categoria identificador de la Empresa_Categoria que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String id_Empresa_Categoria);
    
}
