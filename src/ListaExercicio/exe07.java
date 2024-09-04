package ListaExercicio;

public class exe07 {

	public static void main(String[] args) {
		int numero = 13;
		while (numero >= 1) {			
			numero = calculate(numero);
		}
	}
	
	public static int calculate(int x) {
		int y = 0;
		if (x % 2 == 0) {
			y = x/2;
		}
		else {
			y = 3 * x + 1;
		}
		System.out.println(y);
		return y;
	}

}
