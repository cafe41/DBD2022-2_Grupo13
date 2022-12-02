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
        return CategoriaRepository.crear(Categoria);
    }
    


    // get R
    @GetMapping("/Categoria")
    public List<Categoria> getAllCategorias(){
        return CategoriaRepository.getAll();
    }
    //get by
    @GetMapping("/Categoria/{ID_Categoria}")
    public List<Categoria> getCategoria(@PathVariable Integer ID_Categoria){
        return CategoriaRepository.show(ID_Categoria);
    }



    // actualizar U
    @PutMapping("/Categoria/{ID_Categoria}")
    @ResponseBody
    public String updateCategoria(@RequestBody Categoria Categoria, @PathVariable Integer ID_Categoria){
        return CategoriaRepository.update(Categoria,ID_Categoria);
    }
    
    // borrar D
    @DeleteMapping("/Categoria/{ID_Categoria}")
    public void borrar(@PathVariable Integer ID_Categoria){
        CategoriaRepository.delete(ID_Categoria);
    }
}
