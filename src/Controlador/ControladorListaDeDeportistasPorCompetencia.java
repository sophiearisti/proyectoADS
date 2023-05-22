package Controlador;
import java.util.ResourceBundle;

import Modelo.Olimpiada;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.event.ActionEvent;
import java.net.URL;

public class ControladorListaDeDeportistasPorCompetencia implements Initializable{

	    @FXML
	    private Button BAtras;

	    @FXML
	    private TableColumn<?, ?> ColumnFacultad;

	    @FXML
	    private TableColumn<?, ?> ColumnNoInscripcion;

	    @FXML
	    private TableColumn<?, ?> ColumnNombre;

	    @FXML
	    private ComboBox<String> ComboBox;

	    @FXML
	    private TableView<?> TablaDeportistas;
	    
	    
	    public void initialize ( URL arg0, ResourceBundle arg1) {
	    	
	    	ComboBox.getItems().addAll(Olimpiada.getDisciplinasCategorias());
	    	//ComboBox.setOnAction(this::getNombreDisciplina);
	    }
	    
	    
	    public void getNombreDisciplina(ActionEvent event) {
	    	
	    	String myDisciplina = ComboBox.getValue();
	    	
	    }

	
	    

}
