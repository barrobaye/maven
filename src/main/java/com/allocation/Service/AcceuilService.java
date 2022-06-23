package com.allocation.Service;

public class AcceuilService {
    public void menu(){
        System.out.println("#########_Menu_##########");
        System.out.println("1-####Ajouter_Un_Chambre####");
        System.out.println("2-####Ajouter_Un_Pavillons####");
        System.out.println("3-####Supprimer_Pavillons####");
        System.out.println("4-####Lister_Les_Chambres####");
        System.out.println("5-####Modifier_Chambre####");
        System.out.println("6-####Modifier_Pavillon####");
        System.out.println("7-####Suppimer_Pavillon####");

    }    public void menuChambre(){
        System.out.println("#########_Menu-Chambre_##########");
        System.out.println("1-####Ajouter_Un_Chambre####");
        System.out.println("2-####Lister Chambre####");
        System.out.println("3-####Supprimer_Chambre####");
    }
    public void menuPavillon(){
        System.out.println("#########_Menu-Pavillon_##########");
        System.out.println("1-####Ajouter_Un_Pavillon####");
        System.out.println("2-####Lister Pavillon####");
        System.out.println("3-####Supprimer_Pavillon####");
    }
    public void menuQuitter(){
        System.out.println("#########_Good-Bye_##########");
       
    }
    public void menuAcceuil(){
        System.out.println("#########_Menu-Acceuil_##########");
        System.out.println("1-####-Chambre-####");
        System.out.println("2-####-Pavillon-####");
        System.out.println("3-####-Quitter-####");
    }
    
}
     

/*
 * ChambreService chambreservice = new ChambreService();
 * Chambre chambre = new Chambre();
 * chambre.setNumbChambre(23);
 * chambre.setNumbEtage(2);
 * chambre.setTypeChambre("ezrezr");
 * chambreservice.addChambre(chambre);
 */
/*
 * List<Chambre> chambre = chambreservice.allChambre();
 * for ( Chambre chambres: chambre){
 * System.out.println("##########################");
 * System.out.println("ID : " + chambre.getId());
 * System.out.println("Nom : " + chambre.getNumbChambre());
 * System.out.println("Prenom : " + chambre.getTypeChambre())};
 */

/*
 * PersonneService personneService = new PersonneService();
 * Personne personnel = new Personne();
 * personnel.setNom("uyujkjjbkjkj");
 * personnel.setPrenom( "jjjjj");
 * personnel.setTelephone( "2217778911");
 * personneService.AddPersonne(personnel);
 */

/*
 * List<Personne> personnes = personneService.getAllPersones();
 * 
 * for (Personne personne : personnes) {
 * System.out.println("##########################");
 * System.out.println("ID : " + personne.getId());
 * System.out.println("nom : " + personne.getNom());
 * System.out.println("Prenom : " + personne.getPrenom());
 * System.out.println("Téléphone: " + personne.getTelephone());
 * 
 * }
 */
