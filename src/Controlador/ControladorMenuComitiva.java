package Controlador;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControladorMenuComitiva  {

    @FXML
    private Button BAtras;

    @FXML
    private Button BInscribirDelegacion;

    @FXML
    private Button BinscribirDeportistas;

    @FXML
    void InscribirDelegacion(ActionEvent event) {

    }

    @FXML
    void InscribirDeportista(ActionEvent event) {

    }

    @FXML
    void VolverAMenuPrincipal(ActionEvent event) throws IOException 
    {
    	Stage stage;
   	 	Scene scene;
   	 	Parent root;
   	 
   	 
   	 	root = FXMLLoader.load(getClass().getResource("/Vista/MenuOlimpiadas.fxml"));
	    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

}
