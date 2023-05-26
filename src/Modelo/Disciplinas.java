package Modelo;

import java.util.ArrayList;

/*import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;*/


//@XmlRootElement(name = "Disciplinas")
//@XmlAccessorType(XmlAccessType.FIELD)

public class Disciplinas 
{
	//@XmlElement(name = "DisciplinasList")
	private ArrayList<Disciplina> DisciplinasList=new ArrayList<Disciplina>();

	public Disciplinas(ArrayList<Disciplina> disciplinasList) {
		super();
		DisciplinasList = disciplinasList;
	}

	public Disciplinas() {

	}

	public ArrayList<Disciplina> getDisciplinasList() {
		ArrayList<Categoria> categorias1=new ArrayList<Categoria> ();
		ArrayList<Categoria> categorias2=new ArrayList<Categoria> ();
		ArrayList<Categoria> categorias3=new ArrayList<Categoria> ();
		ArrayList<Categoria> categorias4=new ArrayList<Categoria> ();
		
		ArrayList<Deportista> Dep1=new ArrayList<> ();
		ArrayList<Deportista> Dep2=new ArrayList<> ();
		ArrayList<Deportista> Dep3=new ArrayList<> ();
		ArrayList<Deportista> Dep4=new ArrayList<> ();
		ArrayList<Deportista> Dep5=new ArrayList<> ();
		ArrayList<Deportista> Dep6=new ArrayList<> ();
		ArrayList<Deportista> Dep7=new ArrayList<> ();
		ArrayList<Deportista> Dep8=new ArrayList<> ();
		
		
		
	
		//////////delegacion 1//////////
		Dep1.add(new Deportista(1,"Juan Paez",false,123f,false,"Ingenieria","100metros","atletismo"));
		Dep1.add(new Deportista(2,"Laura Pinto",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep1.add(new Deportista(3,"Mariana Duque",true,123f,true,"Ingenieria","100metros","atletismo"));
		Dep1.add(new Deportista(4,"Fernando Far",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep1.add(new Deportista(5,"Samuel Guitierrez",false,123f,false,"Ingenieria","100metros","atletismo"));
		
		categorias1.add(new Categoria("100metros",true,false,Dep1));
		
		/////////Delegacion 2/////////
		Dep2.add(new Deportista(2,"Laura Pinto",true,123f,false,"Ingenieria","relevos","atletismo"));
		Dep2.add(new Deportista(7,"Pablo Suarez",true,123f,false,"Medicina","relevos","atletismo"));
		Dep2.add(new Deportista(8,"Melany Rizo",true,123f,true,"Medicina","relevos","atletismo"));
		Dep2.add(new Deportista(9,"Fernando Aristizabal",true,123f,false,"Medicina","relevos","atletismo"));
		Dep2.add(new Deportista(10,"Samuel Paez",false,123f,false,"Medicina","relevos","atletismo"));
		
		categorias1.add(new Categoria("relevos",false,false,Dep2));
		
		DisciplinasList.add(new Disciplina(categorias1,"atletismo"));
		
		////////Delegacion 3/////////
		Dep3.add(new Deportista(3,"Mariana Duque",true,123f,true,"Ingenieria","balfemenino","baloncesto"));
		Dep3.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","balfemenino","baloncesto"));
		Dep3.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","balfemenino","baloncesto"));
		Dep3.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","balfemenino","baloncesto"));
		
		categorias2.add(new Categoria("balfemenino",true,false,Dep3));
		
		Dep4.add(new Deportista(5,"Samuel Guitierrez",false,123f,false,"Ingenieria","balmasculino","baloncesto"));
		Dep4.add(new Deportista(10,"Samuel Paez",false,123f,false,"Medicina","balmasculino","baloncesto"));
		Dep4.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","balmasculino","baloncesto"));
		Dep4.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","balmasculino","baloncesto"));
		
		categorias2.add(new Categoria("balmasculino",true,false,Dep4));
		
		DisciplinasList.add(new Disciplina(categorias2,"baloncesto"));
		
		
		Dep5.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","ultimate femenino","ultimate"));
		Dep5.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","ultimate femenino","ultimate"));
		Dep5.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","ultimate femenino","ultimate"));
		Dep5.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","ultimate femenino","ultimate"));
		
		categorias3.add(new Categoria("ultimate femenino",true,false,Dep5));
		

		Dep6.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","ultimate masculino","ultimate"));
		Dep6.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","ultimate masculino","ultimate"));
		Dep6.add(new Deportista(9,"Fernando Aristizabal",true,123f,false,"Medicina","ultimate masculino","ultimate"));
		Dep6.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","ultimate masculino","ultimate"));
		
		categorias3.add(new Categoria("ultimate masculino",true,false,Dep6));
		
		DisciplinasList.add(new Disciplina(categorias3,"ultimate"));
		
		Dep7.add(new Deportista(6,"Santiago Castro",false,123f,false,"Medicina","PPgrupal","ultimate"));
		Dep7.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","PPgrupal","ultimate"));
		Dep7.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","PPgrupal","ultimate"));
		Dep7.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","PPgrupal","ultimate"));
		
		categorias4.add(new Categoria("PPgrupal",true,false,Dep7));
		
		Dep8.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","PPMixto","ping pong"));
		Dep8.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","PPMixto","ping pong"));
		Dep8.add(new Deportista(8,"Melany Rizo",true,123f,true,"Medicina","PPMixto","ping pong"));
		Dep8.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","PPMixto","ping pong"));
		
		categorias4.add(new Categoria("PPMixto",true,false,Dep8));
		
		
		DisciplinasList.add(new Disciplina(categorias4,"ping pong"));
		return DisciplinasList;
	}

	public void setDisciplinasList(ArrayList<Disciplina> disciplinasList) 
	{
		
		
	}
	
	public void AnadirDisciplina(Disciplina Disciplinanueva)
	{
		this.DisciplinasList.add(Disciplinanueva);
	}
	
	public void ActualizarDeportistaCategoria(Integer id,String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado,String categoriaPertenece,String disciplinaPertenece)
	{
		for(Disciplina disp: this.DisciplinasList)
		{
			
			if(disp.getDisciplina().equals(disciplinaPertenece))
			{
				disp.actualizarDeportista(id, nombre, asistenciaPrimeraVez, estatura, abanderado, categoriaPertenece);
			}
		}
	}
	
	public ArrayList<String> getCategoriasNombres(String NombreDisciplina) 
	{
		ArrayList<String> CategoriasDeDisciplina=new ArrayList<String>();
	
		for(Disciplina disp: this.DisciplinasList) 
		{
			
			if(disp.getDisciplina().equals(NombreDisciplina)) 
			{
				CategoriasDeDisciplina=disp.obtenerNombreCategorias();
			}
			
		}
		return CategoriasDeDisciplina;
	}
	
	public void AnadirDeportista(String disciplina, String categoria, String delegacion, boolean primeraVez,
			boolean abanderado, Float estatura, Integer id, String nombre)
	{
		
		for(Disciplina disp: DisciplinasList)
		{
			if(disciplina.equals(disp.getDisciplina()))
			{
				disp.AnadirDeportista(disciplina, categoria, delegacion, primeraVez, abanderado, estatura, id, nombre);

			}
			
		}
	
	}
	
	public Boolean eliminar_deportista(Integer numeroInscripcion,String disciplina,String categoria) {
	    
		for(Disciplina disp: DisciplinasList)
		{
			if(disciplina.equals(disp.getDisciplina()))
			{
				disp.eliminar_deportista(numeroInscripcion,categoria);
				return true;
			}
			
		}
	    	
	    return false; 
	}
}
