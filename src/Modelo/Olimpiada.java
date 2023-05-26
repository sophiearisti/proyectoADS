package Modelo;

import java.util.ArrayList;

public class Olimpiada 
{
	private static Delegaciones ListaDelegaciones=new Delegaciones();
	private static Deportistas ListaDeportistas=new Deportistas();
	private static Disciplinas disciplinasList=new Disciplinas();
	private static Jueces ListaJueces=new Jueces();

///////////////////////////////////////////////////METODOS CANONICOS//////////////////////////////////////////
	
	public static ArrayList<Delegacion> getDelegaciones() 
	{	
		return ListaDelegaciones.getDelegacionesList();
	}
	
	public static void setDelegaciones(ArrayList<Delegacion> delegaciones) 
	{
		ListaDelegaciones.setDelegacionesList(delegaciones);
	}
	
	public static ArrayList<Disciplina> getDisciplinas() 
	{
		return disciplinasList.getDisciplinasList(); 
		
	}
	
	public static void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		disciplinasList.setDisciplinasList(disciplinas);
	}
	
	public static ArrayList<Juez> getJueces() {
		return ListaJueces.getJueces();
	}
	
	public void setJueces(ArrayList<Juez> jueces) {
		ListaJueces.setJueces(jueces);
	}
	
	public static ArrayList<Deportista> getDeportistas() 
	{ 
		return ListaDeportistas.getDeportistasList();
	}

	public static void setDeportistas(ArrayList<Deportista> deportistas) {
		ListaDeportistas.setDeportistasList(deportistas);
	}
	
/////////////////////////////////CASO DE USO DE LISTA DE DEPORTISTAS POR COMPETENCIA//////////////////////////////////
	
	public static ArrayList<String> getTODASLasCatgorias() 
	{
		
		ArrayList<String> NombreCategoria = new ArrayList<String>();
		
		
		for(Disciplina indice : disciplinasList.getDisciplinasList()) 
		{
		
			NombreCategoria.addAll(indice.obtenerNombreCategorias());
		}
		
		
		return NombreCategoria; 		
	
	}

	public static ArrayList<Deportista> LlenarTabla(String NombreCategoria){
		
		ArrayList<Deportista> ListDisciplina = new ArrayList<Deportista>();
		
		for(Disciplina indice : disciplinasList.getDisciplinasList()) 
		{
			if(indice.buscarCategoria(NombreCategoria)) 
			{	
			   ListDisciplina=(indice.ObtenerDeportistaCategoria(NombreCategoria));
			}

		}
		return ListDisciplina;
		
	}	
	
//////////////////////////////////////////CASO DE USO EDITAR DEPORTISTA///////////////////////////////////////////
	
	public static void EditarDeportista(Integer id, String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado,String delegacionPertenece, String categoriaPertenece,String disciplinaPertenece)
	{
		
		ListaDelegaciones.ActualizarDeportistaDelegacion(id,nombre, asistenciaPrimeraVez, estatura,
				abanderado,delegacionPertenece);
		
		disciplinasList.ActualizarDeportistaCategoria(id,nombre, asistenciaPrimeraVez, estatura,
				abanderado,categoriaPertenece,disciplinaPertenece);
		
		
		ListaDeportistas.EditarDeportista(id, nombre, asistenciaPrimeraVez, estatura, abanderado, delegacionPertenece, categoriaPertenece, disciplinaPertenece);	
	}
	
	public static Deportista BuscarDeportista(Integer NoInscripcion)
	{
		Deportista encontrado=ListaDeportistas.BuscarDeportista(NoInscripcion);
		
		return encontrado;
	}
	
	
//////////////////////////////////CASO DE USO INSCRIPBIR DEPORTISTA////////////////////////////////////////	
	
	public static Boolean AnadirDeportista(String disciplina, String categoria, String delegacion, boolean primeraVez,
			boolean abanderado, Float estatura, Integer id, String nombre) 
	{
		if(ListaDeportistas.AnadirDeportista(disciplina, categoria, delegacion, primeraVez, abanderado, estatura, id, nombre))
		{
			ListaDelegaciones.AnadirDeportista(disciplina, categoria, delegacion, primeraVez, abanderado, estatura, id, nombre);
			disciplinasList.AnadirDeportista(disciplina, categoria, delegacion, primeraVez, abanderado, estatura, id, nombre);
			return true;
		}
		
		return false;
	}
	
	public static ArrayList<String> getCategoriasSegunDisciplina(String NombreDisciplina) 
	{
		
		return disciplinasList.getCategoriasNombres(NombreDisciplina);
	
	}
	
///////////////////////////////////////CASO DE USO ELIMINAR DEPORTISTA////////////////////////////////////////	
	
	public static Boolean eliminar_deportista(Integer indice, String categoria, String delegacion, String disciplina) {
		
		if(ListaDeportistas.eliminar_deportista(indice))
		{
			disciplinasList.eliminar_deportista(indice, disciplina, categoria);
		    ListaDelegaciones.eliminar_deportista(indice, delegacion);
			return true;
		}
		
		return false;

	}

///////////////////////////////////////PARA PERSISTENCIA///////////////////////////////////////////////////////

	public static Boolean AnadirDisciplina()
	{
		if(BuscarDisciplina())
		{
			
		}
		return true;
	}
	public static Boolean BuscarDisciplina()
	{
		return true;
	}
	
	
	public static Boolean AnadirCategoria()
	{
		if( BuscarCategoria())
		{
			
		}
		return true;
	}
	public static Boolean BuscarCategoria()
	{
		return true;
	}
	
	
	public static Boolean AnadirDelegacion()
	{
		if(BuscarDelegacion())
		{
			
		}
		
		return true;
	}
	public static Boolean BuscarDelegacion()
	{
		return true;
	}
	
}
