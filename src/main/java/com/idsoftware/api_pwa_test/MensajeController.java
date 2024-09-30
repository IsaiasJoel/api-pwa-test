package com.idsoftware.api_pwa_test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mensaje")
public class MensajeController {

    @GetMapping("")
    public ResponseEntity get() {
        Map<String,String> mapa = new HashMap<>();
        mapa.put("mensaje","Hola Isaias, estás recibiendo información desde una API");
        return ResponseEntity.ok().body(mapa);
    }
}
