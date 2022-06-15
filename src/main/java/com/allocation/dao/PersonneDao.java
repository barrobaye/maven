package com.allocation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.allocation.model.Personne;

public class PersonneDao {
    public ResultSet getAllPersonnes() throws SQLException{
        Connection conn = DB.getConnection();
        String query = "Select * From Personne";
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        return rs;
    }

    public boolean AddPersonne(Personne personne) throws SQLException  {
        Connection conn = DB.getConnection();
        String query = "INSER INTO personne(nom ,prenom,telephone)VALUES (?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1,personne.getNom());
            statement.setString(1,personne.getPrenom());
            statement.setString(1,personne.getTelephone());

            statement.execute();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
}