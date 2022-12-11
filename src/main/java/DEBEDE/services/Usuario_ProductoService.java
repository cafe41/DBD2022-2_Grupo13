package DEBEDE.services;

import DEBEDE.models.Usuario_Producto;
import DEBEDE.repositories.Usuario_ProductoRepository;
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
public class Usuario_ProductoService {
    private final DEBEDE.repositories.Usuario_ProductoRepository Usuario_ProductoRepository;

    Usuario_ProductoService(Usuario_ProductoRepository Usuario_ProductoRepository){
        this.Usuario_ProductoRepository = Usuario_ProductoRepository;
    }

    // crear C
    @PostMapping("/Usuario_Producto")
    @ResponseBody
    public Usuario_Producto crear(@RequestBody Usuario_Producto Usuario_Producto){
        Usuario_Producto resultado = Usuario_ProductoRepository.crear(Usuario_Producto);
        return resultado;
    }
    // get R
    @GetMapping("/Usuario_Producto")
    public List<Usuario_Producto> getAllUsuario_Producto(){
        return Usuario_ProductoRepository.getAll();
    }
    //get by
    @GetMapping("/Usuario_Producto/{ID_Carrito}")
    public List<Usuario_Producto> getUsuario_Producto(@PathVariable Integer ID_Carrito){
        return Usuario_ProductoRepository.show(ID_Carrito);
    }

    // actualizar U
    @PutMapping("/Usuario_Producto/{ID_Carrito}")
    @ResponseBody
    public String updateUsuario_Producto(@RequestBody Usuario_Producto Usuario_Producto, @PathVariable Integer ID_Carrito){
        String retorno = Usuario_ProductoRepository.update(Usuario_Producto,ID_Carrito);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Usuario_Producto/{ID_Carrito}")
    public void borrar(@PathVariable Integer ID_Carrito){
        Usuario_ProductoRepository.delete(ID_Carrito);
    }

}
