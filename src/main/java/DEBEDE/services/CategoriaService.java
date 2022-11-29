package DEBEDE.services;

import DEBEDE.models.Categoria;
import DEBEDE.repositories.CategoriaRepository;

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
public class CategoriaService {
    private final DEBEDE.repositories.CategoriaRepository CategoriaRepository;

    CategoriaService(CategoriaRepository CategoriaRepository){
        this.CategoriaRepository = CategoriaRepository;
    }

    // crear C
    @PostMapping("/Categoria")
    @ResponseBody
    public Categoria crear(@RequestBody Categoria Categoria){
        Categoria resultado = CategoriaRepository.crear(Categoria);
        return resultado;
    }
    


    // get R
    @GetMapping("/Categoria")
    public List<Categoria> getAllCategorias(){
        return CategoriaRepository.getAll();
    }
    //get by
    @GetMapping("/Categoria/{id}")
    public List<Categoria> getCategoria(@PathVariable String id){
        return CategoriaRepository.show(id);
    }



    // actualizar U
    @PutMapping("/Categoria/{id}")
    @ResponseBody
    public String updateCategoria(@RequestBody Categoria Categoria, @PathVariable String id){
        String retorno = CategoriaRepository.update(Categoria,id);
        return retorno;
    }
    
    // borrar D
    @DeleteMapping("/Categoria/{id}")
    public void borrar(@PathVariable String id){
        CategoriaRepository.delete(id);
    }
}
