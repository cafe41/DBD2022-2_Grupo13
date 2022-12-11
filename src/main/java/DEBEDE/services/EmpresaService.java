package DEBEDE.services;

import DEBEDE.models.Empresa;
import DEBEDE.repositories.EmpresaRepository;
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
public class EmpresaService {
    private final DEBEDE.repositories.EmpresaRepository EmpresaRepository;

    EmpresaService(EmpresaRepository EmpresaRepository){
        this.EmpresaRepository = EmpresaRepository;
    }

    // crear C
    @PostMapping("/Empresa")
    @ResponseBody
    public Empresa crear(@RequestBody Empresa Empresa){
        Empresa resultado = EmpresaRepository.crear(Empresa);
        return resultado;
    }
    // get R
    @GetMapping("/Empresa")
    public List<Empresa> getAllEmpresa(){
        return EmpresaRepository.getAll();
    }
    //get by
    @GetMapping("/Empresa/{id_empresa}")
    public List<Empresa> getEmpresa(@PathVariable Integer id_empresa){
        return EmpresaRepository.show(id_empresa);
    }
    //get non explicit
    @GetMapping("/Empresa")
    public List<Empresa> getNonExplicit(){
        return EmpresaRepository.getNonExplicit();
    }

    // actualizar U
    @PutMapping("/Empresa/{id_empresa}")
    @ResponseBody
    public String updateEmpresa(@RequestBody Empresa Empresa, @PathVariable Integer id_empresa){
        String retorno = EmpresaRepository.update(Empresa,id_empresa);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Empresa/{id_empresa}")
    public void borrar(@PathVariable Integer id_empresa){
        EmpresaRepository.delete(id_empresa);
    }

}
