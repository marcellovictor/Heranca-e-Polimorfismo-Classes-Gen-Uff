package Formas;

public class Retangulo extends FiguraGeometrica{

	private Double largura;
	private Double altura;
	
	public Retangulo (Double largura, Double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
		return largura * altura;
	}
}
