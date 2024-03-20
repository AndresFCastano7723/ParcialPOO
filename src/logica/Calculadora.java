package logica;

public abstract class Calculadora {
	protected int edad;
	protected double peso;
	protected double altura;
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Calculadora(int edad, double peso, double altura) {
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Calculadora() {
		this.edad = 0;
		this.peso = 0;
		this.altura = 0;
	}
	
	public abstract double TMB();
}
