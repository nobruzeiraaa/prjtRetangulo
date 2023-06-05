package prjtRetangulo;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Retangulo ret = new Retangulo ();
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe a base do retângulo: ");
		ret.base = in.nextDouble();
		
		System.out.println("Informe a altura do retângulo: ");
		ret.altura = in.nextDouble();
		
		ret.calcularArea();
		ret.calcularPerimetro();

		
		in.close();
	}
	
}
