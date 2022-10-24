package br.com.uniamerica.transportadora.transportadoraapi.controller;

import br.com.uniamerica.transportadora.transportadoraapi.entity.Estado;
import br.com.uniamerica.transportadora.transportadoraapi.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/estados")
public class EstadoController {

    @Autowired
    private EstadoRepository estadoRepository;

    public EstadoController (EstadoRepository estadoRepository){
        this.estadoRepository = estadoRepository;
    }

    @GetMapping
    public ResponseEntity<List<Estado>> findAll(){
        return  ResponseEntity.ok().body(this.estadoRepository.findByAtivoTrue());
    }

    /*@GetMapping(".{nome}")
    public ResponseEntity<List<Estado>> findAll(@PathVariable("nome") final String nome){
        return  ResponseEntity.ok().body(this.estadoRepository.findByNomeAndAtivo(nome,false));
    }*/

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody final Estado estado){

    }

    @GetMapping
    @PostMapping
    @PutMapping
    @DeleteMapping
}
