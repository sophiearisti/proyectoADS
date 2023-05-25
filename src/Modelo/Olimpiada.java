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
	
	public static ArrayList<String> getDisciplinasCategorias() 
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
	
	public static void AnadirDeportista(String disciplina, String categoria, String delegacion, boolean primeraVez,
			boolean abanderado, Float estatura, Integer id, String nombre) 
	{
		anadir_deportista_delegacion(disciplina, categoria, delegacion, primeraVez, abanderado, estatura, id, nombre);
		Deportista elDeportista = new Deportista(id, nombre, primeraVez, estatura, abanderado, delegacion, categoria, disciplina);
		ListaDeportistas.getDeportistasList().add(elDeportista);
		
	}
	
<<<<<<< HEAD
///////////////////////////////////////CASO DE USO ELIMINAR DEPORTISTA////////////////////////////////////////	
=======
	public static void anadir_deportista_delegacion(String disciplina, String categoria, String delegacion, boolean primeraVez,
			boolean abanderado, Float estatura, Integer id, String nombre) {
		Deportista elDeportista = new Deportista(id, nombre, primeraVez, estatura, abanderado, delegacion, categoria, disciplina);
		
		for(Delegacion delegacion1: ListaDelegaciones.getDelegacionesList()) {
			if(delegacion1.getFacultad().equals(delegacion)) {
				delegacion1.AgregarDeportista(elDeportista);
			}
		}
	}
	
	
>>>>>>> 1b6645df5a5bef6099d5ab45b3654f2261cc1d0d
	public static Boolean EliminarDeportista()
	{
		return true;
	}	


///////////////////////////////////////PARA PERSISTENCIA///////////////////////////////////////////////////////
	public static Boolean BuscarDeportistaDeCategoria()
	{
		return true;
	}
	
	public static ArrayList<Deportista> ObtenerDeportistasDeDelegacion()
	{
		ArrayList<Deportista> k=new ArrayList<Deportista>();
		return k;
	}
	
	public static ArrayList<Deportista> ObtenerDeportistasDeCategoria()
	{
		ArrayList<Deportista> k=new ArrayList<Deportista>();
		return k;
	}
	
<<<<<<< HEAD
=======
	
	public static Integer obtener_indice_deportista(Integer codigo) {
		Integer indice = ListaDeportistas.buscar_indice_deportista(codigo);
		return indice;
		
	}
	
	public static void eliminar_deportista(Integer indice) {
		ListaDeportistas.getDeportistasList().remove(indice);
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
	
>>>>>>> 1b6645df5a5bef6099d5ab45b3654f2261cc1d0d
	public static ArrayList<Categoria> ObtenerCategoriasDeDisciplina(String nombreDisciplina)
	{
		ArrayList<Categoria> k=new ArrayList<Categoria>();
	
		for(Disciplina disciplina: disciplinasList.getDisciplinasList()) {
			if(disciplina.getDisciplina().equals(nombreDisciplina)) {
				k = disciplina.getCategorias();
			}
		}
		return k;
	}
	public static ArrayList<Disciplina> ObtenerDisciplinas()
	{
		ArrayList<Disciplina> k=new ArrayList<Disciplina>();
		return k;
	}
	
	
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
