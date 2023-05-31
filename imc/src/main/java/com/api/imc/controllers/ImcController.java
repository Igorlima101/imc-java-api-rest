package com.api.imc.controllers;

import com.api.imc.model.Imc;
import com.api.imc.services.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ImcController {

    @Autowired
    private ImcService imcService;

    @PostMapping("/post")
    public ResponseEntity<Imc> registerImc(@RequestBody Imc recordImc){
        imcService.registerImc(recordImc);
        return ResponseEntity.badRequest().body(recordImc);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Imc>> listImc(){
        return ResponseEntity.ok().body(imcService.list());
    }
}
