import java.util.ArrayList;

public class Geometria {
	
	private ArrayList<Figura> list;
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Quadrado("Quadrado",));
		figuras.add(new Retangulo("Retangulo",));
		figuras.add(new Losango("Losango",));
		figuras.add(new Triangulo("Triangulo",area ,perimetro ,diagonal));
		}
	
}
