package DEBEDE.services;

import DEBEDE.models.Pais_Empresa;
import DEBEDE.repositories.Pais_EmpresaRepository;

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
public class Pais_EmpresaService {
    private final DEBEDE.repositories.Pais_EmpresaRepository Pais_EmpresaRepository;

    Pais_EmpresaService(Pais_EmpresaRepository Pais_EmpresaRepository){
        this.Pais_EmpresaRepository = Pais_EmpresaRepository;
    }

    // crear C
    @PostMapping("/Pais_Empresa")
    @ResponseBody
    public Pais_Empresa crear(@RequestBody Pais_Empresa Pais_Empresa){
        Pais_Empresa resultado = Pais_EmpresaRepository.crear(Pais_Empresa);
        return resultado;
    }
    // get R
    @GetMapping("/Pais_Empresa")
    public List<Pais_Empresa> getAllPais_Empresa(){
        return Pais_EmpresaRepository.getAll();
    }
    //get by
    @GetMapping("/Pais_Empresa/{ID_Pais_Empresa}")
    public List<Pais_Empresa> getPais_Empresa(@PathVariable Integer ID_Pais_Empresa){
        return Pais_EmpresaRepository.show(ID_Pais_Empresa);
    }

    // actualizar U
    @PutMapping("/Pais_Empresa/{ID_Pais_Empresa}")
    @ResponseBody
    public String updatePais_Empresa(@RequestBody Pais_Empresa Pais_Empresa, @PathVariable Integer ID_Pais_Empresa){
        String retorno = Pais_EmpresaRepository.update(Pais_Empresa,ID_Pais_Empresa);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Pais_Empresa/{ID_Pais_Empresa}")
    public void borrar(@PathVariable Integer ID_Pais_Empresa){
        Pais_EmpresaRepository.delete(ID_Pais_Empresa);
    }

}
