package com.MerCarDilloBack.MerCardilloBack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.MerCarDilloBack.MerCardilloBack.entity.TipoCoche;
import com.MerCarDilloBack.MerCardilloBack.service.TipoService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/mercardillo/Tipo")
public class TipoController {
    @Autowired
    private TipoService tipoService;

    @PostMapping(value = "", consumes="application/*" )
    public ResponseEntity<?> create (@RequestBody TipoCoche tipoCoche) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoService.save(tipoCoche));
    }

    @GetMapping("/Tipo/{id}") 
    public ResponseEntity<?> read(@PathVariable Long id){
        Optional<TipoCoche> oTipoCoche = tipoService.findById(id);
        if(!oTipoCoche.isPresent()){
            return ResponseEntity.notFound().build(); 
        }
        return ResponseEntity.ok(oTipoCoche);  
    }
    
    @DeleteMapping("/tipo/{id}")
    public ResponseEntity<?> delete (@PathVariable Long id){
        if(!tipoService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        tipoService.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/tipos")
    public List<TipoCoche> readAll() {
        return tipoService.findAll();        
    }
}

