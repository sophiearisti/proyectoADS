package Controlador;

import Modelo.Deportista;
import jakarta.xml.bind.JAXBException;

//

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrincipalOlimpiada extends Application {
	
	@Override
	public void start(Stage stage) 
	{
		try {
			   Parent root = FXMLLoader.load(getClass().getResource("/Vista/MenuOlimpiadas.fxml"));
			   Scene scene = new Scene(root);
			   stage.setScene(scene);
			   stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws JAXBException 
	{
		launch(args);
		Deportista d= new Deportista(4, "ss", true, 123f,
			"maa", false, "cnn");
		d.marsharlToXML();
	}
}	