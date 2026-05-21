package Mains;

import java.util.Scanner;

import builders.OperacionBuilder;
import dto.Operacion;
import parsers.OperacionParser;
import servicios.CalculadoraEjecutor;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		OperacionParser opp = new OperacionParser();
		
		CalculadoraEjecutor ce = new CalculadoraEjecutor();
		
		System.out.println("Ingrese la operacion y los parametros");
		
		String ops = sc.nextLine();
		
		
		Operacion op1 = opp.parse(ops);
		
		int res = ce.ejecutar(op1);
		
		System.out.println("Resultado: " + res);
		
		

	}

}
