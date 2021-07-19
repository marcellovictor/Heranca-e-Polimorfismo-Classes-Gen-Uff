package app;

import Formas.Circulo;
import Formas.FiguraGeometrica;
import Formas.Quadrado;
import Formas.Retangulo;
import Formas.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		FiguraGeometrica quad = new Quadrado (4.0, 5.5);
		FiguraGeometrica retn = new Retangulo (4.2, 9.5);
		FiguraGeometrica circ = new Circulo (2.0);
		FiguraGeometrica trng = new Triangulo (3.0, 5.0);
		
		System.out.println(String.format("%.2f", quad.calculaArea()));
		System.out.println(String.format("%.2f", retn.calculaArea()));
		System.out.println(String.format("%.2f", circ.calculaArea()));
		System.out.println(String.format("%.2f", trng.calculaArea()));

	}

}
