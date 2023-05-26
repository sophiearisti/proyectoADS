package Modelo;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

public class Disciplina 
{

	private Categorias CategoriasList= new Categorias();;
	
	private String Disciplina;
	
	public Disciplina() 
	{
		
	}

	public Disciplina(String disciplina) 
	{
		Disciplina = disciplina;
	}
	

	public Disciplina(Categorias categorias, String disciplina) {
		super();
		CategoriasList = categorias;
		Disciplina = disciplina;
	}

	public void actualizarDeportista(Integer id,String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado,String categoriaPertenece)
	{
		for(Categoria cat: CategoriasList.getCategoriasList())
		{
			if(cat.getNombre().equals(categoriaPertenece))
			{
				cat.ActualizarDeportistas(id, nombre, asistenciaPrimeraVez, estatura, abanderado);
			}
		}
	}
	
	public Boolean buscarCategoria(String categoria) 
	{
		for(Categoria cat: CategoriasList.getCategoriasList())
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
		for(int i=0; i<CategoriasList.getCategoriasList().size(); i++)
		{
			if(true)
			{
				insertado=false;
			}
		}
		
		if(insertado)
		{
			CategoriasList.addCategoria(nuevaCategoria);
		}
		
		return insertado;
	}
	
	public ArrayList<Deportista> ObtenerDeportistaCategoria(String NombreCategoria) {
		ArrayList<Deportista> ListDeportista = new ArrayList<>();
		
		for(Categoria indice : CategoriasList.getCategoriasList()) {
			
			if(indice.getNombre().equals(NombreCategoria)) {
				ListDeportista= indice.ObtenerDeportistas();
			}
		}
	
		return ListDeportista;
	}

	public ArrayList<Categoria> getCategorias() {
		return CategoriasList.getCategoriasList();
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		CategoriasList.setCategoriasList(categorias);
	}
	
	
	
	public Categorias getCategoriasList() {
		return CategoriasList;
	}

	public void setCategoriasList(Categorias categoriasList) {
		CategoriasList = categoriasList;
	}

	public ArrayList<String> obtenerNombreCategorias()
	{
		ArrayList<String> NombreCategoria = new ArrayList<String>();
		
		for(Categoria indice2: CategoriasList.getCategoriasList())
		{
			
			NombreCategoria.add(indice2.getNombre());
		}
		
		return NombreCategoria;
	}
	
	public void AnadirDeportista(String disciplina, String categoria, String delegacion, boolean primeraVez,
			boolean abanderado, Float estatura, Integer id, String nombre)
	{
		
		for(Categoria cat: CategoriasList.getCategoriasList())
		{
			if(categoria.equals(cat.getNombre()))
			{
				cat.AnadirDeportista(disciplina, categoria, delegacion, primeraVez, abanderado, estatura, id, nombre);

			}
			
		}
	
	}
	
	public Boolean eliminar_deportista(Integer numeroInscripcion,String categoria) {
	    
		for(Categoria cat: CategoriasList.getCategoriasList())
		{
			if(categoria.equals(cat.getNombre()))
			{
				return cat.eliminar_deportista(numeroInscripcion);

			}
			
		}
	    	
	    return false; 
	}
}
