package com.allocation.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.allocation.Interface.IPersonne;
import com.allocation.dao.PersonneDao;
import com.allocation.model.Personne;

public class PersonneService  implements IPersonne{

    @Override
    public boolean AddPersonne(Personne personne) {
        PersonneDao personneDao = new PersonneDao();
            try {
                return personneDao.AddPersonne(personne);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return false;
    }

    @Override
    public List<Personne> getAllPersonnes() {
        PersonneService personneDao = new PersonneService();
        List<Personne> personnes = new ArrayList<>();
        try {
            ResultSet rs = (ResultSet) personneDao.getAllPersonnes();
            if (rs!= null){
                while (rs.next()){
                    Personne personne =new Personne();
                    personne.setNom(rs.getString("nom"));
                    personne.setPrenom(rs.getString("prenom"));
                    personne.setNom(rs.getString("telephone"));
                    
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
