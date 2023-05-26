package Modelo;

import java.util.ArrayList;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Categorias")
public class Categorias 
{
	private ArrayList<Categoria> CategoriasList=new ArrayList<Categoria>();

	public ArrayList<Categoria> getCategoriasList() {
		return CategoriasList;
	}

	@XmlElement(name = "Categoria")
	public void setCategoriasList(ArrayList<Categoria> categoriasList) {
		CategoriasList = categoriasList;
	}

	public Categorias(ArrayList<Categoria> categoriasList) {
		super();
		CategoriasList = categoriasList;
	}
	
	public Categorias() {
		
	}
	
	public void addCategoria(Categoria cat)
	{
		CategoriasList.add(cat);
	}
}
