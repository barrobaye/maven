package com.allocation.model;

public class Chambre {
    private int id;
    public int numbChambre;
    
    public String typeChambre;
    public int numbEtage;
    public Chambre() {
    }
    public Chambre(int id, int numbChambre, String typeChambre, int numbEtage) {
        this.id = id;
        this.numbChambre = numbChambre;
        this.typeChambre = typeChambre;
        this.numbEtage = numbEtage;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumbChambre() {
        return numbChambre;
    }
   
    public String getTypeChambre() {
        return typeChambre;
    }
    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }
    public int getNumbEtage() {
        return numbEtage;
    }
    public void setNumbEtage(int numbEtage) {
        this.numbEtage = numbEtage;
    }
    public void setNumbChambre(int numbChambre) {
        this.numbChambre = numbChambre;
    }

}
