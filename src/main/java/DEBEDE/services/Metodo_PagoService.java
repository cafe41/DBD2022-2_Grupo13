package DEBEDE.services;

import DEBEDE.models.Metodo_Pago;
import DEBEDE.repositories.Metodo_PagoRepository;

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
public class Metodo_PagoService {
    private final DEBEDE.repositories.Metodo_PagoRepository Metodo_PagoRepository;

    Metodo_PagoService(Metodo_PagoRepository Metodo_PagoRepository){
        this.Metodo_PagoRepository = Metodo_PagoRepository;
    }

    // crear C
    @PostMapping("/Metodo_Pago")
    @ResponseBody
    public Metodo_Pago crear(@RequestBody Metodo_Pago Metodo_Pago){
        Metodo_Pago resultado = Metodo_PagoRepository.crear(Metodo_Pago);
        return resultado;
    }
    // get R
    @GetMapping("/Metodo_Pago")
    public List<Metodo_Pago> getAllMetodo_Pago(){
        return Metodo_PagoRepository.getAll();
    }
    //get by
    @GetMapping("/Metodo_Pago/{ID_Metodo_Pago}")
    public List<Metodo_Pago> getMetodo_Pago(@PathVariable Integer ID_Metodo_Pago){
        return Metodo_PagoRepository.show(ID_Metodo_Pago);
    }

    // actualizar U
    @PutMapping("/Metodo_Pago/{ID_Metodo_Pago}")
    @ResponseBody
    public String updateMetodo_Pago(@RequestBody Metodo_Pago Metodo_Pago, @PathVariable Integer ID_Metodo_Pago){
        String retorno = Metodo_PagoRepository.update(Metodo_Pago,ID_Metodo_Pago);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Metodo_Pago/{ID_Metodo_Pago}")
    public void borrar(@PathVariable Integer ID_Metodo_Pago){
        Metodo_PagoRepository.delete(ID_Metodo_Pago);
    }

}
