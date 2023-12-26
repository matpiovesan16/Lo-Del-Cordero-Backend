package com.example.CRUDLodelcorder.controller;

import com.example.CRUDLodelcorder.entities.Empanada;
import com.example.CRUDLodelcorder.service.EmpanadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/vista/empanadas")
public class EmpanadaController {

    @Autowired
    private EmpanadaService empanadaService;

    @GetMapping
    public String listarEmpanadas(Model model){
        List <Empanada> empanadas = empanadaService.findAll();
        model.addAttribute("empanadaLista", empanadas);
        return "tablaEmpandas";
    }
    @GetMapping("/nuevaEmpanada")
    public String mostrarFormNueva(Model model){
        model.addAttribute("producto", new Empanada());
        model.addAttribute("action", "/api/vista/empanadas/nuevaEmpanada");
        return "formularionueva";

    }

    @PostMapping("/nuevaEmpanada")
    public String addNew(@ModelAttribute Empanada empanada){
        empanadaService.addNew(empanada);
        return "redirect:/api/vista/empanadas";
    }

    @GetMapping("/deleteEmpanada/{id}")
    public String deleteForId(@PathVariable Long id){
        empanadaService.deleteforId(id);
        return "redirect:/api/vista/empanadas";

    }


        @GetMapping("/editEmpanada/{id}")
        public String mostrarFormEdit(@PathVariable Long id,Model model, Empanada empanada){
         empanada = empanadaService.findForId(id);

        if(!empanada.equals(null)){
            model.addAttribute("empanada", empanada);
            model.addAttribute("action", "/api/vista/empanadas/editEmpanada/" + id);
            return "formedit";
        }

        return "redirect:/api/vista";


    }
        @PostMapping("/editEmpanada/{id}")
        public String saveEmpanadaEdit(@PathVariable Long id, @ModelAttribute Empanada empanada){
        empanadaService.updateForId(id,empanada);
        return "redirect:/api/vista/empanadas";

        }




}
