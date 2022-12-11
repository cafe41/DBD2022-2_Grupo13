package DEBEDE.services;

import DEBEDE.models.Empresa_Categoria;
import DEBEDE.repositories.Empresa_CategoriaRepository;
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
public class Empresa_CategoriaService {
    private final DEBEDE.repositories.Empresa_CategoriaRepository Empresa_CategoriaRepository;

    Empresa_CategoriaService(Empresa_CategoriaRepository Empresa_CategoriaRepository){
        this.Empresa_CategoriaRepository = Empresa_CategoriaRepository;
    }

    // crear C
    @PostMapping("/Empresa_Categoria")
    @ResponseBody
    public Empresa_Categoria crear(@RequestBody Empresa_Categoria Empresa_Categoria){
        Empresa_Categoria resultado = Empresa_CategoriaRepository.crear(Empresa_Categoria);
        return resultado;
    }
    // get R
    @GetMapping("/Empresa_Categoria")
    public List<Empresa_Categoria> getAllEmpresa_Categoria(){
        return Empresa_CategoriaRepository.getAll();
    }
    //get by
    @GetMapping("/Empresa_Categoria/{ID_Empresa_Categoria}")
    public List<Empresa_Categoria> getEmpresa_Categoria(@PathVariable Integer ID_Empresa_Categoria){
        return Empresa_CategoriaRepository.show(ID_Empresa_Categoria);
    }

    // actualizar U
    @PutMapping("/Empresa_Categoria/{ID_Empresa_Categoria}")
    @ResponseBody
    public String updateEmpresa_Categoria(@RequestBody Empresa_Categoria Empresa_Categoria, @PathVariable Integer ID_Empresa_Categoria){
        String retorno = Empresa_CategoriaRepository.update(Empresa_Categoria,ID_Empresa_Categoria);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Empresa_Categoria/{ID_Empresa_Categoria}")
    public void borrar(@PathVariable Integer ID_Empresa_Categoria){
        Empresa_CategoriaRepository.delete(ID_Empresa_Categoria);
    }

}
