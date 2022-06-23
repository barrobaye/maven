package com.allocation.Service;

import java.sql.Connection;
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
   PavillonService pavillonservice;
  PavillonDao pavillondao;
   



    public PavillonService(Connection con) {
        pavillondao = new PavillonDao(con);
}



    @Override
    public boolean addPavillon(Pavillon pavillon) {
        System.out.println("Saisir le numéro du Pavillon");
        pavillon.setNumbPavillon(sc.nextInt());
        System.out.println("Saisir le nombre d'Etage ");
        pavillon.setNombreEtage(sc.nextInt());
           return pavillondao.addPavillon(pavillon); 
            }

 

    @Override
    public List<Pavillon> allPavillon() {
        List<Pavillon> pavillons = new ArrayList<>();
        try {
            ResultSet rs =  pavillondao.getAllPavillon();
            if (rs != null){
                while (rs.next()){
                   Pavillon pavillon =new Pavillon();
                    pavillon.setId(rs.getInt("id"));
                    pavillon.setNombreEtage(rs.getInt("nombreEtage"));
                    pavillon.setNumbPavillon(rs.getInt("numbPavillon"));
                    pavillons.add(pavillon);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pavillons;
    }
    public void delete(int idPavillon){
        Pavillon pavDelete = pavillonservice.findPavillonById(idPavillon);
        if (pavDelete == null) {
            System.out.println("pavillon inexistant");
        }else{
            pavillonservice.deletPavillon(pavDelete);
        }
    }

    @Override
    public boolean deletPavillon(Pavillon pavillon) {
        return pavillondao.deletePavillon(pavillon);
    }



    @Override
    public Pavillon findPavillonById(int id) {
        Pavillon pavillon = new Pavillon();
        ResultSet rs = pavillondao.findPavillon(id);
        try {
            while (rs.next()){
                pavillon.setId(rs.getInt("id"));
                pavillon.setNombreEtage(rs.getInt("nombreEtage"));
                pavillon.setNumbPavillon(rs.getInt("numbPavillon"));
            }
            return pavillon;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

   



  



 
    
}
