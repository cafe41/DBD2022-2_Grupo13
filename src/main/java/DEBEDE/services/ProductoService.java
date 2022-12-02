package DEBEDE.services;

import DEBEDE.models.Producto;
import DEBEDE.repositories.ProductoRepository;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@CrossOrigin
@RestController
public class ProductoService {
    private final ProductoRepository productoRepository;

    ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    @PostMapping("/producto")
    @ResponseBody
    public Producto crear(@RequestBody Producto producto){
        return productoRepository.crear(producto);
    }
    


    // leer R
    @GetMapping("/producto")
    public List<Producto> getAllProductos(){
        return productoRepository.getAll();
    }
    @GetMapping("/producto/{ID_Producto}")
    public List<Producto> getProducto(@PathVariable Integer ID_Producto){
        return productoRepository.show(ID_Producto);
    }

    @GetMapping("/producto/precioMaximo/{precio}")
    public List<Producto> getProductoLessThan(@PathVariable Integer precio){
        return productoRepository.showLessThan(precio);
    }

    @GetMapping("/producto/{ID_Empresa}")
    public List<Producto> getProductoByID_Empresa(@PathVariable Integer ID_Empresa){
        return productoRepository.showByID_Empresa(ID_Empresa);
    }
    

    // actualizar U
    @PutMapping("/producto/{ID_Producto}")
    @ResponseBody
    public String updateProducto(@RequestBody Producto producto, @PathVariable Integer ID_Producto){
        return productoRepository.update(producto,ID_Producto);
    }
    
    // borrar D
    @DeleteMapping("/producto/{ID_Producto}")
    public void borrar(@PathVariable Integer ID_Producto){
        productoRepository.delete(ID_Producto);
    }
}
