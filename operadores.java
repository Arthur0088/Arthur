package primeiraaula;

import java.util.Scanner;

public class operadores {

	public static void main(String[] args) {
	
	int x,y;
		
	Scanner leitor=new Scanner(System.in);
	 
	System.out.println("digite o priemiro número");
	x=leitor.nextInt();
	 
	System.out.println("digite o segundo número");
	y=leitor.nextInt();
	
	int soma=x+y;
	int subtracao=x-y;
	int multiplicacao=x*y;
	int divisaoInteira=x/y;
	double divisaoComum=(double)x/y;
	int modulo=x%y;
	

	System.out.println("Soma ="+soma);
	System.out.println("Subtração ="+subtracao);
	System.out.println("Multiplicação ="+multiplicacao);
	System.out.println("Divisão Inteira ="+divisaoInteira);
	System.out.println("Divisão Comum="+divisaoComum);
	System.out.println("Modulo ="+modulo);
	
		
		
		
		
		
		
	}

}
