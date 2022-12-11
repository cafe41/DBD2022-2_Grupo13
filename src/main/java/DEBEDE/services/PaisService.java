package DEBEDE.services;

import DEBEDE.models.Pais;
import DEBEDE.repositories.PaisRepository;
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
public class PaisService {
    private final DEBEDE.repositories.PaisRepository PaisRepository;

    PaisService(PaisRepository PaisRepository){
        this.PaisRepository = PaisRepository;
    }

    // crear C
    @PostMapping("/Pais")
    @ResponseBody
    public Pais crear(@RequestBody Pais Pais){
        Pais resultado = PaisRepository.crear(Pais);
        return resultado;
    }
    // get R
    @GetMapping("/Pais")
    public List<Pais> getAllPais(){
        return PaisRepository.getAll();
    }
    //get by
    @GetMapping("/Pais/{ID_Pais}")
    public List<Pais> getPais(@PathVariable Integer ID_Pais){
        return PaisRepository.show(ID_Pais);
    }

    // actualizar U
    @PutMapping("/Pais/{ID_Pais}")
    @ResponseBody
    public String updatePais(@RequestBody Pais Pais, @PathVariable Integer ID_Pais){
        String retorno = PaisRepository.update(Pais,ID_Pais);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Pais/{ID_Pais}")
    public void borrar(@PathVariable Integer ID_Pais){
        PaisRepository.delete(ID_Pais);
    }

}
