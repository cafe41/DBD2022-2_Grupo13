package DEBEDE.services;

import DEBEDE.models.Favoritos;
import DEBEDE.repositories.FavoritosRepository;
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
public class FavoritosService {
    private final DEBEDE.repositories.FavoritosRepository FavoritosRepository;

    FavoritosService(FavoritosRepository FavoritosRepository){
        this.FavoritosRepository = FavoritosRepository;
    }

    // crear C
    @PostMapping("/Favoritos")
    @ResponseBody
    public Favoritos crear(@RequestBody Favoritos Favoritos){
        Favoritos resultado = FavoritosRepository.crear(Favoritos);
        return resultado;
    }
    // get R
    @GetMapping("/Favoritos")
    public List<Favoritos> getAllFavoritos(){
        return FavoritosRepository.getAll();
    }
    //get by
    @GetMapping("/Favoritos/{ID_Favorito}")
    public List<Favoritos> getFavoritos(@PathVariable Integer ID_Favorito){
        return FavoritosRepository.show(ID_Favorito);
    }

    // actualizar U
    @PutMapping("/Favoritos/{ID_Favorito}")
    @ResponseBody
    public String updateFavoritos(@RequestBody Favoritos Favoritos, @PathVariable Integer ID_Favorito){
        String retorno = FavoritosRepository.update(Favoritos,ID_Favorito);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Favoritos/{ID_Favorito}")
    public void borrar(@PathVariable Integer ID_Favorito){
        FavoritosRepository.delete(ID_Favorito);
    }

}
