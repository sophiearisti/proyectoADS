package Modelo.Excepciones;

public class SinInformacion extends Exception
{
	 private String resp;
		
		public SinInformacion(String respuesta)
		{
			this.resp=respuesta;
		}

		public String getResp() {
			return resp;
		}
}
