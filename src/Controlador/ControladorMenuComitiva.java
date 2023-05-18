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

public class ControladorMenuComitiva  {
    
	@FXML
    private Button BAceptarNotificacion;

    @FXML
    private Button BAtras;

    @FXML
    private Button BDelegacionesMayorPuntaje;

    @FXML
    private Button BDesfilePorDelegacion;

    @FXML
    private Button BEditarDelegacion;

    @FXML
    private Button BEditarDeportista;

    @FXML
    private Button BEliminarDelegacion;

    @FXML
    private Button BEliminarDeportista;

    @FXML
    private Button BInscribirDelegacion;

    @FXML
    private Button BMedalleriaPorDisciplina;

    @FXML
    private Button BinscribirDeportistas;

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
    void PantallaDesfile(ActionEvent event) throws IOException 
    {

    	Stage stage;
   	 	Scene scene;
   	 	Parent root;
   	 
   	 
   	 	root = FXMLLoader.load(getClass().getResource("/Vista/PantallaOrdenDeDesfilePorDelegacion.fxml"));
	    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    void PantallaEditardeportista(ActionEvent event) throws IOException 
    {
    	Stage stage;
   	 	Scene scene;
   	 	Parent root;
   	 
   	 
   	 	root = FXMLLoader.load(getClass().getResource("/Vista/PantallaEditarDeportista.fxml"));
	    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    	
    }

    @FXML
    void PantallaEliminarDeportista(ActionEvent event) throws IOException 
    {
    	/*Stage stage;
   	 	Scene scene;
   	 	Parent root;
   	 
   	 
   	 	root = FXMLLoader.load(getClass().getResource("/Vista/MenuComitiva.fxml"));
	    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();*/
    	
    }

    @FXML
    void PantallaInscribirDeportista(ActionEvent event) throws IOException 
    {
    	Stage stage;
   	 	Scene scene;
   	 	Parent root;
   	 
   	 
   	 	root = FXMLLoader.load(getClass().getResource("/Vista/PantallaInscribirDeportista.fxml"));
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
