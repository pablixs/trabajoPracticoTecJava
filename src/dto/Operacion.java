package dto;

public class Operacion {
	private String tipo;
	private int[] parametros;
	
	public Operacion(String tipo, int[] parametros) {
		this.tipo = tipo;
		this.parametros = parametros;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int[] getParametros() {
		return parametros;
	}
	
}
