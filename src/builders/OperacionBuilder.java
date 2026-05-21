package builders;

import java.util.ArrayList;
import java.util.List;

import dto.Operacion;

public class OperacionBuilder {
	private String tipo;
	private List<Integer> parametros;
	
	public OperacionBuilder() {
		this.parametros = new ArrayList<Integer>();
	}
	

	public OperacionBuilder setTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}
	
	public OperacionBuilder addParam(int param) {
		this.parametros.add(param);
		return this;
	}
	
	public Operacion build() {
		int len = this.parametros.size();
		
		int[] vecParams = new int[len];
		
		int i = 0;
		
		for (int para : this.parametros) {
			vecParams[i] = para;
			i++;
		}
		
		return new Operacion(this.tipo, vecParams);
	}
	
	
	
}
