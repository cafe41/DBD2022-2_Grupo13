package DEBEDE.services;

import DEBEDE.models.Permiso_Rol;
import DEBEDE.repositories.Permiso_RolRepository;

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
public class Permiso_RolService {
    private final DEBEDE.repositories.Permiso_RolRepository Permiso_RolRepository;

    Permiso_RolService(Permiso_RolRepository Permiso_RolRepository){
        this.Permiso_RolRepository = Permiso_RolRepository;
    }

    // crear C
    @PostMapping("/Permiso_Rol")
    @ResponseBody
    public Permiso_Rol crear(@RequestBody Permiso_Rol Permiso_Rol){
        Permiso_Rol resultado = Permiso_RolRepository.crear(Permiso_Rol);
        return resultado;
    }
    // get R
    @GetMapping("/Permiso_Rol")
    public List<Permiso_Rol> getAllPermiso_Rol(){
        return Permiso_RolRepository.getAll();
    }
    //get by
    @GetMapping("/Permiso_Rol/{ID_Permiso_Rol}")
    public List<Permiso_Rol> getPermiso_Rol(@PathVariable Integer ID_Permiso_Rol){
        return Permiso_RolRepository.show(ID_Permiso_Rol);
    }

    // actualizar U
    @PutMapping("/Permiso_Rol/{ID_Permiso_Rol}")
    @ResponseBody
    public String updatePermiso_Rol(@RequestBody Permiso_Rol Permiso_Rol, @PathVariable Integer ID_Permiso_Rol){
        String retorno = Permiso_RolRepository.update(Permiso_Rol,ID_Permiso_Rol);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Permiso_Rol/{ID_Permiso_Rol}")
    public void borrar(@PathVariable Integer ID_Permiso_Rol){
        Permiso_RolRepository.delete(ID_Permiso_Rol);
    }

}
