package Formas;

public class Quadrado extends FiguraGeometrica{

	private Double largura;
	private Double altura;
	
	public Quadrado (Double largura, Double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
		return largura * altura;
	}
}
