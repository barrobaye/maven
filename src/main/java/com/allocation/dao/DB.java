package com.allocation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static String user ="root";
    private static String password ="";
    private static String url ="jdbc:mysql://localhost:3306/maven";
 private static Connection conn = null;


  public  static Connection getConnection() throws SQLException{
conn = DriverManager.getConnection(url ,user ,password);
if(conn!=null){
System.out.println("connection success");
}else{
System.out.println("connection failed");

}
try {
    
} catch (Exception e) {
  System.out.println(e.getMessage());

}
return conn;
  }



}
