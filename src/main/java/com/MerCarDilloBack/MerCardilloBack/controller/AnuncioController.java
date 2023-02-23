package com.MerCarDilloBack.MerCardilloBack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.MerCarDilloBack.MerCardilloBack.entity.AnuncioCoche;
import com.MerCarDilloBack.MerCardilloBack.service.AnuncioService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/mercardillo")
public class AnuncioController {
    @Autowired
    private AnuncioService anuncioService;

    @PostMapping(value = "", consumes="application/*" )
    public ResponseEntity<?> create (@RequestBody AnuncioCoche anuncio) {
        return ResponseEntity.status(HttpStatus.CREATED).body(anuncioService.save(anuncio));
    }

    @GetMapping("/{id}") 
    public ResponseEntity<?> read(@PathVariable Long id){
        Optional<AnuncioCoche> oAnuncio = anuncioService.findById(id);
        if(!oAnuncio.isPresent()){
            return ResponseEntity.notFound().build(); 
        }
        return ResponseEntity.ok(oAnuncio);  
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete (@PathVariable Long id){
        if(!anuncioService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        anuncioService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/anuncios")
    public List<AnuncioCoche> readAll() {
        return anuncioService.findAll();        
    }
}

