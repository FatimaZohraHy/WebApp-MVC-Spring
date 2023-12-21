package com.scolaire.ecolematernelle.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="cour")
public class Cour {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_cour;

    private String nom;

    public Cour() {
    }

    public Cour(Long id_cour, String nom) {
        Id_cour = id_cour;
        this.nom = nom;
    }

    public Long getId_cour() {
        return Id_cour;
    }

    public void setId_cour(Long id_cour) {
        Id_cour = id_cour;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @ManyToMany
    @JoinTable(
            name = "courset",
            joinColumns = @JoinColumn(name="Id_cour"),
            inverseJoinColumns = @JoinColumn(name = "Id_etudiant"))

    private List<Etudiant> listetudiant;

    public List<Etudiant> getListetudiant() {
        return listetudiant;
    }

    public void setListetudiant(List<Etudiant> listetudiant) {
        this.listetudiant = listetudiant;
    }
}
