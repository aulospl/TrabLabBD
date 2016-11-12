/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emissoralabbd;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.sql.SQLException;
/**
 *
 * @author aulos
 */
public class TableDocController implements Initializable {
    ConexaoBD conex = new ConexaoBD();
    /*
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    */
    
    @FXML
    private void testButtonAction(ActionEvent event){
        System.out.println("hi, i'll now attempt to connect!");
        conex.conectaBD("a7986409","alpha7rho");
        try{
            conex.desconectaBD();
            System.out.println("Desconectado!");
        }
        catch(SQLException ex){
            System.out.println("ERRO: "+ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
