package Modelo;

import java.util.ArrayList;

public class Jueces 
{
	private ArrayList<Juez> JuecesList= new ArrayList<Juez>();

	public Jueces(ArrayList<Juez> jueces) {
		super();
		JuecesList = jueces;
	}

	public Jueces() {
		
	}

	public ArrayList<Juez> getJueces() {
		return JuecesList;
	}

	public void setJueces(ArrayList<Juez> jueces) {
		JuecesList= jueces;
	}
	
	public void AnadirJuez(Juez juezNuevo)
	{
		this.JuecesList.add(juezNuevo);
	}
}
