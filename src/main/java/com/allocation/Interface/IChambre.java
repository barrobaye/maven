package com.allocation.Interface;

import java.util.List;

import com.allocation.model.Chambre;

public interface IChambre {
    boolean addChambre(Chambre chambre  );
    List<Chambre> allChambre();
    Chambre getChambreByEtat();  
    boolean deletChambre(Chambre chambre);
}
