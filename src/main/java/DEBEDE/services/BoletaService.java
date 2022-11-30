package DEBEDE.services;

import DEBEDE.models.Boleta;
import DEBEDE.repositories.BoletaRepository;
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
public class BoletaService {
    private final DEBEDE.repositories.BoletaRepository BoletaRepository;

    BoletaService(BoletaRepository BoletaRepository){
        this.BoletaRepository = BoletaRepository;
    }

    // crear C
    @PostMapping("/Boleta")
    @ResponseBody
    public Boleta crear(@RequestBody Boleta Boleta){
        Boleta resultado = BoletaRepository.crear(Boleta);
        return resultado;
    }
    // get R
    @GetMapping("/Boleta")
    public List<Boleta> getAllBoletas(){
        return BoletaRepository.getAll();
    }
    //get by
    @GetMapping("/Boleta/{id_boleta}")
    public List<Boleta> getBoleta(@PathVariable String id_boleta){
        return BoletaRepository.show(id_boleta);
    }

    // actualizar U
    @PutMapping("/Boleta/{id_boleta}")
    @ResponseBody
    public String updateBoleta(@RequestBody Boleta Boleta, @PathVariable String id_boleta){
        String retorno = BoletaRepository.update(Boleta,id_boleta);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Boleta/{id_boleta}")
    public void borrar(@PathVariable String id_boleta){
        BoletaRepository.delete(id_boleta);
    }

}
