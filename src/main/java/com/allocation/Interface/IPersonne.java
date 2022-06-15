package com.allocation.Interface;

import java.util.List;

import com.allocation.model.Personne;

public interface IPersonne {
    boolean AddPersonne (Personne personne);
    public List<Personne> getAllPersonnes();
   public  Personne getPersonnesById(int Id);
}
