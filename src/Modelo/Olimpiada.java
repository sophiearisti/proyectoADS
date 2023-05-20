package Modelo;

import java.util.ArrayList;

public class Olimpiada 
{
	private static ArrayList<Delegacion> Delegaciones;
	private static ArrayList<Disciplina> Disciplinas;
	private static ArrayList<Juez> Jueces;
	private static ArrayList<Deportista> Deportistas;
	
	
	public Olimpiada(ArrayList<Delegacion> delegaciones, ArrayList<Disciplina> disciplinas, ArrayList<Juez> jueces) 
	{
		Delegaciones = delegaciones;
		Disciplinas = disciplinas;
		Jueces = jueces;
	}
	
	public static ArrayList<Delegacion> getDelegaciones() {
		return Delegaciones;
	}
	public static void setDelegaciones(ArrayList<Delegacion> delegaciones) {
		Delegaciones = delegaciones;
	}
	public static ArrayList<Disciplina> getDisciplinas() {
		return Disciplinas;
	}
	public static void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}
	public static ArrayList<Juez> getJueces() {
		return Jueces;
	}
	public void setJueces(ArrayList<Juez> jueces) {
		Jueces = jueces;
	}
	
	
	public static Boolean AnadirDelegacion()
	{
		return true;
	}
	
	public static Boolean BuscarDelegacion()
	{
		return true;
	}
	public static ArrayList<Delegacion> ObtenerDelegacion()
	{
		ArrayList<Delegacion> k=new ArrayList<Delegacion>();
		return k;
	}
	
	
	public static Boolean AnadirDeportista()
	{
	
		return true;
	}
	public static Boolean EliminarDeportista()
	{
		return true;
	}
	public static Boolean EditarDeportista()
	{
		return true;
	}
	
	
	public static Deportista BuscarDeportista(Integer NoInscripcion)
	{
		Deportista m=new Deportista();
		return m;
	}
	public static Boolean BuscarDeportistaDeDelegacion()
	{
		return true;
	}
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
	
	
	
	public static Boolean AnadirCategoria()
	{
		return true;
	}
	
	public static Boolean BuscarCategoria()
	{
		return true;
	}
	public static ArrayList<Categoria> ObtenerCategoriasDeDisciplina(String nombreDisciplina)
	{
		ArrayList<Categoria> k=new ArrayList<Categoria>();
		return k;
	}
	
	
	public static Boolean AnadirDisciplina()
	{
		return true;
	}
	public static Boolean BuscarDisciplina()
	{
		return true;
	}
	public static ArrayList<Disciplina> ObtenerDisciplinas()
	{
		ArrayList<Disciplina> k=new ArrayList<Disciplina>();
		return k;
	}
	
	
}
