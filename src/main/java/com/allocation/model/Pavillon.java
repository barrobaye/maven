package com.allocation.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Pavillon  {
    private int id ;
    int numbPavillon;
    int nombreEtage;
    public Pavillon(int id, int numbPavillon, int nombreEtage) {
        this.id = id;
        this.numbPavillon = numbPavillon;
        this.nombreEtage = nombreEtage;
    }
    public Pavillon() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumbPavillon() {
        return numbPavillon;
    }
    public void setNumbPavillon(int numbPavillon) {
        this.numbPavillon = numbPavillon;
    }
    public int getNombreEtage() {
        return nombreEtage;
    }
    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }
    @Override
    public String toString() {
        return "Pavillon [nombreEtage=" + nombreEtage + ", numbPavillon=" + numbPavillon + "]";
    }
    public boolean equals(Object obj) {
        return ((Pavillon)obj).getId() == id ;
    }
    

 
   
   
}
