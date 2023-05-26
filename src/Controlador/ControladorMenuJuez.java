package Controlador;

import java.awt.Rectangle;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControladorMenuJuez  {
    
	@FXML
    private Button BAceptarNotificacion;

    @FXML
    private Button BAsignarMedalla;

    @FXML
    private Button BAtras;

    @FXML
    private Button BDeportistasXCompetencia;

    @FXML
    private Text ERRORNotificacion;

    @FXML
    private Text ExplicacionNotificacion;

    @FXML
    private Button VentanaNotificacion;

    private Alert alert = new Alert(Alert.AlertType.ERROR);

    @FXML
    void FuncionalidadNoImplementada(ActionEvent event) 
    {
    	System.out.println("El deportista ingresado ya existe");
        alert.setTitle("NO IMPLEMENTADA");
        alert.setHeaderText("Funcionalidad no implementada");
        alert.setContentText("La funcionalidad a la que esta queriendo ingresar todavia no ha sido implementada");
        alert.show();
    }

    @FXML
    void PantallaListarDeportistas(ActionEvent event) throws IOException 
    {

    	Stage stage;
   	 	Scene scene;
   	 	Parent root;
   	 
   	 
   	 	root = FXMLLoader.load(getClass().getResource("/Vista/ListaDeDeportistasPorCompetencia.fxml"));
	    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
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
