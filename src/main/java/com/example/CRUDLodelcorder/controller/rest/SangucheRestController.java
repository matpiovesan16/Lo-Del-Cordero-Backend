package com.example.CRUDLodelcorder.controller.rest;

import com.example.CRUDLodelcorder.entities.Sanguche;
import com.example.CRUDLodelcorder.service.SangucheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class SangucheRestController {
    @Autowired
    SangucheService sangucheService;
    @CrossOrigin
    @GetMapping("/sanguches")
    public List <Sanguche> getAll(){
        return sangucheService.findAll();
    }


}
