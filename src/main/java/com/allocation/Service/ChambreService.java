package com.allocation.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.allocation.Interface.IChambre;
import com.allocation.dao.chambreDao;
import com.allocation.model.Chambre;

public  class ChambreService implements IChambre {


    @Override
    public boolean addChambre(Chambre chambre) {
        chambreDao chambredao = new chambreDao();
           return chambredao.addChambre(chambre); 
       
    }

    @Override
    public  List<Chambre> allChambre() {
        List<Chambre> chambres = new ArrayList<>();
        try {
            ResultSet rs =  chambreDao.allChambre();
            if (rs != null){
                while (rs.next()){
                    Chambre chambre=new Chambre();
                    chambre.setNumbChambre(rs.getInt("numbChambre"));
                    chambre.setNumbEtage(rs.getInt("numbEtage"));
                    chambre.setTypeChambre(rs.getString("typeEtage"));
                   chambre.setId(rs.getInt("id"));
                    
                   chambres.add(chambre);
                   System.out.println("ajouter avec sucess");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return chambres;
       
    }

    @Override
    public Chambre getChambreByEtat() {
        return null;
    }

    


    
}
