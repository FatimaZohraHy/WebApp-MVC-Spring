package com.scolaire.ecolematernelle.Service;

import com.scolaire.ecolematernelle.Entity.Etudiant;
import com.scolaire.ecolematernelle.Repository.EtudiantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepo etudiantRepo;
    public Etudiant ajtEtud(Etudiant etudiant){
        return etudiantRepo.save(etudiant);
    }
    public void suppEtud(Etudiant etudiant){
        etudiantRepo.delete(etudiant);
    }
    public List<Etudiant> getEtudiants(){
        return etudiantRepo.findAll();
    }
    public void deleteByEtudiantId(Long Id){
        etudiantRepo.deleteById(Id);
    }


}
