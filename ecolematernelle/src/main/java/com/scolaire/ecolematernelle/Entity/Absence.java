package com.scolaire.ecolematernelle.Entity;


import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "absence")
public class Absence {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_absence;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private boolean justified;

    public Absence() {
    }

    public Absence(Long id_absence, Date date, boolean justified) {
        Id_absence = id_absence;
        this.date = date;
        this.justified = justified;
    }

    public Long getId_absence() {
        return Id_absence;
    }

    public void setId_absence(Long id_absence) {
        Id_absence = id_absence;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean getJustified() {
        return justified;
    }

    public void setJustified(boolean justified) {
        this.justified = justified;
    }

    public boolean isJustified() {
        return justified;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @ManyToOne
    @JoinColumn(name = "Id_etudiant")
    private Etudiant etudiant;


}
