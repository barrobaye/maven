package com.allocation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.allocation.model.Personne;

public class PersonneDao {
    public PersonneDao() {
    }

    public static ResultSet getAllPersones() throws SQLException{
        Connection conn = DB.getConnection();
        String query = "Select *From Personne";
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        return rs;
    }

    public boolean AddPersonne(Personne personne) {
        Connection conn = DB.getConnection();
        String query = "INSERT INTO Personne (nom,prenom,telephone) VALUES(?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1,personne.getNom());
            statement.setString(2,personne.getPrenom());
            statement.setString(3,personne.getTelephone());

            statement.execute();
            statement.close();
            conn.close();
            System.out.println("ajouter avec success");
        return true;
       

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("ajout non réussit");
        return false;

    }
}