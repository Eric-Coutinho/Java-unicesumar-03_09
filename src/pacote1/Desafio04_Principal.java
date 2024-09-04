package pacote1;

public class Desafio04_Principal 
{

	public static void main(String[] args) 
	{
		System.out.println("Desafio 04 Loop While");
		
		int num = 0;
		
		while(num <=10) {
			//so imprime se o numero for par
			if(num%2 == 0) {
				System.out.println(num);
			}
				
			num = num + 1;
		}
		System.out.println("Fim do Desafio 04");
		
	}

}
