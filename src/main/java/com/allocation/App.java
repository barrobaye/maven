package com.allocation;

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
public class App 
{
    public static void main( String[] args ) throws SQLException{
        System.out.println("Allocation Etudiant"); 
        AcceuilService acceuil = new AcceuilService();
        PavillonService pavillonservice = new PavillonService();
        ChambreService chambreservice = new ChambreService();
        Pavillon pavillon = new Pavillon();
        Chambre chambre = new Chambre();
        Scanner clic =  new Scanner(System.in);
       Scanner  sc =  new Scanner(System.in);
        int choix = 0;
    do{
        acceuil.menu();
        choix = clic.nextInt();
        switch(choix){
            case 1:
            System.out.println("^^^^^^^^^^ Ajoute Chambre ^^^^^^^^^^^^");
                                chambreservice.addChambre(chambre);
                                break;
            case 2:
            System.out.println("^^^^^^^^^^ Ajoute Pavillon ^^^^^^^^^^^^");
                            pavillonservice.addPavillon(pavillon);

         default:
            break;
        }
    }while (choix >= 6);
    

}
}
/*  ChambreService chambreservice = new ChambreService();
        Chambre chambre = new Chambre();
        chambre.setNumbChambre(23);
        chambre.setNumbEtage(2);
        chambre.setTypeChambre("ezrezr");
        chambreservice.addChambre(chambre);  */
/* 
        List<Chambre> chambre = chambreservice.allChambre();
        for ( Chambre chambres: chambre){
            System.out.println("##########################");
            System.out.println("ID : " + chambre.getId());
            System.out.println("Nom : " + chambre.getNumbChambre());
            System.out.println("Prenom : " + chambre.getTypeChambre()); */

       
         


    /*     PersonneService personneService = new PersonneService();
        Personne personnel = new Personne();
         personnel.setNom("uyujkjjbkjkj");
        personnel.setPrenom( "jjjjj");
        personnel.setTelephone( "2217778911");
        personneService.AddPersonne(personnel);  */
         
     /*  List<Personne> personnes = personneService.getAllPersones();

        for (Personne personne : personnes) {
            System.out.println("##########################");
            System.out.println("ID : " + personne.getId());
            System.out.println("nom : " + personne.getNom());
            System.out.println("Prenom : " + personne.getPrenom());
            System.out.println("Téléphone: " + personne.getTelephone());
            
        } */
