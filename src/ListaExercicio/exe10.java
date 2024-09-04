package ListaExercicio;

public class exe10 {

	public static void main(String[] args) {
		reajuste(2000);
	}
	
	public static void reajuste(double salario) {
		System.out.println("Salário atual: " + salario);
		double aumento = 0;
		
		if (salario > 0 && salario <= 280) {		
			aumento = salario * 0.2;
			System.out.println("Reajuste de 20%");
		}
		else if (salario > 280 && salario <= 700) {
			aumento = salario * 0.15;
			System.out.println("Reajuste de 15%");
		}
		else if (salario > 700 && salario <= 1500) {
			aumento = salario * 0.1;
			System.out.println("Reajuste de 10%");
		}
		else {
			aumento = salario * 0.05;
			System.out.println("Reajuste de 5%");
		}
		
		double novoSalario = salario + aumento;
		
		System.out.println("Aumento de: " + aumento);
		System.out.println("Novo Salário: " + novoSalario);
	}

}
