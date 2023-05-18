package Modelo;

import java.util.ArrayList;

public class Olimpiada 
{
	private ArrayList<Delegacion> Delegaciones;
	private ArrayList<Disciplina> Disciplinas;
	private ArrayList<Juez> Jueces;
	
	
	
	public Olimpiada(ArrayList<Delegacion> delegaciones, ArrayList<Disciplina> disciplinas, ArrayList<Juez> jueces) 
	{
		Delegaciones = delegaciones;
		Disciplinas = disciplinas;
		Jueces = jueces;
	}
	
	public ArrayList<Delegacion> getDelegaciones() {
		return Delegaciones;
	}
	public void setDelegaciones(ArrayList<Delegacion> delegaciones) {
		Delegaciones = delegaciones;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return Disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}
	public ArrayList<Juez> getJueces() {
		return Jueces;
	}
	public void setJueces(ArrayList<Juez> jueces) {
		Jueces = jueces;
	}
	
	
	public Boolean AnadirDelegacion()
	{
		return true;
	}
	
	public Boolean BuscarDelegacion()
	{
		return true;
	}
	public ArrayList<Delegacion> ObtenerDelegacion()
	{
		ArrayList<Delegacion> k=new ArrayList<Delegacion>();
		return k;
	}
	
	
	public Boolean AnadirDeportista()
	{
	
		return true;
	}
	public Boolean EliminarDeportista()
	{
		return true;
	}
	public Boolean EditarDeportista()
	{
		return true;
	}
	
	
	public static Deportista BuscarDeportista(Integer NoInscripcion)
	{
		Deportista m=new Deportista();
		return m;
	}
	public Boolean BuscarDeportistaDeDelegacion()
	{
		return true;
	}
	public Boolean BuscarDeportistaDeCategoria()
	{
		return true;
	}
	public ArrayList<Deportista> ObtenerDeportistasDeDelegacion()
	{
		ArrayList<Deportista> k=new ArrayList<Deportista>();
		return k;
	}
	public ArrayList<Deportista> ObtenerDeportistasDeCategoria()
	{
		ArrayList<Deportista> k=new ArrayList<Deportista>();
		return k;
	}
	
	
	
	public Boolean AnadirCategoria()
	{
		return true;
	}
	
	public Boolean BuscarCategoria()
	{
		return true;
	}
	public ArrayList<Categoria> ObtenerCategoriasDeDisciplina(String nombreDisciplina)
	{
		ArrayList<Categoria> k=new ArrayList<Categoria>();
		return k;
	}
	
	
	public Boolean AnadirDisciplina()
	{
		return true;
	}
	public Boolean BuscarDisciplina()
	{
		return true;
	}
	public static ArrayList<Disciplina> ObtenerDisciplinas()
	{
		ArrayList<Disciplina> k=new ArrayList<Disciplina>();
		return k;
	}
	
	
}
