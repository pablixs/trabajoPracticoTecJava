package servicios;

import dto.Operacion;
import interfaces.Ejecutor;

public class CalculadoraEjecutor implements Ejecutor<Operacion, Integer>{

	@Override
	public Integer ejecutar(Operacion op) {
		int[] params = op.getParametros();
		
		switch(op.getTipo()) {
			case "SUMA": return this.suma(params[0], params[1]);
			case "RAIZ": return this.raiz(params[0]);
			
			default: throw new RuntimeException("Operacion inexistente");
		}
	}
	
	public int suma(int a, int b) {
		return a+b;
	}
	
	public int raiz(int x) {
		return (int) Math.sqrt(x);
	}

}
