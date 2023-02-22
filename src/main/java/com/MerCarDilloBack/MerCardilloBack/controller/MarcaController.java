package com.MerCarDilloBack.MerCardilloBack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.MerCarDilloBack.MerCardilloBack.entity.MarcaCoche;
import com.MerCarDilloBack.MerCardilloBack.service.MarcaService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/mercardillo/marca")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @PostMapping(value = "", consumes="application/*" )
    public ResponseEntity<?> create (@RequestBody MarcaCoche marca) {
        return ResponseEntity.status(HttpStatus.CREATED).body(marcaService.save(marca));
    }

    @GetMapping("/marca/{id}") 
    public ResponseEntity<?> read(@PathVariable Long id){
        Optional<MarcaCoche> oMarca = marcaService.findById(id);
        if(!oMarca.isPresent()){
            return ResponseEntity.notFound().build(); 
        }
        return ResponseEntity.ok(oMarca);  
    }
    
    @DeleteMapping("/marca/{id}")
    public ResponseEntity<?> delete (@PathVariable Long id){
        if(!marcaService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        marcaService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/marcas")
    public List<MarcaCoche> readAll() {
        return marcaService.findAll();        
    }
}

