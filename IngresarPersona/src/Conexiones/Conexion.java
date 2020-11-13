package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
 public Statement conn(){
     try{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        System.out.println("conectando a la base de datos");
        Connection coneccion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "1234");
        Statement statement= coneccion.createStatement ();
        return statement;
     } catch (Exception e){
         System.out.println("error"+ e);
         return null;
     }
 }   
 
         }
