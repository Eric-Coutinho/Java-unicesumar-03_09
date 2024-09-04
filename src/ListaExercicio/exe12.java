package ListaExercicio;

public class exe12 {

	public static void main(String[] args) {
		ordena (10, 2, 300);

	}
	
	public static void ordena(double x, double y, double z) {
		double maior = -99999, menor = 99999, meio = -99999;
		
		if (x > y && x > z) {
			maior = x;
			if (y < z) {
				menor = y;
				meio = z;
			}
			else {
				menor = z;
				meio = y;
			}
		}
		
		if (y > x && y > z) {
			maior = y;
			if (x < z) {
				menor = x;
				meio = z;
			}
			else {
				menor = z;
				meio = x;
			}
		}
		
		if (z > y && z > x) {
			maior = z;
			if (y < x) {
				menor = y;
				meio = x;
			}
			else {
				menor = x;
				meio = y;
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Meio: " + meio);
		System.out.println("Menor: " + menor);
	}

}
