package DEBEDE.services;

import DEBEDE.models.Valoracion;
import DEBEDE.repositories.ValoracionRepository;

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
public class ValoracionService {
    private final DEBEDE.repositories.ValoracionRepository ValoracionRepository;

    ValoracionService(ValoracionRepository ValoracionRepository){
        this.ValoracionRepository = ValoracionRepository;
    }

    // crear C
    @PostMapping("/Valoracion")
    @ResponseBody
    public Valoracion crear(@RequestBody Valoracion Valoracion){
        Valoracion resultado = ValoracionRepository.crear(Valoracion);
        return resultado;
    }
    // get R
    @GetMapping("/Valoracion")
    public List<Valoracion> getAllValoracion(){
        return ValoracionRepository.getAll();
    }
    //get by
    @GetMapping("/Valoracion/{ID_Valoracion}")
    public List<Valoracion> getValoracion(@PathVariable Integer ID_Valoracion){
        return ValoracionRepository.show(ID_Valoracion);
    }

    // actualizar U
    @PutMapping("/Valoracion/{ID_Valoracion}")
    @ResponseBody
    public String updateValoracion(@RequestBody Valoracion Valoracion, @PathVariable Integer ID_Valoracion){
        String retorno = ValoracionRepository.update(Valoracion,ID_Valoracion);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Valoracion/{ID_Valoracion}")
    public void borrar(@PathVariable Integer ID_Valoracion){
        ValoracionRepository.delete(ID_Valoracion);
    }

}
