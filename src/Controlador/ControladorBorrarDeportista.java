package Controlador;

import java.io.IOException;


import Modelo.Deportista;
import Modelo.Olimpiada;
import Modelo.Excepciones.CamposVacios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControladorBorrarDeportista {

    @FXML
    private ComboBox<String> CBCategoria;

    @FXML
    private ComboBox<String> CBDelegacion;

    @FXML
    private ComboBox<String> CBDisciplina;

    @FXML
    private RadioButton RBNoAbanderado;

    @FXML
    private RadioButton RBNoAsistencia;

    @FXML
    private RadioButton RBSiAbanderado;

    @FXML
    private RadioButton RBSiAsistencia;

    @FXML
    private TextField TEstatura;

    @FXML
    private TextField TNombre;

    @FXML
    private TextField TextBuscador;

    @FXML
    private Label labelCategoria;

    @FXML
    private Label labelDisciplina;
    
    @FXML
    private Button Bguardar;
    
    private Alert Exito = new Alert(Alert.AlertType.INFORMATION);
    private Alert alert = new Alert(Alert.AlertType.ERROR);
    
    
	@FXML
    void VolverAMenuComitiva(ActionEvent event) throws IOException 
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
    void BuscarDeportista(ActionEvent event) 
	{//Olimpiada.ObtenerDisciplinas()
		
		try 
		{
			if(TextBuscador.getText().length()==0)
			{
				throw new CamposVacios("No puso nada en el cuadro de texto");
			}
			
			Deportista dep=Olimpiada.BuscarDeportista(Integer.parseInt(TextBuscador.getText()));
			//anadir info del deportista
			try
			{
				CBDelegacion.setPromptText(dep.getDelegacionPertenece());
				CBDisciplina.setPromptText(dep.getDisciplinaPertenece());
				CBCategoria.setPromptText(dep.getCategoriaPertenece());
				
				
				if(dep.getAsistenciaPrimeraVez())
				{
					RBNoAsistencia.setSelected(false);
					RBSiAsistencia.setSelected(true);
				}
				else
				{
					RBNoAsistencia.setSelected(true);
					RBSiAsistencia.setSelected(false);
				}
				
				
				if(dep.getAbanderado())
				{
					RBNoAbanderado.setSelected(false);
					RBSiAbanderado.setSelected(true);
				}
				else
				{
					RBNoAbanderado.setSelected(true);
					RBSiAbanderado.setSelected(false);
				}
				
				TEstatura.setText(Float.toString(dep.getEstatura()));
				
				TNombre.setText(dep.getNombre());
				
				Bguardar.setDisable(false);
			} 
			catch (NullPointerException e) 
			{
			    System.err.println("Se produjo un NullPointerException: " + e.getMessage());
			     alert.setTitle("ALERTA");
		         alert.setHeaderText("NO EXISTE");
		         alert.setContentText("No existe ese deportista en el sistema");
		         alert.show();
			    // Otra lógica de manejo de la excepción, como registrar el error o tomar alguna acción específica.
			}
			//buscar su disciplina y catego
		}
		catch(CamposVacios resp)
		{
			System.err.println(resp.getResp());
			 alert.setTitle("VACIO");
	         alert.setHeaderText("ALERTA");
	         alert.setContentText("no puso nada en el cuadro de texto");
	         alert.show();
		}
		
			
		
		
    }
	
	
	@FXML
    void BorrarrDeportista(ActionEvent event) 
	{
		
		    Olimpiada.eliminar_deportista(Integer.parseInt(TextBuscador.getText()),CBCategoria.getValue(),CBDelegacion.getValue(),CBDisciplina.getValue());
		
			Exito.setTitle("EXITO");
	    	Exito.setHeaderText("Deportista Borrado");
	    	Exito.setContentText("El deportista con el nombre "+TNombre.getText()+" fue borrado exitosamente del sistema");
	    	Exito.show();
		
	}
}
