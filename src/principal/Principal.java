package principal;

import logica.Calculadora;
import logica.Hombre;
import logica.Mujer;

public class Principal {

	public static void main(String[] args) {
		Calculadora cl = new Hombre(19, 63, 163);
		System.out.println(cl.TMB());
		
		cl = new Mujer(19, 63, 163);
		System.out.println(cl.TMB());
	}

}
