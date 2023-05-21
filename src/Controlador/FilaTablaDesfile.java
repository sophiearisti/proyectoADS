package Controlador;

public class FilaTablaDesfile 
{
	private Integer IDEstudiante;
	private String TipoEstudiante;
	private String Nombre;
	
	public FilaTablaDesfile(Integer iDEstudiante, String tipoEstudiante, String nombre) 
	{
		IDEstudiante = iDEstudiante;
		TipoEstudiante = tipoEstudiante;
		Nombre = nombre;
	}

	public Integer getIDEstudiante() {
		return IDEstudiante;
	}

	public void setIDEstudiante(Integer iDEstudiante) {
		IDEstudiante = iDEstudiante;
	}

	public String getTipoEstudiante() {
		return TipoEstudiante;
	}

	public void setTipoEstudiante(String tipoEstudiante) {
		TipoEstudiante = tipoEstudiante;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
}
