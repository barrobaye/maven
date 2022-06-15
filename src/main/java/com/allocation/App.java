package com.allocation;

import java.sql.SQLException;
import java.util.List;

import com.allocation.Service.PersonneService;
import com.allocation.dao.DB;
import com.allocation.model.Personne;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );
        DB.getConnection();
        PersonneService personneService = new PersonneService();
        Personne personnel = new Personne();
        personnel.setPrenom( "jjjjj");
        personnel.setNom("hhh");
        personnel.setTelephone( "2217778911");
        personneService.AddPersonne(personnel);
         
        List<Personne> personnes = personneService.getAllPersonnes();

        for (Personne personne : personnes) {
            System.out.println("##########################");
            System.out.println("ID : " + personne.getId());
            System.out.println("Nom : " + personne.getNom());
            System.out.println("Prenom : " + personne.getPrenom());
        }
    }

}
