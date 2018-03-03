
public class Circulo extends Figura {

	private double raio;
	Circulo(double raio) {
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	@Override
	double perimetro() {
		return 2 * Math.PI * raio;
	}
}