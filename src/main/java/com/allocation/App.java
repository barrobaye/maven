package com.allocation;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.allocation.Service.AcceuilService;
import com.allocation.Service.ChambreService;
import com.allocation.Service.PavillonService;
import com.allocation.Service.PersonneService;
import com.allocation.dao.DB;
import com.allocation.dao.chambreDao;
import com.allocation.model.Chambre;
import com.allocation.model.Pavillon;
import com.allocation.model.Personne;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args)throws Exception{
        Connection conn = DB.getConnection();
        System.out.println("Allocation Etudiant");
        AcceuilService acceuil = new AcceuilService();
        PavillonService pavillonservice = new PavillonService(null);
        ChambreService chambreservice = new ChambreService(null);
        Pavillon pavillon = new Pavillon();
        Chambre chambre = new Chambre();
        Scanner clic = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int idPavillon;
        int choix = 0;
        do {
            acceuil.menuAcceuil();
            choix = clic.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("^^^^^^^^^^Chambre^^^^^^^^^^^^");
                        acceuil.menuChambre();
                        int choceChambre = 0;
                        choceChambre = clic.nextInt();
                        switch(choceChambre){
                          case 1:
                          chambreservice.addChambre(chambre);
                          case 2:
                          System.out.println("saisir l'id du Chambre");
                          idPavillon = sc.nextInt();
                          pavillonservice.delete(idPavillon);                        
                        }
                case 2:
                    System.out.println("^^^^^^^^^^Pavillon ^^^^^^^^^^^^");
                    acceuil.menuPavillon();
                    int chocepav = 0;
                    chocepav = clic.nextInt();
                    switch(chocepav){
                      case 1:
                      pavillonservice.addPavillon(pavillon);
                      break;
                      case 2:
                      System.out.println("saisir l'id du Pavillon");
                      idPavillon = sc.nextInt();
                      pavillonservice.delete(idPavillon);
                      break;
                    }
                case 3:
                    System.out.println("^^^^^^^^^^ Quitter ^^^^^^^^^^^^");
                    break;
                     
                default:
                    break;
            }
        } while (choix >= 4);
        conn.close();
    }
}
   
