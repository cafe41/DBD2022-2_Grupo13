package DEBEDE.services;

import DEBEDE.models.Usuario;
import DEBEDE.repositories.UsuarioRepository;
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
public class UsuarioService {
    private final DEBEDE.repositories.UsuarioRepository UsuarioRepository;

    UsuarioService(UsuarioRepository UsuarioRepository){
        this.UsuarioRepository = UsuarioRepository;
    }

    // crear C
    @PostMapping("/Usuario")
    @ResponseBody
    public Usuario crear(@RequestBody Usuario Usuario){
        Usuario resultado = UsuarioRepository.crear(Usuario);
        return resultado;
    }
    // get R
    @GetMapping("/Usuario")
    public List<Usuario> getAllUsuario(){
        return UsuarioRepository.getAll();
    }
    //get by
    @GetMapping("/Usuario/{ID_Usuario}")
    public List<Usuario> getUsuario(@PathVariable Integer ID_Usuario){
        return UsuarioRepository.show(ID_Usuario);
    }
    //get check of user existance
    @GetMapping("/Usuario/{nombre_Usuario}/{contrasena}")
    public Boolean getUserExists(@PathVariable String nombre_Usuario, @PathVariable String contrasena){
        return UsuarioRepository.userExists(nombre_Usuario, contrasena);
    }

    // actualizar U
    @PutMapping("/Usuario/{ID_Usuario}")
    @ResponseBody
    public String updateUsuario(@RequestBody Usuario Usuario, @PathVariable Integer ID_Usuario){
        String retorno = UsuarioRepository.update(Usuario,ID_Usuario);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Usuario/{ID_Usuario}")
    public void borrar(@PathVariable Integer ID_Usuario){
        UsuarioRepository.delete(ID_Usuario);
    }

}
