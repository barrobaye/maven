package com.allocation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.allocation.model.Pavillon;

public class PavillonDao {
  PavillonDao pavillondao;

    public Connection con;
    public PavillonDao(Connection conn) {
        this.con = conn;
    }

    public boolean addPavillon(Pavillon pavillon){
        if (con == null) {
            con = DB.getConnection();
        }
        String query = "INSERT INTO Pavillon (numbPavillon,nombreEtage) VALUES(?,?)";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,pavillon.getNumbPavillon());
            statement.setInt(2,pavillon.getNombreEtage());
            statement.execute();
            statement.close();
            System.out.println("ajouter avec success");
        return true;
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println("ajoute non reussi");
       return false;
    }

    public ResultSet findPavillon(int id){
        if (con == null) {
            con = DB.getConnection();
        }
        String query = "SELECT * From Pavillon WHERE id = ?";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,id);
          ResultSet rs =  statement.executeQuery();
          return rs;
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return null;
    }
    public boolean deletePavillon(Pavillon pavillon){
        if (con == null) {
            con = DB.getConnection();
        }
        String query = "DELETE FROM Pavillon WHERE id=?";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,pavillon.getId());
            statement.execute();
            statement.close();
            System.out.println("Supprimer avec success");
            return true;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Delete non reussie");
        return false;
    }
    public  ResultSet getAllPavillon() throws SQLException{
        if (con == null) {
            con = DB.getConnection();
        }
        String query = "Select *From Pavillon";
        PreparedStatement statement = con.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        return rs;
    }
}

