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
	
	
}
