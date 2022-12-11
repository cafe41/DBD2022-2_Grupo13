package DEBEDE.services;

import DEBEDE.models.Producto_Categoria;
import DEBEDE.repositories.Producto_CategoriaRepository;
import org.springframework.web.bind.annotation.*;

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
public class Producto_CategoriaService {
    private final DEBEDE.repositories.Producto_CategoriaRepository Producto_CategoriaRepository;

    Producto_CategoriaService(Producto_CategoriaRepository Producto_CategoriaRepository){
        this.Producto_CategoriaRepository = Producto_CategoriaRepository;
    }

    // crear C
    @PostMapping("/Producto_Categoria")
    @ResponseBody
    public Producto_Categoria crear(@RequestBody Producto_Categoria Producto_Categoria){
        Producto_Categoria resultado = Producto_CategoriaRepository.crear(Producto_Categoria);
        return resultado;
    }
    // get R
    @GetMapping("/Producto_Categoria")
    public List<Producto_Categoria> getAllProducto_Categoria(){
        return Producto_CategoriaRepository.getAll();
    }
    //get by
    @GetMapping("/Producto_Categoria/{ID_Producto_Categoria}")
    public List<Producto_Categoria> getProducto_Categoria(@PathVariable Integer ID_Producto_Categoria){
        return Producto_CategoriaRepository.show(ID_Producto_Categoria);
    }

    // actualizar U
    @PutMapping("/Producto_Categoria/{ID_Producto_Categoria}")
    @ResponseBody
    public String updateProducto_Categoria(@RequestBody Producto_Categoria Producto_Categoria, @PathVariable Integer ID_Producto_Categoria){
        String retorno = Producto_CategoriaRepository.update(Producto_Categoria,ID_Producto_Categoria);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Producto_Categoria/{ID_Producto_Categoria}")
    public void borrar(@PathVariable Integer ID_Producto_Categoria){
        Producto_CategoriaRepository.delete(ID_Producto_Categoria);
    }

}
