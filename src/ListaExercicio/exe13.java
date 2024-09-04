package ListaExercicio;

public class exe13 {

	public static void main(String[] args) {
		ordena(10, 20, 3, 10);
	}
	
	public static void ordena(double n1, double n2, double n3, double n4) {
		double temp;
		
		if (n1 < n2) {
			temp = n1;
			n1 = n2;
			n2 = temp; 
		}
		if (n1 < n3) {
            temp = n1;
            n1 = n3;
            n3 = temp;
        }
        if (n1 < n4) {
            temp = n1;
            n1 = n4;
            n4 = temp;
        }
        if (n2 < n3) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n2 < n4) {
            temp = n2;
            n2 = n4;
            n4 = temp;
        }
        if (n3 < n4) {
            temp = n3;
            n3 = n4;
            n4 = temp;
        }
        System.out.println("Número 1: " + n1);
        System.out.println("Número 2: " + n2);
        System.out.println("Número 3: " + n3);
        System.out.println("Número 4: " + n4);
	}

}
