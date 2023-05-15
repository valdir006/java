import java.util.Scanner;

import entidades.Retângulo;
public class atividade009 {

	public static void main(String[] args) {
		// Fazer um programa para calcular as medidas de um retângulo
		
		
		Scanner in = new Scanner(System.in);
		Retângulo ret = new Retângulo();
		System.out.println("informe a base do retângulo:");
		ret.base = in.nextDouble();
		System.out.println("informe a altura do retângulo:");
		ret.altura = in.nextDouble();
		double area = ret.calcArea();
		System.out.println("A area do retângulo é "+area);
		double perimetro = ret.calcPerimetro();
		System.out.println("O perimetro é "+perimetro);
		double diagonal = ret.calcDiagonal();
		System.out.println("A diagonal é "+diagonal);

	}

}
