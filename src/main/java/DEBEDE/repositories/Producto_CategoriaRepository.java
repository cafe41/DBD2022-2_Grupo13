package DEBEDE.repositories;

import DEBEDE.models.Producto_Categoria;

import java.util.List;

public interface Producto_CategoriaRepository {
    /**
     * Inserta una Producto_Categoria en la tabla Producto_Categoria.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Producto_Categoria objeto de la clase Producto_Categoria que tiene los atributos correspondientes a insertar como Producto_Categoria.
     * @return retorna una Producto_Categoria que contiene la Producto_Categoria creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Producto_Categoria crear(Producto_Categoria Producto_Categoria);

    /**
     * Inserta datos en una Producto_Categoria en la tabla Producto_Categoria.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Producto_Categoria objeto de la clase Producto_Categoria que tiene los atributos correspondientes a insertar en una Producto_Categoria.
     * @param id_Producto_Categoria string alfanumerico correspondiente al id de la Producto_Categoria  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Producto_Categoria Producto_Categoria, String id_Producto_Categoria);


    /**
     * Lista todos las Producto_Categorias de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Producto_Categoria que contiene las Producto_Categorias o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Producto_Categoria> getAll();


    /**
     * Lista una Producto_Categoria con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Producto_Categoria identificador de la Producto_Categoria que se desea mostrar.
     * @return retorna una lista de Producto_Categoria que contiene la Producto_Categoria con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Producto_Categoria> show(String id_Producto_Categoria);



    /**
     * Elimina una Producto_Categoria de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Producto_Categoria identificador de la Producto_Categoria que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String id_Producto_Categoria);
}
