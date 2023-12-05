/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexao;

import util.conecta;


/**
 *
 * @author ADS2311011
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        
        conecta c = new conecta();
        c.conectar();
        
    }
    
}
