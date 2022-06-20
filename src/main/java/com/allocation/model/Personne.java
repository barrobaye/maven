package com.allocation.model;

public class Personne {
   protected int id;
    public String nom;
    public String prenom;
    public String telephone;

    
   
    public Personne(int id, String nom, String prenom, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }
    public Personne() {
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public void add(Personne personne) {
    }
  
}
