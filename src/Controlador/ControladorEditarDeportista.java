 package Controlador;

import java.io.IOException;

import Modelo.Categoria;
import Modelo.Deportista;
import Modelo.Disciplina;
import Modelo.Olimpiada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControladorEditarDeportista 
{
	
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
		Deportista dep=Olimpiada.BuscarDeportista(Integer.parseInt(TextBuscador.getText()));
		Categoria cat;
		Disciplina dis;
		
		if(dep!=null)
		{
			CBDelegacion.setDisable(false);
			RBNoAsistencia.setDisable(false);
			RBSiAsistencia.setDisable(false);
			RBNoAbanderado.setDisable(false);
			RBSiAbanderado.setDisable(false);
			TEstatura.setDisable(false);
			TNombre.setDisable(false);
			
			
			//anadir info del deportista
			CBDelegacion.setPromptText(dep.getDelegacionPertenece());
			
			
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
			
		}
		else
		{	
			CBDelegacion.setDisable(true);
			RBNoAsistencia.setDisable(true);
			RBSiAsistencia.setDisable(true);
			RBNoAbanderado.setDisable(true);
			RBSiAbanderado.setDisable(true);
			TEstatura.setDisable(true);
			TNombre.setDisable(true);
		}
		
    }
}
