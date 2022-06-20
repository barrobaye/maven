    package com.allocation.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.allocation.dao.PersonneDao;
import com.allocation.Interface.IPersonne;

import com.allocation.model.Personne;

public class PersonneService  implements IPersonne{

    @Override
    public boolean AddPersonne(Personne personne){
        PersonneDao personneDao = new PersonneDao();
        try {
            return personneDao.AddPersonne(personne);

        } catch (Exception e) {
            System.out.println("non ajouter");
        }
         return true;          
    }

    @Override
    public List<Personne>  getAllPersones() {
        List<Personne> personnes = new ArrayList<>();
        try {
            ResultSet rs =  PersonneDao.getAllPersones();
            if (rs != null){
                while (rs.next()){
                    Personne personne =new Personne();
                    personne.setId(rs.getInt("id"));
                    personne.setNom(rs.getString("nom"));
                    personne.setPrenom(rs.getString("prenom"));
                    personne.setTelephone(rs.getString("telephone"));
                   
                    
                    personnes.add(personne);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return personnes;
    }

    @Override
    public Personne getPersonnesById(int Id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
