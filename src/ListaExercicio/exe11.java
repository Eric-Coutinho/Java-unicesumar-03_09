package ListaExercicio;

public class exe11 {

	public static void main(String[] args) {
		maior(100, 100, 100);

	}
	
	public static void maior(double x, double y, double z) {
		double maior = -9999, menor = 99999;
		
		if (x > y) {
			maior = x;
			menor = y;
		}
		else if (x < y) {
			maior = y;
			menor = x;
		}
		else {
			maior = x;
			menor = y;
		}
		
		if (maior < z) {
			maior = z;
		}
		else if (menor > z) {
			menor = z;
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}

}
