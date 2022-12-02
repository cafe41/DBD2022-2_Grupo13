package DEBEDE.services;

import DEBEDE.models.Categoria;
import DEBEDE.models.Rol;
import DEBEDE.repositories.CategoriaRepository;
import DEBEDE.repositories.RolRepository;
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
public class RolService {
    private final DEBEDE.repositories.RolRepository RolRepository;

    RolService(RolRepository RolRepository){
        this.RolRepository = RolRepository;
    }

    // crear C
    @PostMapping("/Rol")
    @ResponseBody
    public Rol crear(@RequestBody Rol Rol){
        Rol resultado = RolRepository.crear(Rol);
        return resultado;
    }

    // get R
    @GetMapping("/Rol")
    public List<Rol> getAllRoles(){
        return RolRepository.getAll();
    }
    //get by
    @GetMapping("/Rol/{id_rol}")
    public List<Rol> getRol(@PathVariable String id_rol){
        return RolRepository.show(id_rol);
    }

    // actualizar U
    @PutMapping("/Rol/{id_rol}")
    @ResponseBody
    public String updateRol(@RequestBody Rol Rol, @PathVariable String id_rol){
        String retorno = RolRepository.update(Rol,id_rol);
        return retorno;
    }
    // borrar D
    @DeleteMapping("/Rol/{id_rol}")
    public void borrar(@PathVariable String id_rol){
        RolRepository.delete(id_rol);
    }



}
