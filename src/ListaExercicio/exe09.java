package ListaExercicio;

public class exe09 {

	public static void main(String[] args) {
		int horas = 220;
		double valorHora = 5;
		
		desconto(horas, valorHora);
	}
	
	public static void desconto(int horas, double valorHora) {
		double salarioBruto = horas * valorHora;
		System.out.println("Salário bruto: " + salarioBruto);
		
		double inss = salarioBruto * 0.1;
		double fgts = salarioBruto * 0.11;
		double ir = 0;
		double salarioLiquido = salarioBruto;
		
		if (salarioBruto > 900) {
			if(salarioBruto <= 1500) {
				ir = salarioBruto * 0.05;
				System.out.println("IR -5%: " + ir);
			}
			else if (salarioBruto > 1500 && salarioBruto <= 2500) {
				ir = salarioBruto * 0.1;
				System.out.println("IR -10%: " + ir);
			}
			else {
				ir = salarioBruto * 0.2;
				System.out.println("IR -20%: " + ir);
			}
		}
		
		double descontos = ir + inss;
		salarioLiquido = salarioLiquido - descontos;
		System.out.println("INSS -10%: " + inss);
		System.out.println("FGTS 11%: " + fgts);
		System.out.println("Total de Descontos: " + descontos);
		System.out.println("Salário líquido: " + salarioLiquido);
		
	}

}
