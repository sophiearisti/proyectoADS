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
	

	public Disciplina(ArrayList<Categoria> categorias, String disciplina) {
		super();
		Categorias = categorias;
		Disciplina = disciplina;
	}

	public void actualizarDeportista(Integer id,String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado,String categoriaPertenece)
	{
		for(Categoria cat: Categorias)
		{
			if(cat.getNombre().equals(categoriaPertenece))
			{
				cat.ActualizarDeportistas(id, nombre, asistenciaPrimeraVez, estatura, abanderado);
			}
		}
	}
	
	public Boolean buscarCategoria(String categoria) 
	{
		for(Categoria cat: Categorias)
		{
			if(cat.getNombre()==categoria)
			{
				return true;
			}
		}
		
		return false;
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
