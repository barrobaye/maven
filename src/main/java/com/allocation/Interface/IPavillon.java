package com.allocation.Interface;

import java.util.List;

import com.allocation.model.Pavillon;

public interface IPavillon {
    boolean addPavillon(Pavillon pavillon);
    List<Pavillon> allPavillon();
    Pavillon findPavillonById(int id);
    boolean deletPavillon(Pavillon pavillon);
}
