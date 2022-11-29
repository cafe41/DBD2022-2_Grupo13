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
        Producto resultado = productoRepository.crear(producto);
        return resultado;
    }
    


    // leer R
    @GetMapping("/producto")
    public List<Producto> getAllProductos(){
        return productoRepository.getAll();
    }
    //miercoles enero 2022
    @GetMapping("/producto/{id}")
    public List<Producto> getProducto(@PathVariable String id){
        return productoRepository.show(id);
    }

    @GetMapping("/producto/precioMaximo/{precio}")
    public List<Producto> getProductoLessThan(@PathVariable Integer precio){
        return productoRepository.showLessThan(precio);
    }

    @GetMapping("/producto/categoria/{categoria}")
    public List<Producto> getProductoByCategorie(@PathVariable int categoria){
        return productoRepository.showByCategorie(categoria);
    }
    

    // actualizar U
    @PutMapping("/producto/{id}")
    @ResponseBody
    public String updateProducto(@RequestBody Producto producto, @PathVariable String id){
        String retorno = productoRepository.update(producto,id);
        return retorno;
    }
    
    // borrar D
    @DeleteMapping("/producto/{id}")
    public void borrar(@PathVariable String id){
        productoRepository.delete(id);
    }
}
