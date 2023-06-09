package Modelo;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Jueces")

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

	@XmlElement(name = "Juez")
	public void setJueces(ArrayList<Juez> jueces) {
		JuecesList= jueces;
	}
	
	public void AnadirJuez(Juez juezNuevo)
	{
		this.JuecesList.add(juezNuevo);
	}
}
