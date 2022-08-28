package aplicacao;

public class Entidade {
	public double largura;
	public double altura;
	
	public double areaRetangulo() {
		double area = altura * largura;
		return area;
	}	
	public double perimetroRetangulo() {
		double perimetro = 2*(altura+largura);
		return perimetro;
	}	
	public double diagonalRetangulo() {
		double diagonal = Math.sqrt(altura*altura+largura*largura);
		return diagonal;
		
	}
		
}
	