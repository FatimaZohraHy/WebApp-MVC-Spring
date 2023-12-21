package com.scolaire.ecolematernelle.Controller;

import com.scolaire.ecolematernelle.Entity.Etudiant;
import com.scolaire.ecolematernelle.Service.AbsenceService;
import com.scolaire.ecolematernelle.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/Etudiant")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @Autowired
    private AbsenceService absenceSer;

    @GetMapping("/")
    public String Home(Model model){

        return "index";

    }

    @GetMapping("/all")
    public String getAllEtudiants(Model model){
        model.addAttribute("Etudiants",etudiantService.getEtudiants());
        return "listetudiants";
    }
    @GetMapping("/add")
    public String showAddStudentForm(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        return "/ajouterEtudiantForm";
    }

    @PostMapping("/save")
    public String addStudent(@ModelAttribute Etudiant etudiant) {

        etudiantService.ajtEtud(etudiant);
        return "redirect:/Etudiant/all";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        absenceSer.deleteByAbsenceId(id);
        etudiantService.deleteByEtudiantId(id);
        return "redirect:/Etudiant/all";
    }








}

