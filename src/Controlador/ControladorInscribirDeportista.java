package Controlador;

import Modelo.Categoria;
import Modelo.Deportista;
import Modelo.Disciplina;
import Modelo.Olimpiada;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ControladorInscribirDeportista implements Initializable {
    @FXML
    private Label labelCategoria;
    @FXML
    private ChoiceBox<String> choiceBoxCategoria;
    @FXML
    private ChoiceBox<String> choiceBoxDelegacion;
    @FXML
    private ChoiceBox<String> choiceBoxDisciplina;
    private ArrayList<String>  categorias = new ArrayList<String>();
    private String [] delgaciones = {"Medicina", "Ingenieria", "Humanas"};
    private String [] disciplinas = {"Karate", "Atletismo", "Futbol"};

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



    public ControladorInscribirDeportista() {
        asistenciaPrimeraVezSi = new RadioButton();
        asistenciaPrimeraVezNo = new RadioButton();
        abanderadoSi = new RadioButton();
        abanderadoNo = new RadioButton();
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        choiceBoxDelegacion.getItems().addAll(delgaciones);
        choiceBoxDelegacion.setOnAction(this::ingresarDatosDeportista);
        choiceBoxDisciplina.getItems().addAll(disciplinas);
        // ArrayList <String> categorias = Olimpiada.buscarCategorias(delegaciones);
         String[] array = {"200mt", "400mt", "800mt", "10000mt"};
        for(int i = 0; i < array.length; i++) {
            categorias.add(array[i]);
        }
        choiceBoxCategoria.getItems().addAll(categorias);

    }

    public void ingresarDatosDeportista (ActionEvent event) {

        //Boolean OlimpiadaSimulada = false;


        String disciplina = choiceBoxDisciplina.getValue();
        String categoria = choiceBoxCategoria.getValue();
        String delegacion = choiceBoxDelegacion.getValue();
        System.out.println(disciplina+categoria+delegacion);

        boolean primeraVez = comparaRadioButtons(asistenciaPrimeraVezSi.isSelected(), asistenciaPrimeraVezNo.isSelected());
        boolean abanderado = comparaRadioButtons(abanderadoSi.isSelected(), abanderadoNo.isSelected());

        System.out.println(primeraVez);
        System.out.println("Abanderado"+abanderado);
        Float estatura = 0.0f;
        Integer id = 0;

        String nombre = nombreText.getText();
        System.out.println(nombreText.getText());
        System.out.println("Esto es antes de pepe");
        System.out.println(nombre);

        try {
            estatura = Float.parseFloat(estaturaText.getText());
            id = Integer.parseInt(idText.getText());
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Number Format Exception");
            alert.setHeaderText("Header alert");
            alert.setContentText("No puso bien la estatura o el ID mire bien que sea un numero");
            //alert.show();
        }

        System.out.println(nombre + " " + estatura + " " + id);
        
        if(Olimpiada.BuscarDeportista(id)!=null)
        {
            Olimpiada.AnadirDeportista(disciplina, categoria,delegacion, primeraVez, abanderado, estatura, id, nombre);

        }
        else {
            System.out.println("El deportista ingresado ya existe");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Number Format Exception");
            alert.setHeaderText("El deportista ya existe");
            alert.setContentText("El deportista con el codigo "+id+" ya existe");
            //alert.show();
        }


    }
    public boolean comparaRadioButtons (Boolean si, Boolean no) {
        boolean respuesta = Boolean.parseBoolean(null);
        if(si) {
            respuesta = true;
        } else if (no) {
            respuesta = false;
        }
        else {
            System.out.println("No se ingreso nada");
            
        }
        return respuesta;

    }





}



