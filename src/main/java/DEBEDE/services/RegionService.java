package DEBEDE.services;

import DEBEDE.models.Region;
import DEBEDE.repositories.RegionRepository;

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
public class RegionService {
    private final DEBEDE.repositories.RegionRepository RegionRepository;

    RegionService(RegionRepository RegionRepository){
        this.RegionRepository = RegionRepository;
    }

    // crear C
    @PostMapping("/Region")
    @ResponseBody
    public Region crear(@RequestBody Region Region){
        Region resultado = RegionRepository.crear(Region);
        return resultado;
    }
    // get R
    @GetMapping("/Region")
    public List<Region> getAllRegion(){
        return RegionRepository.getAll();
    }
    //get by
    @GetMapping("/Region/{ID_Region}")
    public List<Region> getRegion(@PathVariable Integer ID_Region){
        return RegionRepository.show(ID_Region);
    }

    // actualizar U
    @PutMapping("/Region/{ID_Region}")
    @ResponseBody
    public String updateRegion(@RequestBody Region Region, @PathVariable Integer ID_Region){
        String retorno = RegionRepository.update(Region,ID_Region);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Region/{ID_Region}")
    public void borrar(@PathVariable Integer ID_Region){
        RegionRepository.delete(ID_Region);
    }

}
