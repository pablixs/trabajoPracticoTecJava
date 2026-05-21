package parsers;

import builders.OperacionBuilder;
import dto.Operacion;
import interfaces.OpParser;

public class OperacionParser implements OpParser<Operacion> {

	@Override
	public Operacion parse(String texto) {
		
		OperacionBuilder builder = new OperacionBuilder();
		
		String[] segmentos = texto.split(" ");
		
		builder.setTipo(segmentos[0]);
		
		for(int i = 1; i < segmentos.length; i++) {
			builder.addParam(Integer.parseInt(segmentos[i]));
		}
		
		
		return builder.build();
	}

}
