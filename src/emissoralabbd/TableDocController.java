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
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.sql.SQLException;


/**
 *
 * @author aulos
 */
public class TableDocController implements Initializable {
    ConexaoBD conex = new ConexaoBD();
    
    // Label indicadora de conexão
    @FXML
    private Label labelConexao;
    
    // Botao no menu para abrir/fechar conexao
    @FXML
    private MenuItem opcaoConectar;
    
    /*
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    */
    
    /*
    * Abre/fecha conexão com a base, dependendo do contexto.
    * @trigger ActionEvent
    * @trows SQLException,
    */
    @FXML
    private void menuConectarAction(ActionEvent event){
        if(opcaoConectar.getText().equals("Conectar")){
            System.out.println("hi, i'll now attempt to connect!");
            conex.setCon(conex.conectaBD("a7986409","alpha7rho"));
            if(conex.getCon() == null){
                System.out.println("FALHA DE CONEXA");
                labelConexao.setText("Conexão: ERRO");

            }
            else{
                System.out.println("Conectado!");
                labelConexao.setText("Conexão: CONECTADO");
                opcaoConectar.setText("Desconectar");
            }
        }
        else{
            try{
                System.out.println("Tentando desconectar!");
                conex.desconectaBD();
                System.out.println("Desconectado!");
                labelConexao.setText("Conexão: DESCONECTADO");
                opcaoConectar.setText("Conectar");
            }
            catch(SQLException ex){
                System.out.println("ERRO: "+ex);
            }
        }
        
    }
    
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
