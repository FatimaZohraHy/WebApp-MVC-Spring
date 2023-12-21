package com.scolaire.ecolematernelle.Repository;

import com.scolaire.ecolematernelle.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
}
