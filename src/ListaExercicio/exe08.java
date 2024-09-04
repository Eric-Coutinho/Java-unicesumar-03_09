package ListaExercicio;

public class exe08 {

	public static void main(String[] args) {
		
		printTabela(10);
	}
	
	public static void printTabela(int x) {
		for (int i = 1; i < x; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}
	}
}
