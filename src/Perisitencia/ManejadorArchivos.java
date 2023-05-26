package Perisitencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import Modelo.Delegacion;
import Modelo.Delegaciones;
import Modelo.Deportista;
import Modelo.Deportistas;
import Modelo.Disciplina;
import Modelo.Disciplinas;
import Modelo.Jueces;
import Modelo.Juez;
import Modelo.Olimpiada;
import jakarta.xml.bind.JAXB;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;


public class ManejadorArchivos 
{
		public static void escribirEnArchivoXMLDeportistas(Deportistas lista) throws JAXBException 
		{
	    	
	    	
	    	try (BufferedWriter salida = Files.newBufferedWriter(Paths.get("/Users/sophiaaristizabal/eclipse-workspace/proyectoADS/src/Perisitencia/Deportistas.xml"))) {
	            JAXBContext context = JAXBContext.newInstance(Deportistas.class);
	            Marshaller marshaller = context.createMarshaller();
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	            marshaller.marshal(lista, salida);
	            System.out.println("Escritura en el archivo XML finalizada!");
	        } 
	    	catch (IOException ex) 
	    	{
	            System.err.println("Error al escribir en el archivo XML: " + ex.getMessage());
	            ex.printStackTrace();
	        }
			
		}
		
		public static void escribirEnArchivoXMLDelegaciones(Delegaciones lista) throws JAXBException 
		{
	    	
	    	
	    	try (BufferedWriter salida = Files.newBufferedWriter(Paths.get("/Users/sophiaaristizabal/eclipse-workspace/proyectoADS/src/Perisitencia/Delegaciones.xml"))) {
	            JAXBContext context = JAXBContext.newInstance(Delegaciones.class);
	            Marshaller marshaller = context.createMarshaller();
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	            marshaller.marshal(lista, salida);
	            System.out.println("Escritura en el archivo XML finalizada!");
	        } 
	    	catch (IOException ex) 
	    	{
	            System.err.println("Error al escribir en el archivo XML: " + ex.getMessage());
	            ex.printStackTrace();
	        }
			
		}
		
		public static void escribirEnArchivoXMLJueces(Jueces lista) throws JAXBException 
		{
	    	
	    	
	    	try (BufferedWriter salida = Files.newBufferedWriter(Paths.get("/Users/sophiaaristizabal/eclipse-workspace/proyectoADS/src/Perisitencia/Jueces.xml"))) {
	            JAXBContext context = JAXBContext.newInstance(Jueces.class);
	            Marshaller marshaller = context.createMarshaller();
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	            marshaller.marshal(lista, salida);
	            System.out.println("Escritura en el archivo XML finalizada!");
	        } 
	    	catch (IOException ex) 
	    	{
	            System.err.println("Error al escribir en el archivo XML: " + ex.getMessage());
	            ex.printStackTrace();
	        }
			
		}
		
		public static void escribirEnArchivoXMLDisciplinas(Disciplinas lista) throws JAXBException 
		{	
	    	try (BufferedWriter salida = Files.newBufferedWriter(Paths.get("/Users/sophiaaristizabal/eclipse-workspace/proyectoADS/src/Perisitencia/Disciplinas.xml"))) {
	            JAXBContext context = JAXBContext.newInstance(Disciplinas.class);
	            Marshaller marshaller = context.createMarshaller();
	            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	            marshaller.marshal(lista, salida);
	            System.out.println("Escritura en el archivo XML finalizada!");
	        } 
	    	catch (IOException ex) 
	    	{
	            System.err.println("Error al escribir en el archivo XML: " + ex.getMessage());
	            ex.printStackTrace();
	        }
			
		}
		
		public static void leerEnArchivoXMLDelegaciones() throws JAXBException 
		{
			try (BufferedReader entrada
					= Files.newBufferedReader (Paths.get ("/Users/sophiaaristizabal/eclipse-workspace/proyectoADS/src/Perisitencia/Delegaciones.xml"))) {
					Delegaciones resultado = JAXB.unmarshal(entrada, Delegaciones.class);
					Olimpiada.AnadirDelegaciones(resultado);
					
					//ArrayList<Delegacion> datos = resultado.getDelegacionesList();
					//System.out.print ("Lectura del archivo XML finalizada! \n");
					//System.out.print ("TEST: Nombre Primer Gato: \n" + datos.get(0).getFacultad() );
					} catch (IOException ex) {
					ex.printStackTrace ();
					}
		}
		
		public static void leerEnArchivoXMLDeportitas() throws JAXBException 
		{
			try (BufferedReader entrada
					= Files.newBufferedReader (Paths.get ("/Users/sophiaaristizabal/eclipse-workspace/proyectoADS/src/Perisitencia/Deportistas.xml"))) {
					Deportistas resultado = JAXB.unmarshal(entrada, Deportistas.class);
					Olimpiada.AnadirDeportistas(resultado);
					//System.out.print ("Lectura del archivo XML finalizada! \n");
					//System.out.print ("TEST: Nombre Primer Gato: \n" + datos.get(0).getFacultad() );
					} catch (IOException ex) {
					ex.printStackTrace ();
					}
		}
		
		public static void leerEnArchivoXMLJueces() throws JAXBException 
		{
			try (BufferedReader entrada
					= Files.newBufferedReader (Paths.get ("/Users/sophiaaristizabal/eclipse-workspace/proyectoADS/src/Perisitencia/Jueces.xml"))) {
					Jueces resultado = JAXB.unmarshal(entrada, Jueces.class);
					Olimpiada.AnadirJueces(resultado);
					//ArrayList<Juez> datos = resultado.getJueces();
					//System.out.print ("Lectura del archivo XML finalizada! \n");
					//System.out.print ("TEST: Nombre Primer Gato: \n" + datos.get(0).getFacultad() );
					} catch (IOException ex) {
					ex.printStackTrace ();
					}
		}
		
		public static void leerEnArchivoXMLDisciplinas() throws JAXBException 
		{
			try (BufferedReader entrada
					= Files.newBufferedReader (Paths.get ("/Users/sophiaaristizabal/eclipse-workspace/proyectoADS/src/Perisitencia/Disciplinas.xml"))) {
					Disciplinas resultado = JAXB.unmarshal(entrada, Disciplinas.class);
					Olimpiada.AnadirDisciplinas(resultado);
					
					//ArrayList<Disciplina> datos = resultado.getDisciplinasList();
					//System.out.print ("Lectura del archivo XML finalizada! \n");
					//System.out.print ("TEST: Nombre Primer Gato: \n" + datos.get(0).getFacultad() );
					} catch (IOException ex) {
					ex.printStackTrace ();
					}
		}
}
		
