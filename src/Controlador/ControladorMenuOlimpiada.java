package Controlador;

import java.io.IOException;

import Modelo.Deportistas;
import Modelo.Disciplinas;
import Modelo.Jueces;
import Modelo.Delegaciones;
import Modelo.Olimpiada;
import Perisitencia.ManejadorArchivos;
import jakarta.xml.bind.JAXBException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class ControladorMenuOlimpiada {

    @FXML
    private Button BMenuComitiva;
    
    @FXML
    private Button BJuez;

    @FXML
    private Button salir;

    @FXML
    void MenucOMITIVA(ActionEvent event) throws IOException 
    {
    	Stage stage;
   	 	Scene scene;
   	 	Parent root;
   	 
   	 
   	 	root = FXMLLoader.load(getClass().getResource("/Vista/MenuComitiva.fxml"));
	    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();			
    }

    @FXML
    void SalirDeAplicacion(ActionEvent event) throws JAXBException 
    {
    	Deportistas dep=new Deportistas(Olimpiada.getDeportistas());
		ManejadorArchivos.escribirEnArchivoXMLDeportistas(dep);
		
		Delegaciones del=new Delegaciones(Olimpiada.getDelegaciones());
		ManejadorArchivos.escribirEnArchivoXMLDelegaciones(del);
		
		Disciplinas disp=new Disciplinas(Olimpiada.getDisciplinas());
		ManejadorArchivos.escribirEnArchivoXMLDisciplinas(disp);
		
		Jueces jue=new Jueces(Olimpiada.getJueces());
		ManejadorArchivos.escribirEnArchivoXMLJueces(jue);
		
		
    	Platform.exit();
    }
    
    @FXML
    void AbrirPantallaJuez(ActionEvent event) throws IOException 
    {
    	Stage stage;
   	 	Scene scene;
   	 	Parent root;
   	 
   	 
   	 	root = FXMLLoader.load(getClass().getResource("/Vista/MenuJuez.fxml"));
	    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

    }


}
