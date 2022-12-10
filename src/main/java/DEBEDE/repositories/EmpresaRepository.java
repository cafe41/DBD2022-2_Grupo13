package DEBEDE.repositories;

import DEBEDE.models.Empresa;
import DEBEDE.models.Empresa;

import java.util.List;

public interface EmpresaRepository {

        /**
         * Inserta una Empresa en la tabla Empresa.
         * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
         * una excepción o si la conexion falla .
         *
         * @param Empresa objeto de la clase Empresa que tiene los atributos correspondientes a insertar como Empresa.
         * @return retorna una Empresa que contiene la Empresa creada o null si se lanza excepcion.
         * @throws Exception Si uno de los atributos es null o vacio.
         */
        public Empresa crear(Empresa Empresa);

        /**
         * Inserta datos en una Empresa en la tabla Empresa.
         * Al ser el todos sus atributos obligatorios (excepto id), si son nulos o vacíos se lanzará
         * una excepción, si la conexion falla o si no encuentra el id.
         *
         * @param Empresa objeto de la clase Empresa que tiene los atributos correspondientes a insertar en una Empresa.
         * @param id_Empresa string alfanumerico correspondiente al id de la Empresa  a la cual se desea insertar datos.
         * @return retorna un string que indica el exito de la actualización de los datos.
         * @throws Exception Si uno de los atributos es null o vacio o si no encuentra el id.
         */
        public String update(Empresa Empresa, String id_Empresa);


        /**
         * Lista todos las Empresas de la base de datos ascendente por nombre.
         * Si la conexion falla lanzará excepción.
         *
         * @return retorna una lista de Empresa que contiene las Empresas o null si se lanza excepcion.
         * @throws Exception Si la conexion falla.
         */
        public List<Empresa> getAll();


        /**
         * Lista una Empresa con un id especifico de la base de datos.
         * Si la conexion falla o si no encuentra el id lanzará excepción.
         *
         * @param id_Empresa identificador de la Empresa que se desea mostrar.
         * @return retorna una lista de Empresa que contiene la Empresa con el id solicitado o null si se lanza excepcion.
         * @throws Exception Si la conexion falla o si no encuentra el id.
         */
        public List<Empresa> show(String id_Empresa);



        /**
         * Elimina una Empresa de la base de datos por su id.
         * Si la conexion falla o si no encuentra el id lanzará excepción.
         *
         * @param id_Empresa identificador de la Empresa que se desea eliminar.
         * @throws Exception Si la conexion falla o si no encuentra el id.
         */
        public void delete(String id_Empresa);

}
