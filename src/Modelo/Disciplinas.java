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
		
		ArrayList<Deportista> Dep1=new ArrayList<> ();
		ArrayList<Deportista> Dep2=new ArrayList<> ();
		ArrayList<Deportista> Dep3=new ArrayList<> ();
		
		//////////delegacion 1//////////
		Dep3.add(new Deportista(1,"Juan Paez",false,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(2,"Laura Pinto",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(3,"Mariana Duque",true,123f,true,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(4,"Fernando Far",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(5,"Samuel Guitierrez",false,123f,false,"Ingenieria","100metros","atletismo"));
		
		categorias1.add(new Categoria("100metros",true,false,Dep3));
		
		/////////Delegacion 2/////////
		Dep1.add(new Deportista(6,"Santiago Castro",false,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(7,"Pablo Suarez",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(8,"Melany Rizo",true,123f,true,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(9,"Fernando Aristizabal",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(10,"Samuel Paez",false,123f,false,"Medicina","relevos","atletismo"));
		
		categorias1.add(new Categoria("relevos",false,false,Dep1));
		
		DisciplinasList.add(new Disciplina(categorias1,"atletismo"));
		
		////////Delegacion 3/////////
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","balfemenino","baloncesto"));
		
		categorias2.add(new Categoria("balfemenino",true,false,Dep2));
		
		Dep2.clear();
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","balmasculino","baloncesto"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","balmasculino","baloncesto"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","balmasculino","baloncesto"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","balmasculino","baloncesto"));
		
		categorias2.add(new Categoria("balmasculino",true,false,Dep2));
		
		DisciplinasList.add(new Disciplina(categorias2,"baloncesto"));
		
		Dep2.clear();
		
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","ultimate femenino","ultimate"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","ultimate femenino","ultimate"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","ultimate femenino","ultimate"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","ultimate femenino","ultimate"));
		
		categorias2.add(new Categoria("ultimate femenino",true,false,Dep2));
		
		Dep2.clear();
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","ultimate masculino","ultimate"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","ultimate masculino","ultimate"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","ultimate masculino","ultimate"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","ultimate masculino","ultimate"));
		
		categorias2.add(new Categoria("ultimate masculino",true,false,Dep2));
		
		DisciplinasList.add(new Disciplina(categorias2,"ultimate"));
		
        Dep2.clear();
		
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","PPgrupal","ultimate"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","PPgrupal","ultimate"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","PPgrupal","ultimate"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","PPgrupal","ultimate"));
		
		categorias2.add(new Categoria("PPgrupal",true,false,Dep2));
		
		Dep2.clear();
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","PPMixto","ping pong"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","PPMixto","ping pong"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","PPMixto","ping pong"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","PPMixto","ping pong"));
		
		categorias2.add(new Categoria("PPMixto",true,false,Dep2));
		
		
		DisciplinasList.add(new Disciplina(categorias2,"ping pong"));
		return DisciplinasList;
	}

	public void setDisciplinasList(ArrayList<Disciplina> disciplinasList) 
	{
		
		ArrayList<Categoria> categorias1=new ArrayList<Categoria> ();
		ArrayList<Categoria> categorias2=new ArrayList<Categoria> ();
		
		ArrayList<Deportista> Dep1=new ArrayList<> ();
		ArrayList<Deportista> Dep2=new ArrayList<> ();
		ArrayList<Deportista> Dep3=new ArrayList<> ();
		
		//////////delegacion 1//////////
		Dep3.add(new Deportista(1,"Juan Paez",false,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(2,"Laura Pinto",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(3,"Mariana Duque",true,123f,true,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(4,"Fernando Far",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(5,"Samuel Guitierrez",false,123f,false,"Ingenieria","100metros","atletismo"));
		
		categorias1.add(new Categoria("100metros",true,false,Dep3));
		
		/////////Delegacion 2/////////
		Dep1.add(new Deportista(6,"Santiago Castro",false,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(7,"Pablo Suarez",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(8,"Melany Rizo",true,123f,true,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(9,"Fernando Aristizabal",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(10,"Samuel Paez",false,123f,false,"Medicina","relevos","atletismo"));
		
		categorias1.add(new Categoria("relevos",false,false,Dep1));
		
		DisciplinasList.add(new Disciplina(categorias1,"atletismo"));
		
		////////Delegacion 3/////////
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","balfemenino","baloncesto"));
		
		categorias2.add(new Categoria("balfemenino",true,false,Dep2));
		
		Dep2.clear();
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","balmasculino","baloncesto"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","balmasculino","baloncesto"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","balmasculino","baloncesto"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","balmasculino","baloncesto"));
		
		categorias2.add(new Categoria("balmasculino",true,false,Dep2));
		
		DisciplinasList.add(new Disciplina(categorias2,"baloncesto"));
		
		Dep2.clear();
		
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","ultimate femenino","ultimate"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","ultimate femenino","ultimate"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","ultimate femenino","ultimate"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","ultimate femenino","ultimate"));
		
		categorias2.add(new Categoria("ultimate femenino",true,false,Dep2));
		
		Dep2.clear();
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","ultimate masculino","ultimate"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","ultimate masculino","ultimate"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","ultimate masculino","ultimate"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","ultimate masculino","ultimate"));
		
		categorias2.add(new Categoria("ultimate masculino",true,false,Dep2));
		
		DisciplinasList.add(new Disciplina(categorias2,"ultimate"));
		
        Dep2.clear();
		
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","PPgrupal","ultimate"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","PPgrupal","ultimate"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","PPgrupal","ultimate"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","PPgrupal","ultimate"));
		
		categorias2.add(new Categoria("PPgrupal",true,false,Dep2));
		
		Dep2.clear();
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","PPMixto","ping pong"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","PPMixto","ping pong"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","PPMixto","ping pong"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","PPMixto","ping pong"));
		
		categorias2.add(new Categoria("PPMixto",true,false,Dep2));
		
		
		DisciplinasList.add(new Disciplina(categorias2,"ping pong"));
	
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
}
