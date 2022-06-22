package com.allocation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.allocation.model.Pavillon;

public class PavillonDao {
    public boolean addPavillon(Pavillon pavillon){
        Connection conn = DB.getConnection();
        String query = "INSERT INTO Pavillon (numbPavillon,nombreEtage) VALUES(?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1,pavillon.getNumbPavillon());
            statement.setInt(2,pavillon.getNombreEtage());
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
    public boolean deletePavillon(Pavillon pavillon){
        Connection conn = DB.getConnection();
        String query = "DELETE FROM Pavillon WHERE ?";
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1,pavillon.getId());
            statement.execute();
            statement.close();
            conn.close();
            System.out.println("supprimer avec success");
            return true;
        }catch (Exception e) {

        }
        System.out.println("delete non reussi");
        return false;
    }
    public static ResultSet getAllPavillon() throws SQLException{
        Connection conn = DB.getConnection();
        String query = "Select *From Pavillon";
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        return rs;
    }
}

