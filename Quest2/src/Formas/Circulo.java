package Formas;

public class Circulo extends FiguraGeometrica{

	private Double raio;
	
	public Circulo(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calculaArea() {
		return Math.PI*Math.pow(raio, 2);
	}
}
