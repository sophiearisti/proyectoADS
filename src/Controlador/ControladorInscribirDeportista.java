package Controlador;

import Modelo.Categoria;
import Modelo.Delegacion;
import Modelo.Deportista;
import Modelo.Disciplina;
import Modelo.Olimpiada;
import Modelo.Excepciones.CamposVacios;
import Modelo.Excepciones.SinInformacion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ControladorInscribirDeportista implements Initializable {
    @FXML
    private Label labelCategoria;
    @FXML
    private ComboBox<String> choiceBoxCategoria;
    ObservableList<String> categoriasList= FXCollections.observableArrayList();
    

    @FXML
    private ChoiceBox<String> choiceBoxDelegacion;
    @FXML
    private ChoiceBox<String> choiceBoxDisciplina;
    
    private ArrayList<String>  categorias = new ArrayList<String>();
    
    private ArrayList<String>  delegaciones = new ArrayList<String>();
    
    private ArrayList<String>  disciplinas = new ArrayList<String>();
  

    @FXML
    private RadioButton asistenciaPrimeraVezSi, asistenciaPrimeraVezNo;
    @FXML
    private RadioButton abanderadoSi, abanderadoNo;

    @FXML
    private TextField nombreText;
    @FXML
    private TextField estaturaText;
    @FXML
    private TextField idText;
    @FXML
    private Button botonInscribir;

    private Alert alert = new Alert(Alert.AlertType.ERROR);
    private Alert Exito = new Alert(Alert.AlertType.INFORMATION);

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	try
    	{
    		if(Olimpiada.getDisciplinas().size()==0 || Olimpiada.getDelegaciones().size()==0 )
    		{
    		  throw new SinInformacion("Falta informacion en el sistema");
    		}
    	}
    	catch(SinInformacion resp)
    	{
    		System.err.println(resp.getResp());
			 alert.setTitle("VACIO");
	         alert.setHeaderText("ALERTA");
	         alert.setContentText("Falta informacion en el sistema");
	         alert.show();
    	}
    	
    	for(Disciplina disp: Olimpiada.getDisciplinas())
    	{
    		disciplinas.add(disp.getDisciplina());
    	}
    	
    	choiceBoxDisciplina.getItems().addAll(disciplinas);
    	
    	for(Delegacion del: Olimpiada.getDelegaciones())
    	{
    		delegaciones.add(del.getFacultad());
    	}
    	
        choiceBoxDelegacion.getItems().addAll(delegaciones);
        

    }
    
    @FXML
    void EvaluarDisciplina(MouseEvent event) throws SinInformacion, CamposVacios 
	{	 
   	     categoriasList.clear();
    	 choiceBoxCategoria.setItems(categoriasList);
    	 
    	 String Disciplina=choiceBoxDisciplina.getValue();
    	 
    	 if(Disciplina!=null)
    	 {
    		 categorias= Olimpiada.getCategoriasSegunDisciplina(Disciplina);
    		 
    		 if(categorias.size()==0)
        	 {
    			
   	         	throw new SinInformacion("La disciplina no tiene categorias");
        	 }
    	 } 
    	 else
    	 {
    		 alert.setTitle("VACIO");
 			alert.setHeaderText("ALERTA");
	         	alert.setContentText("Primero debe seleccionar una disciplina");
	         	alert.show();
    		 throw new CamposVacios("No puso nada en Disciplina");
    	 }
    	 
    	 for(String d: categorias)
    	 {
    		 categoriasList.add(d);
    	 }
    	 
    	 choiceBoxCategoria.setItems(categoriasList);
    	 
	}
  

    public void ingresarDatosDeportista (ActionEvent event) 
    {
    	try
    	{
    		
    		if(nombreText.getText().length()==0 || estaturaText.getText().length()==0 || idText.getText().length()==0)
			{
    			throw new CamposVacios("Existen campos vacios");
			}
    		
    		if(choiceBoxDisciplina.getValue()==null || choiceBoxCategoria.getValue()==null  || choiceBoxDelegacion.getValue()==null)
			{
    			throw new CamposVacios("Existen campos vacios");
			}
    		
    		String disciplina = choiceBoxDisciplina.getValue();
            String categoria = choiceBoxCategoria.getValue();
            String delegacion = choiceBoxDelegacion.getValue();
            System.out.println(disciplina+categoria+delegacion);
            

            boolean primeraVez = comparaRadioButtons(asistenciaPrimeraVezSi.isSelected(), asistenciaPrimeraVezNo.isSelected());
            boolean abanderado = comparaRadioButtons(abanderadoSi.isSelected(), abanderadoNo.isSelected());

    		
   	         System.out.println(primeraVez);
             System.out.println("Abanderado"+abanderado);

             String nombre = nombreText.getText();
	         Float estatura = Float.parseFloat(estaturaText.getText());
	         Integer id = Integer.parseInt(idText.getText());
	         System.out.println(nombre + " " + estatura + " " + id);
	        	
        	if(!Olimpiada.AnadirDeportista(disciplina, categoria,delegacion, primeraVez, abanderado, estatura, id, nombre))
            {
                System.err.println("El deportista ingresado ya existe");
                alert.setTitle("ERROR EXISTENTE");
                alert.setHeaderText("El deportista ya existe");
                alert.setContentText("El deportista con el codigo "+id+" y nombre "+nombre+" ya existe");
                alert.show();
            }
            else
            {
            	System.err.println("deportista ingresado");
            	Exito.setTitle("EXITO");
            	Exito.setHeaderText("Deportista Ingresado");
            	Exito.setContentText("El deportista con el codigo "+id+" y nombre "+nombre+" fue ingresado exitosamente al sistema");
            	Exito.show();
            }
    		
    		
    	}
    	catch(CamposVacios resp)
		{
			 System.err.println(resp.getResp());
			 alert.setTitle("VACIO");
	         alert.setHeaderText("ALERTA");
	         alert.setContentText("Existen campos vacios");
	         alert.show();
		}
    	catch (NumberFormatException nfe) 
        {
            System.err.println("NumberFormatException: " + nfe.getMessage());
            alert.setTitle("Number Format Exception");
            alert.setHeaderText("ALERTA");
            alert.setContentText("No puso bien la estatura o el ID mire bien que sea un numero");
            alert.show();
        }
        
        
        /*catch(Exception e)
        {
        	alert.setTitle("ERROR");
            alert.setHeaderText("ALERTA");
            alert.setContentText("ERROR DEL SISTEMA");
            alert.show();
        }*/

        

    }
    public boolean comparaRadioButtons (Boolean si, Boolean no) throws CamposVacios{
        boolean respuesta = Boolean.parseBoolean(null);
       
        if(si) {
            respuesta = true;
        } else if (no) {
            respuesta = false;
        }
        else {
        	
          alert.setTitle("VACIO");
	      alert.setHeaderText("ALERTA");
	      alert.setContentText("Existen campos vacios");
	      alert.show();
          throw new CamposVacios("Existen campos vacios");
            
        }
        return respuesta;

    }


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


}



