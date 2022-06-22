package com.allocation.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.allocation.Interface.IPavillon;
import com.allocation.dao.PavillonDao;
import com.allocation.model.Pavillon;

public class PavillonService implements IPavillon {
    Scanner  sc =  new Scanner(System.in);

    @Override
    public boolean addPavillon(Pavillon pavillon) {
        System.out.println("Saisir le numéro du Pavillon");
        pavillon.setNumbPavillon(sc.nextInt());
        System.out.println("Saisir le nombre d'Etage ");
        pavillon.setNombreEtage(sc.nextInt());
        PavillonDao pavillondao = new PavillonDao();
           return pavillondao.addPavillon(pavillon); 
            }

 

    @Override
    public List<Pavillon> allPavillon() {
        List<Pavillon> pavillon = new ArrayList<>();
        try {
            ResultSet rs =  PavillonDao.getAllPavillon();
            if (rs != null){
                while (rs.next()){
                    pavillon =new Pavillon();
                    pavillon.setId(rs.getInt("id"));
                    pavillon.setNumbPavillon(rs.getString("numbPavillon"));
                    pavillon.setNombrePavillon(rs.getString("nombrePavillon"));
                   
                    
                    pavillons.add(pavillon);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pavillons;
    }

    @Override
    public boolean deletPavillon(Pavillon pavillon) {
        System.out.println("Saisir l'id du Pavillon");
        if(Pavillon.equals(pavillon.getId()))== sc.nextInt
        pavillon.setId(sc.nextInt());
        return false;
    }

    @Override
    public boolean deletPavillon(int id, Pavillon pavillon) {
        // TODO Auto-generated method stub
        return false;
    }



    @Override
    public boolean addPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        return false;
    }



    @Override
    public boolean deletPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
