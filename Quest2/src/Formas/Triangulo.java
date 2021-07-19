package Formas;

public class Triangulo extends FiguraGeometrica{

	public Double base;
	public Double altura;
	
	public Triangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
		return (base*altura) / 2;
	}
}
