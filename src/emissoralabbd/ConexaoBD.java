/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emissoralabbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aulos
 */
public class ConexaoBD {
    
    private static Connection con;
    
    
    /*
    * Conecta à base de dados
    * @param username, password
    * @return Connection
    */
    public static Connection ConectaBD (String username, String password){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(Exception ex){
            System.out.println("Classe "+ex);
        }
        
        try{
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.183.2:1521:orcl", username, password);
            return con;
        }
        catch(Exception ex){
            System.out.println("Conecta "+ex);
            return null;
        }
    }
    
}
