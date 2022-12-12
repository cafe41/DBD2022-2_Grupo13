package DEBEDE.services;

import DEBEDE.models.Ranking_Empresa;
import DEBEDE.repositories.Ranking_EmpresaRepository;

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
public class Ranking_EmpresaService {
    private final DEBEDE.repositories.Ranking_EmpresaRepository Ranking_EmpresaRepository;

    Ranking_EmpresaService(Ranking_EmpresaRepository Ranking_EmpresaRepository){
        this.Ranking_EmpresaRepository = Ranking_EmpresaRepository;
    }

    // crear C
    @PostMapping("/Ranking_Empresa")
    @ResponseBody
    public Ranking_Empresa crear(@RequestBody Ranking_Empresa Ranking_Empresa){
        Ranking_Empresa resultado = Ranking_EmpresaRepository.crear(Ranking_Empresa);
        return resultado;
    }
    // get R
    @GetMapping("/Ranking_Empresa")
    public List<Ranking_Empresa> getAllRanking_Empresa(){
        return Ranking_EmpresaRepository.getAll();
    }
    //get by
    @GetMapping("/Ranking_Empresa/{ID_Ranking}")
    public List<Ranking_Empresa> getRanking_Empresa(@PathVariable Integer ID_Ranking){
        return Ranking_EmpresaRepository.show(ID_Ranking);
    }

    // actualizar U
    @PutMapping("/Ranking_Empresa/{ID_Ranking}")
    @ResponseBody
    public String updateRanking_Empresa(@RequestBody Ranking_Empresa Ranking_Empresa, @PathVariable Integer ID_Ranking){
        String retorno = Ranking_EmpresaRepository.update(Ranking_Empresa,ID_Ranking);
        return retorno;
    }

    // borrar D
    @DeleteMapping("/Ranking_Empresa/{ID_Ranking}")
    public void borrar(@PathVariable Integer ID_Ranking){
        Ranking_EmpresaRepository.delete(ID_Ranking);
    }

}
