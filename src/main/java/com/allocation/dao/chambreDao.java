package com.allocation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.allocation.model.Chambre;
import com.allocation.model.TypeChambre;

public class chambreDao {
    private Connection con;

    public chambreDao(Connection conn) {
        this.con = conn;
    }
    public ResultSet allChambre() throws SQLException{
        if (con == null) {
            con = DB.getConnection();
        }        
        String query = "Select * From Chambre";
        PreparedStatement statement = con.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        return rs;
    }
    public ResultSet findChambre(int id){
        if (con == null) {
            con = DB.getConnection();
        }        String query = "SELECT * From Chambre WHERE id = ?";
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
    public boolean deleteChambre(Chambre chambre){
        if (con == null) {
            con = DB.getConnection();
        }        String query = "DELETE FROM Chambre WHERE id=?";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,chambre.getId());
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


    public boolean addChambre(Chambre chambre){
        if (con == null) {
            con = DB.getConnection();
        }        String query = "INSERT INTO Chambre (numbChambre,typeChambre,numbEtage) VALUES(?,?,?)";
        try {
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1,chambre.getNumbChambre());
            statement.setString(2,chambre.getTypeChambre().toString());
            statement.setInt(3,chambre.getNumbEtage());

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

    public chambreDao() {
    }
    
}
