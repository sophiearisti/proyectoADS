package Modelo;

import java.util.ArrayList;

public class Disciplinas 
{
	private ArrayList<Disciplina> DisciplinasList=new ArrayList<Disciplina>();

	public Disciplinas(ArrayList<Disciplina> disciplinasList) {
		super();
		DisciplinasList = disciplinasList;
	}

	public Disciplinas() {

	}

	public ArrayList<Disciplina> getDisciplinasList() {
		return DisciplinasList;
	}

	public void setDisciplinasList(ArrayList<Disciplina> disciplinasList) {
		DisciplinasList = disciplinasList;
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
