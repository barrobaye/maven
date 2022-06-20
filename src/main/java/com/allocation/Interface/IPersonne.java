package com.allocation.Interface;

import java.util.List;

import com.allocation.model.Personne;

public interface IPersonne {
    boolean AddPersonne (Personne personne);
    List<Personne> getAllPersones();
  Personne getPersonnesById(int Id);
}
