package com.example.CRUDLodelcorder.controller;

import com.example.CRUDLodelcorder.entities.Empanada;
import com.example.CRUDLodelcorder.entities.Sanguche;
import com.example.CRUDLodelcorder.service.SangucheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;

@Controller
@RequestMapping("/api/vista/sanguches")
public class SangucheController {
    @Autowired
    SangucheService sangucheService;

    @GetMapping
    public String  getAll(Model model){
        List <Sanguche> sangucheList = sangucheService.findAll();
        model.addAttribute("sanguche", sangucheList);
        return "tablaSanguches";
    }

    @GetMapping("/nuevoSanguche")
    public String addNew(Model model){
        model.addAttribute("producto", new Sanguche());
        model.addAttribute("action", "/api/vista/sanguches/nuevoSanguche");
        return "formularioNuevoProducto";
    }


    @PostMapping("/nuevoSanguche")
    public String confirmAddNew ( @ModelAttribute Sanguche sanguche){
        sangucheService.addNew(sanguche);
        return "redirect:/api/vista/sanguches";

    }

    @GetMapping("/deleteSanguche/{id}")
    public String deleteSangucheForId(@PathVariable Long id){
       sangucheService.deleteforId(id);
        return "redirect:/api/vista/sanguches";
    }

    @GetMapping("/editSanguche/{id}")
    public String openFormEdit(@PathVariable Long id, Sanguche sanguche, Model model){
        sanguche = sangucheService.findForId(id);

        if(!sanguche.equals(null)){
            model.addAttribute("producto", sanguche);
            model.addAttribute("action", "/api/vista/sanguches/editSanguche/" + id);
            return "formEditProductos";
        }

        return "redirect:/api/vista/sanguches/";
    }
@PostMapping("/editSanguche/{id}")
    public String saveSangucheEdit (@PathVariable Long id,@ModelAttribute Sanguche sanguche){
        sangucheService.updateForId(id, sanguche);
        return "redirect:/api/vista/sanguches";
}



}
