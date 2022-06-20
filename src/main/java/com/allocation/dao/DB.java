package com.allocation.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    private static String user ="root";
    private static String password ="";
    private static String url ="jdbc:mysql://localhost:3306/maven";

    
 private static Connection conn = null;
  public  static Connection getConnection() {
     try {
conn = DriverManager.getConnection(url ,user ,password);
if(conn!=null){
System.out.println("connection success");
}else{
System.out.println("connection failed");

}    
} catch (Exception e) {
  System.out.println(e.getMessage());

}
return conn;
  }



}
