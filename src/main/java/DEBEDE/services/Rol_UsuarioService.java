package DEBEDE.services;

import DEBEDE.models.Rol_Usuario;
import DEBEDE.repositories.Rol_UsuarioRepository;

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
public class Rol_UsuarioService {
    private final DEBEDE.repositories.Rol_UsuarioRepository Rol_UsuarioRepository;

    Rol_UsuarioService(Rol_UsuarioRepository Rol_UsuarioRepository){
        this.Rol_UsuarioRepository = Rol_UsuarioRepository;
    }

    // crear C
    @PostMapping("/Rol_Usuario")
    @ResponseBody
    public Rol_Usuario crear(@RequestBody Rol_Usuario Rol_Usuario){
        Rol_Usuario resultado = Rol_UsuarioRepository.crear(Rol_Usuario);
        return resultado;
    }
    // get R
    @GetMapping("/Rol_Usuario")
    public List<Rol_Usuario> getAllRol_Usuario(){
        return Rol_UsuarioRepository.getAll();
    }
    //get by
    @GetMapping("/Rol_Usuario/{ID_Rol_Usuario}")
    public List<Rol_Usuario> getRol_Usuario(@PathVariable Integer ID_Rol_Usuario){
        return Rol_UsuarioRepository.show(ID_Rol_Usuario);
    }

    // actualizar U
    @PutMapping("/Rol_Usuario/{ID_Rol_Usuario}")
    @ResponseBody
    public String updateRol_Usuario(@RequestBody Rol_Usuario Rol_Usuario, @PathVariable Integer ID_Rol_Usuario){
        String retorno = Rol_UsuarioRepository.update(Rol_Usuario,ID_Rol_Usuario);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Rol_Usuario/{ID_Rol_Usuario}")
    public void borrar(@PathVariable Integer ID_Rol_Usuario){
        Rol_UsuarioRepository.delete(ID_Rol_Usuario);
    }

}
