package DEBEDE.services;

import DEBEDE.models.Favoritos_Empresa;
import DEBEDE.repositories.Favoritos_EmpresaRepository;
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
public class Favoritos_EmpresaService {
    private final DEBEDE.repositories.Favoritos_EmpresaRepository Favoritos_EmpresaRepository;

    Favoritos_EmpresaService(Favoritos_EmpresaRepository Favoritos_EmpresaRepository){
        this.Favoritos_EmpresaRepository = Favoritos_EmpresaRepository;
    }

    // crear C
    @PostMapping("/Favoritos_Empresa")
    @ResponseBody
    public Favoritos_Empresa crear(@RequestBody Favoritos_Empresa Favoritos_Empresa){
        Favoritos_Empresa resultado = Favoritos_EmpresaRepository.crear(Favoritos_Empresa);
        return resultado;
    }
    // get R
    @GetMapping("/Favoritos_Empresa")
    public List<Favoritos_Empresa> getAllFavoritos_Empresa(){
        return Favoritos_EmpresaRepository.getAll();
    }
    //get by
    @GetMapping("/Favoritos_Empresa/{id_Favoritos_Empresa}")
    public List<Favoritos_Empresa> getFavoritos_Empresa(@PathVariable Integer id_Favoritos_Empresa){
        return Favoritos_EmpresaRepository.show(id_Favoritos_Empresa);
    }

    // actualizar U
    @PutMapping("/Favoritos_Empresa/{id_Favoritos_Empresa}")
    @ResponseBody
    public String updateEmpresa(@RequestBody Favoritos_Empresa Favoritos_Empresa, @PathVariable Integer id_Favoritos_Empresa){
        String retorno = Favoritos_EmpresaRepository.update(Favoritos_Empresa,id_Favoritos_Empresa);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Favoritos_Empresa/{id_Favoritos_Empresa}")
    public void borrar(@PathVariable Integer id_Favoritos_Empresa){
        Favoritos_EmpresaRepository.delete(id_Favoritos_Empresa);
    }

}
