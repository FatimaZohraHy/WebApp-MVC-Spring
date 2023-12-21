package com.scolaire.ecolematernelle.Service;

import com.scolaire.ecolematernelle.Entity.Absence;
import com.scolaire.ecolematernelle.Entity.Etudiant;
import com.scolaire.ecolematernelle.Repository.AbsenceRepo;
import com.scolaire.ecolematernelle.Repository.EtudiantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AbsenceService {

    @Autowired
    private AbsenceRepo absenceRepo;

    public Absence addAbsence(Absence absence) {
        return absenceRepo.save(absence);
    }

    public List<Absence> getAllAbsences() {
        return absenceRepo.findAll();
    }

    public List<Absence> getAllAbsencesWithStudents() {
        return absenceRepo.findAll();
    }

    public void deleteByAbsenceId(Long id) {
        absenceRepo.deleteById(id);
    }
}
