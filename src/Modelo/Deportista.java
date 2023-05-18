package Modelo;

public class Deportista {
	private Integer NoInscripcion;
	private String Nombre;
	private Boolean AsistenciaPrimeraVez;
	private Float Estatura;
	private String Medalla;
	private Boolean Abanderado;
	private String DelegacionPertenece;
	private Boolean Eliminado;
	
	public Deportista(Integer noInscripcion, String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			String medalla, Boolean abanderado, String delegacionPertenece, Boolean eliminado) {
		super();
		this.NoInscripcion = noInscripcion;
		this.Nombre = nombre;
		this.AsistenciaPrimeraVez = asistenciaPrimeraVez;
		this.Estatura = estatura;
		this.Medalla = medalla;
		this.Abanderado = abanderado;
		this.DelegacionPertenece = delegacionPertenece;
	}

	public Integer getNoInscripcion() {
		return NoInscripcion;
	}

	public void setNoInscripcion(Integer noInscripcion) {
		NoInscripcion = noInscripcion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Boolean getAsistenciaPrimeraVez() {
		return AsistenciaPrimeraVez;
	}

	public void setAsistenciaPrimeraVez(Boolean asistenciaPrimeraVez) {
		AsistenciaPrimeraVez = asistenciaPrimeraVez;
	}

	public Float getEstatura() {
		return Estatura;
	}

	public void setEstatura(Float estatura) {
		Estatura = estatura;
	}

	public String getMedalla() {
		return Medalla;
	}

	public void setMedalla(String medalla) {
		Medalla = medalla;
	}

	public Boolean getAbanderado() {
		return Abanderado;
	}

	public void setAbanderado(Boolean abanderado) {
		Abanderado = abanderado;
	}

	public String getDelegacionPertenece() {
		return DelegacionPertenece;
	}

	public void setDelegacionPertenece(String delegacionPertenece) {
		DelegacionPertenece = delegacionPertenece;
	}

	

}
