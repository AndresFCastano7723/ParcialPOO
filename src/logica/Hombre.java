package logica;

public class Hombre extends Calculadora {
	
	public Hombre(int edad, double peso, double altura) {
		super(edad, altura, altura);
	}
	
	public Hombre() {
		super();
	}

	@Override
	public double TMB() {
		return 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
	}

}
