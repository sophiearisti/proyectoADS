package Controlador;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import Modelo.Delegacion;
import Modelo.Deportista;
import Modelo.Disciplina;
import Modelo.Olimpiada;

public class ControladorDesfilePorDelegacion implements Initializable
{
	private Map<String, ArrayList<Deportista>> delegacionesMap = new TreeMap<>();
	
	ArrayList<String> NombresOrdenados;
	
    private Integer Iterador=0;
     
    private Integer Maximo;
	 
    @FXML
    private Button BAnterior;

    @FXML
    private Button BAtras;

    @FXML
    private Button BSiguiente;
    
    @FXML
    private Text NombreDelegacion;
    
    @FXML
    private TableColumn<FilaTablaDesfile, Integer> IdCol;

    @FXML
    private TableColumn<FilaTablaDesfile, String> NombreCol;
    
     @FXML
    private TableColumn<FilaTablaDesfile, String> tipoParticipanteCol;

    @FXML
    private TableView<FilaTablaDesfile> TablaDeportistas;
    private ObservableList<FilaTablaDesfile> listaDeportistas=FXCollections.observableArrayList();

   
    
    @FXML
    void DelegacionAnterior(ActionEvent event) 
    {
    	this.Iterador--;
    	
    	if(Iterador<0)
    	{
    		this.Iterador++;
    	}
    	else
    	{
	    	
    	    String nombre=NombresOrdenados.get(this.Iterador);
    		NombreDelegacion.setText(nombre);
    		
        	ArrayList<Deportista> DeportistasOrdenados=ordenarDeportistas(this.delegacionesMap.get(nombre));
        	System.out.println(nombre);
        	
        	LlenarTabla(DeportistasOrdenados);
    	}
    }

    
    @FXML
    void DelegacionSiguiente(ActionEvent event) 
    {
    	this.Iterador++;
    	if(this.Iterador>Maximo)
    	{
    	  this.Iterador--;
    	}
    	else
    	{
    	
    	    String nombre=NombresOrdenados.get(this.Iterador);
    		NombreDelegacion.setText(nombre);
    		
        	ArrayList<Deportista> DeportistasOrdenados=ordenarDeportistas(this.delegacionesMap.get(nombre));
        	System.out.println(nombre);
        	
        	LlenarTabla(DeportistasOrdenados);
    	}
    }
    
   
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
    	
    	ArrayList<Delegacion> delegaciones=Olimpiada.getDelegaciones();
    	
    	Maximo=delegaciones.size()-1;
    	
    	for (Delegacion del : delegaciones) 
    	{

            delegacionesMap.put(del.getFacultad(),del.getDeportistas());
          
            for(Deportista dep:del.getDeportistas())
        	{
        		System.out.println(dep.getNombre());
        		System.out.println(dep.getDelegacionPertenece());
        	}
        }
    	
    	NombresOrdenados = new ArrayList<String>(delegacionesMap.keySet());
    	
    
    	NombreDelegacion.setText(NombresOrdenados.get(Iterador));
    	
    	ArrayList<Deportista> DeportistasOrdenados=ordenarDeportistas(delegacionesMap.get(NombresOrdenados.get(Iterador)));
    	
    	IdCol.setCellValueFactory(new PropertyValueFactory<FilaTablaDesfile, Integer>("IDEstudiante"));	
		
    	NombreCol.setCellValueFactory(new PropertyValueFactory<FilaTablaDesfile, String>("Nombre"));	
		
    	tipoParticipanteCol.setCellValueFactory(new PropertyValueFactory<FilaTablaDesfile, String>("TipoEstudiante"));	
    	
    	LlenarTabla(DeportistasOrdenados);
    		
	}
    
    private ArrayList<Deportista> ordenarDeportistas(ArrayList<Deportista> DeportistasDeLaDelegacion)
    {
    	ArrayList<Deportista> Ordenados=new ArrayList<>();
    	
    	for (Deportista deportista : DeportistasDeLaDelegacion) 
    	{
            if(deportista.getAbanderado()==true)
            {
            	Ordenados.add(deportista);
            }
        }
    	
    	for (Deportista deportista : DeportistasDeLaDelegacion) 
    	{
            if(deportista.getAbanderado()==false && deportista.getAsistenciaPrimeraVez()==true)
            {
            	Ordenados.add(deportista);
            }
        }
    	
    	for (Deportista deportista : DeportistasDeLaDelegacion) 
    	{
            if(deportista.getAbanderado()==false && deportista.getAsistenciaPrimeraVez()==false)
            {
            	Ordenados.add(deportista);
            }
        }
    	
    	
    	return Ordenados;
    }
    
    private void LlenarTabla(ArrayList<Deportista> DeportistasDeLaDelegacion)
    {
    	listaDeportistas.clear();
    	
    	TablaDeportistas.setItems(listaDeportistas);	
	
    	for (Deportista deportista : DeportistasDeLaDelegacion) 
    	{
    		String Tipo;
           
    		if(deportista.getAbanderado()==true)
            {
    			Tipo="Abanderado";
            }
    		else if(deportista.getAsistenciaPrimeraVez()==true)
    		{
    			Tipo="Participante Inicial";
    		}
    		else
    		{
    			Tipo="Participante Usual";
    		}
    		
    		listaDeportistas.add(new FilaTablaDesfile(deportista.getNoInscripcion(),Tipo,deportista.getNombre()));
    		
        }
    	

    	TablaDeportistas.setItems(listaDeportistas);	
    }
    
    @FXML
    void IrAMenuComitiva(ActionEvent event) throws IOException 
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

