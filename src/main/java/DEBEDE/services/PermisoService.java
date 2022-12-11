package DEBEDE.services;

import DEBEDE.models.Permiso;
import DEBEDE.repositories.PermisoRepository;
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
public class PermisoService {
    private final DEBEDE.repositories.PermisoRepository PermisoRepository;

    PermisoService(PermisoRepository PermisoRepository){
        this.PermisoRepository = PermisoRepository;
    }

    // crear C
    @PostMapping("/Permiso")
    @ResponseBody
    public Permiso crear(@RequestBody Permiso Permiso){
        Permiso resultado = PermisoRepository.crear(Permiso);
        return resultado;
    }
    // get R
    @GetMapping("/Permiso")
    public List<Permiso> getAllPermiso(){
        return PermisoRepository.getAll();
    }
    //get by
    @GetMapping("/Permiso/{ID_Permiso}")
    public List<Permiso> getPermiso(@PathVariable Integer ID_Permiso){
        return PermisoRepository.show(ID_Permiso);
    }

    // actualizar U
    @PutMapping("/Permiso/{ID_Permiso}")
    @ResponseBody
    public String updatePermiso(@RequestBody Permiso Permiso, @PathVariable Integer ID_Permiso){
        String retorno = PermisoRepository.update(Permiso,ID_Permiso);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Permiso/{ID_Permiso}")
    public void borrar(@PathVariable Integer ID_Permiso){
        PermisoRepository.delete(ID_Permiso);
    }

}
