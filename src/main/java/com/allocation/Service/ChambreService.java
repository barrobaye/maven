package com.allocation.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.allocation.Interface.IChambre;
import com.allocation.dao.chambreDao;
import com.allocation.model.Chambre;
import com.allocation.model.Pavillon;
import com.allocation.model.TypeChambre;

public  class ChambreService implements IChambre {
    chambreDao chambredao ;
    Scanner  sc =  new Scanner(System.in);
    public ChambreService(Connection conn) {
        chambredao = new chambreDao(conn);
    }

    @Override
    public boolean addChambre(Chambre chambre) {
        System.out.println("Saisir le numéro de la chambre");
        chambre.setNumbChambre(sc.nextInt());
        System.out.println("Choisir le type de Chambre");
        System.out.println("1-unique ou 2-à-deux");
        Scanner  type =  new Scanner(System.in);
        if(type.nextInt() == 1){
          chambre.setTypeChambre(TypeChambre.UNIQUE);
        }else if(type.nextInt() == 2){
            chambre.setTypeChambre(TypeChambre.A_DEUX);
        }else if(type.nextInt() != 2 || type.nextInt() != 1 ){
            System.out.println("1 ou 2 uniquement");
        }
        System.out.println("Saisir l'Etage de la chambre");
        chambre.setNumbEtage(sc.nextInt());
           return chambredao.addChambre(chambre); 
    }

    @Override
    public  List<Chambre> allChambre() {
        List<Chambre> chambres = new ArrayList<>();
        try {
            ResultSet rs =  chambredao.allChambre();
            if (rs != null){
                while (rs.next()){
                    Chambre chambre=new Chambre();
                    chambre.setNumbChambre(rs.getInt("numbChambre"));
                    chambre.setNumbEtage(rs.getInt("numbEtage"));
                    if (rs.getString("typeChambre") == TypeChambre.UNIQUE.toString()){
                        chambre.setTypeChambre(TypeChambre.UNIQUE);
                    }else{
                        chambre.setTypeChambre(TypeChambre.A_DEUX);
                    }
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
    public boolean deletChambre(Chambre chambre) {
        return chambredao.deleteChambre(chambre);
    }
  
    @Override
    public Chambre getChambreByEtat() {
        return null;
    }

    


    
}
