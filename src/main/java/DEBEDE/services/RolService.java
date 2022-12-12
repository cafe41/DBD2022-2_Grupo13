package DEBEDE.services;

import DEBEDE.models.Rol;
import DEBEDE.repositories.RolRepository;

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
    @GetMapping("/Rol/{ID_Rol}")
    public List<Rol> getRol(@PathVariable Integer ID_Rol){
        return RolRepository.show(ID_Rol);
    }

    // actualizar U
    @PutMapping("/Rol/{ID_Rol}")
    @ResponseBody
    public String updateRol(@RequestBody Rol Rol, @PathVariable Integer ID_Rol){
        String retorno = RolRepository.update(Rol,ID_Rol);
        return retorno;
    }
    // borrar D
    @DeleteMapping("/Rol/{ID_Rol}")
    public void borrar(@PathVariable Integer ID_Rol){
        RolRepository.delete(ID_Rol);
    }



}
