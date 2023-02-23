package com.MerCarDilloBack.MerCardilloBack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.MerCarDilloBack.MerCardilloBack.entity.Provincia;
import com.MerCarDilloBack.MerCardilloBack.service.ProvinciaService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/mercardillo/")
public class ProvinciaController {
    @Autowired
    private ProvinciaService provinciaService;

    @PostMapping(value = "/provincia", consumes="application/*" )
    public ResponseEntity<?> create (@RequestBody Provincia provincia) {
        return ResponseEntity.status(HttpStatus.CREATED).body(provinciaService.save(provincia));
    }

    @GetMapping("/provincia/{id}") 
    public ResponseEntity<?> read(@PathVariable Long id){
        Optional<Provincia> oProvincia = provinciaService.findById(id);
        if(!oProvincia.isPresent()){
            return ResponseEntity.notFound().build(); 
        }
        return ResponseEntity.ok(oProvincia);  
    }
    
    @DeleteMapping("/provincia/{id}")
    public ResponseEntity<?> delete (@PathVariable Long id){
        if(!provinciaService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        provinciaService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/provincias")
    public List<Provincia> readAll() {
        return provinciaService.findAll();        
    }
}

