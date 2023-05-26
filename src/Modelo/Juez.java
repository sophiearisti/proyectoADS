package Modelo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;


public class Juez {
	
	private String Nombre;
	
	private Integer Codigo;
	
	private String ColegioArbitral;
	
	public Juez(String nombre, Integer codigo, String colegioArbitral) {
		super();
		this.Nombre = nombre;
		this.Codigo = codigo;
		this.ColegioArbitral = colegioArbitral;
	}
	
	public Juez() {
	
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Integer getCodigo() {
		return Codigo;
	}

	public void setCodigo(Integer codigo) {
		Codigo = codigo;
	}

	public String getColegioArbitral() {
		return ColegioArbitral;
	}

	public void setColegioArbitral(String colegioArbitral) {
		ColegioArbitral = colegioArbitral;
	}
	
	
}
