package Modelo.Excepciones;

public class CamposVacios extends Exception
{
    private String resp;
	
	public CamposVacios(String respuesta)
	{
		this.resp=respuesta;
	}

	public String getResp() {
		return resp;
	}
}
