/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
/**
 *
 * @author ADS2311011
 */
public class conecta {
    public static Connection conectar() throws ClassNotFoundException{
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fatec","root","");
        }catch (SQLException e){
            System.err.println(""+e.getMessage());
        }
        
        return conn;
    }
    
    public void saveAtributes(String[] list){
        
    }
}
