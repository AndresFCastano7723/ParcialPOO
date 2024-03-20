package logica;

public class Mujer extends Calculadora {
	
	public Mujer(int edad, double peso, double altura) {
		super(edad, altura, altura);
	}
	
	public Mujer() {
		super();
	}
	
	@Override
	public double TMB() {
		return 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);
	}

}
