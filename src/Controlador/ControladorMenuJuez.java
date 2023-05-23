package Controlador;

import java.awt.Rectangle;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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


    @FXML
    void AceptarNotificacion(ActionEvent event) 
    {
    	ERRORNotificacion.setVisible(false);
    	ExplicacionNotificacion.setVisible(false);
    	BAceptarNotificacion.setVisible(false);
    	VentanaNotificacion.setVisible(false);
    }

    @FXML
    void FuncionalidadNoImplementada(ActionEvent event) 
    {
    	ERRORNotificacion.setVisible(true);
    	ExplicacionNotificacion.setVisible(true);
    	VentanaNotificacion.setVisible(true);
    	BAceptarNotificacion.setVisible(true);
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
