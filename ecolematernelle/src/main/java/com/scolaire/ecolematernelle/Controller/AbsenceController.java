package com.scolaire.ecolematernelle.Controller;

import com.scolaire.ecolematernelle.Entity.Absence;
import com.scolaire.ecolematernelle.Entity.Etudiant;
import com.scolaire.ecolematernelle.Service.AbsenceService;
import com.scolaire.ecolematernelle.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Absence")
public class AbsenceController {

    @Autowired
    private AbsenceService absenceService;
    @Autowired
    private EtudiantService etudiantService;

    @GetMapping("/ajouter")
    public String showAddAbsenceForm(Model model) {
        List<Etudiant> etudiants = etudiantService.getEtudiants();
        model.addAttribute("etudiants",etudiants);
        model.addAttribute("absence", new Absence());
        return "/ajouterAbsenceForm";
    }

    @PostMapping("/sauvegarder")
    public String saveAbsence(@ModelAttribute Absence absence) {
        Etudiant etudiant = absence.getEtudiant();

        if (etudiant != null) {
            absence.setEtudiant(etudiant);

            etudiant.getAbsences().add(absence);

            absenceService.addAbsence(absence);
        }

        return "redirect:/Absence/all";
    }

    @GetMapping("/all")
    public String showAllAbsences(Model model) {
        List<Absence> absences = absenceService.getAllAbsencesWithStudents();
        model.addAttribute("absences", absences);
        return "absencesliste";
    }

}
