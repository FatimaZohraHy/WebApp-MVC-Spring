package com.scolaire.ecolematernelle.Repository;

import com.scolaire.ecolematernelle.Entity.Absence;
import com.scolaire.ecolematernelle.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbsenceRepo extends JpaRepository<Absence,Long> {
}
