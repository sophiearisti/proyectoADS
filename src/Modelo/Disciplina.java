package Modelo;

import java.util.ArrayList;

public class Disciplina 
{
	private ArrayList<Categoria> Categorias;
	
	private String Disciplina;
	
	public Disciplina() 
	{
		
	}

	public Disciplina(String disciplina) 
	{
		Disciplina = disciplina;
	}

	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	
	public Boolean AgregarCategoria(Categoria nuevaCategoria)
	{
		Boolean insertado=true;
		
		//toca mirar si ya existe el deportista
		for(int i=0; i<Categorias.size(); i++)
		{
			if(true)
			{
				insertado=false;
			}
		}
		
		if(insertado)
		{
			Categorias.add(nuevaCategoria);
		}
		
		return insertado;
	}
	
}
