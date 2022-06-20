package com.allocation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.allocation.model.Chambre;

public class chambreDao {
    public static ResultSet allChambre() throws SQLException{
        Connection conn = DB.getConnection();
        String query = "Select * From Chambre";
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        return rs;
    }


    public boolean addChambre(Chambre chambre){
        Connection conn = DB.getConnection();
        String query = "INSERT INTO Chambre (numbChambre,typeChambre,numbEtage) VALUES(?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1,chambre.getNumbChambre());
            statement.setString(2,chambre.getTypeChambre());
            statement.setInt(3,chambre.getNumbEtage());

            statement.execute();
            statement.close();
            conn.close();
            System.out.println("ajouter avec success");
        return true;
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println("ajoute non reussi");
       return false;
    }

    public chambreDao() {
    }
    
}
