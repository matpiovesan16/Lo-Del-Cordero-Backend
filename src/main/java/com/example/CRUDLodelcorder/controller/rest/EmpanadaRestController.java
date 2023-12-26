package com.example.CRUDLodelcorder.controller.rest;

import com.example.CRUDLodelcorder.entities.Empanada;
import com.example.CRUDLodelcorder.service.EmpanadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EmpanadaRestController {
    @Autowired
    private EmpanadaService empanadaService;
    @CrossOrigin
    @GetMapping("/empanadas")
    public List <Empanada>listarEmpanadas(){
        return  empanadaService.findAll();
    }

}
