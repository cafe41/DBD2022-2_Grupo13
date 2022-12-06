package DEBEDE.repositories;

import DEBEDE.models.Usuario_Producto;

import java.util.List;

public interface Usuario_ProductoRepository {
    /**
     * Inserta una Usuario_Producto en la tabla Usuario_Producto.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción o si la conexion falla .
     *
     * @param Usuario_Producto objeto de la clase Usuario_Producto que tiene los atributos correspondientes a insertar como Usuario_Producto.
     * @return retorna una Usuario_Producto que contiene la Usuario_Producto creada o null si se lanza excepcion.
     * @throws Exception Si uno de los atributos es null o vacio.
     */
    public Usuario_Producto crear(Usuario_Producto Usuario_Producto);

    /**
     * Inserta datos en una Usuario_Producto en la tabla Usuario_Producto.
     * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
     * una excepción, si la conexion falla o si no encuentra el id.
     *
     * @param Usuario_Producto objeto de la clase Usuario_Producto que tiene los atributos correspondientes a insertar en una Usuario_Producto.
     * @param id_Usuario_Producto string alfanumerico correspondiente al id de la Usuario_Producto  a la cual se desea insertar datos.
     * @return retorna un string que indica el exito de la actualización de los datos.
     * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
     */
    public String update(Usuario_Producto Usuario_Producto, String id_Usuario_Producto);


    /**
     * Lista todos las Usuario_Productos de la base de datos ascendente por nombre.
     * Si la conexion falla lanzará excepción.
     *
     * @return retorna una lista de Usuario_Producto que contiene las Usuario_Productos o null si se lanza excepcion.
     * @throws Exception Si la conexion falla.
     */
    public List<Usuario_Producto> getAll();


    /**
     * Lista una Usuario_Producto con un id especifico de la base de datos.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Usuario_Producto identificador de la Usuario_Producto que se desea mostrar.
     * @return retorna una lista de Usuario_Producto que contiene la Usuario_Producto con el id solicitado o null si se lanza excepcion.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public List<Usuario_Producto> show(String id_Usuario_Producto);



    /**
     * Elimina una Usuario_Producto de la base de datos por su id.
     * Si la conexion falla o si no encuentra el id lanzará excepción.
     *
     * @param id_Usuario_Producto identificador de la Usuario_Producto que se desea eliminar.
     * @throws Exception Si la conexion falla o si no encuentra el id.
     */
    public void delete(String id_Usuario_Producto);
}
