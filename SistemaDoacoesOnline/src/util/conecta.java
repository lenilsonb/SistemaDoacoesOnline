/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
import model.Tela02;
/**
 *
 * @author ADS2311011
 */
public class conecta {

    public static Connection conectar() throws ClassNotFoundException{
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fatec","root","1234");
        }catch (SQLException e){
            System.err.println(""+e.getMessage());
        }
        
        return conn;
    }
    
    public void saveAtributes(String[] list) throws SQLException, ClassNotFoundException{
        PreparedStatement ps = null;
        String sql = "INSERT INTO Doacao (Nome,Telefone,Email,Endereco,Tipo,Quantidade,Descricao) VALUES(?,?,?,?,?,?,?);";
        ps = this.conectar().prepareStatement(sql);
        ps.setString(1,list[0]);
        ps.setString(2,list[1]);
        ps.setString(3,list[2]);
        ps.setString(4,list[3]);
        ps.setString(5,list[4]);
        ps.setString(6,list[5]);
        ps.setString(7,list[6]);
        
        ps.execute();
        
    }
    
    public void getAtributes() throws SQLException, ClassNotFoundException{
        /*
        PreparedStatement ps = null;
        String sql = "SELECT * FROM doacao";
        ps = this.conectar().prepareStatement(sql);
        
        String[] valind = new String[8];
        String[][] valores = new String[8][];

        ResultSet res = ps.executeQuery();
        
        
        while(res.next()){
            
        }*/
        
    }
}
