package Modelo;

public class Resultado {
	
	private Categoria Categoria;
	private Juez Juez;
	private Integer CodigoOro;
	private Integer CodigoPlata;
	private Integer CodigoBronce;
	
	public Resultado(Modelo.Categoria categoria, Modelo.Juez juez, Integer codigoOro, Integer codigoPlata,
			Integer codigoBronce) {
		super();
		this.Categoria = categoria;
		this.Juez = juez;
		this.CodigoOro = codigoOro;
		this.CodigoPlata = codigoPlata;
		this.CodigoBronce = codigoBronce;
	}

	public Categoria getCategoria() {
		return Categoria;
	}

	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}

	public Juez getJuez() {
		return Juez;
	}

	public void setJuez(Juez juez) {
		Juez = juez;
	}

	public Integer getCodigoOro() {
		return CodigoOro;
	}

	public void setCodigoOro(Integer codigoOro) {
		CodigoOro = codigoOro;
	}

	public Integer getCodigoPlata() {
		return CodigoPlata;
	}

	public void setCodigoPlata(Integer codigoPlata) {
		CodigoPlata = codigoPlata;
	}

	public Integer getCodigoBronce() {
		return CodigoBronce;
	}

	public void setCodigoBronce(Integer codigoBronce) {
		CodigoBronce = codigoBronce;
	}
	
	
	

}
