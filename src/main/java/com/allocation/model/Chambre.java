package com.allocation.model;

public class Chambre {
    private int id;
    public int numbChambre;
     TypeChambre typeChambre;
     public int numbEtage;

    public Chambre() {
    }

    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
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
