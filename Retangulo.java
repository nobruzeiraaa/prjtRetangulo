package prjtRetangulo;

public class Retangulo {
	
	double base;
	double altura;
	double area;
	double perimetro;
	
	public void calcularArea () {
		area = base * altura;
		System.out.println("A área é: "+area);
		
	}
	public void calcularPerimetro() {
		perimetro = base + base + altura + altura;
		System.out.println("O perímetro é: "+perimetro);
	}

}
