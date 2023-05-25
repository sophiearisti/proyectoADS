package Controlador;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Modelo.Deportista;
import Modelo.Olimpiada;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ControladorListaDeDeportistasPorCompetencia implements Initializable{

	    @FXML
	    private Button BAtras;

	    @FXML
	    private TableColumn<Deportista, String> ColumnFacultad;

	    @FXML
	    private TableColumn<Deportista, Integer> ColumnNoInscripcion;

	    @FXML
	    private TableColumn<Deportista, String> ColumnNombre;

	    @FXML
	    private ComboBox<String> ComboBox;

	    @FXML
	    private TableView<Deportista> TablaDeportistas;
	    
	    private ObservableList<Deportista> listaDeportistas; 
	    
	    
	    public void initialize ( URL arg0, ResourceBundle arg1) {
	    	listaDeportistas = FXCollections.observableArrayList();
	    	ColumnNombre.setCellValueFactory(new PropertyValueFactory<Deportista, String>("Nombre"));
	    	ColumnFacultad.setCellValueFactory(new PropertyValueFactory<Deportista, String>("DelegacionPertenece"));
	    	ColumnNoInscripcion.setCellValueFactory(new PropertyValueFactory<Deportista, Integer>("NoInscripcion") );
	    	ComboBox.getItems().addAll(Olimpiada.getDisciplinasCategorias());
	    }
	    
	    
	   public void agregarDeportistas(ActionEvent event) 
	   {
		   
		   this.listaDeportistas.clear();
		   
		   ArrayList<Deportista> ListAuxiliar = new ArrayList<Deportista>();
		   
		   ListAuxiliar = Olimpiada.LlenarTabla(ComboBox.getValue());
		   
		   for (Deportista indice : ListAuxiliar) 
		   {
				   this.listaDeportistas.add(indice);
				   this.TablaDeportistas.setItems(listaDeportistas);
		   }
	   }
	   
	
	   public void IrAMenuJuez(ActionEvent event) throws IOException
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
