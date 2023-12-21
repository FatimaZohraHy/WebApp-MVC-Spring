package com.scolaire.ecolematernelle.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_etudiant;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private Integer Age;

    public Etudiant() {
    }

    public Etudiant(Long id_etudiant, String fullName, Integer age) {
        this.Id_etudiant = id_etudiant;
        this.fullName = fullName;
        this.Age = age;
    }

    public Long getId_etudiant() {
        return Id_etudiant;
    }

    public void setId_etudiant(Long id_etudiant) {
        Id_etudiant = id_etudiant;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public List<Cour> getListcours() {
        return listcours;
    }

    public void setListcours(List<Cour> listcours) {
        this.listcours = listcours;
    }

    public List<Absence> getAbsences() {
        return absences;
    }

    public void setAbsences(List<Absence> absences) {
        this.absences = absences;
    }








    @ManyToMany(mappedBy = "listetudiant")
    private List<Cour> listcours;

    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.REMOVE)
    private List<Absence> absences;

}
