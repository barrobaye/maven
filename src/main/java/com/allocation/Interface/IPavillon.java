package com.allocation.Interface;

import java.util.List;

import com.allocation.model.Pavillon;

public interface IPavillon {
    boolean addPavillon(Pavillon pavillon);
    List<Pavillon> allPavillon();
    boolean deletPavillon(Pavillon pavillon);
}
