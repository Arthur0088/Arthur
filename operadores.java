package primeiraaula;

import java.util.Scanner;

public class operadores {

	public static void main(String[] args) {
	
	int x,y;
		
	Scanner leitor=new Scanner(System.in);
	 
	System.out.println("digite o priemiro n�mero");
	x=leitor.nextInt();
	 
	System.out.println("digite o segundo n�mero");
	y=leitor.nextInt();
	
	int soma=x+y;
	int subtracao=x-y;
	int multiplicacao=x*y;
	int divisaoInteira=x/y;
	double divisaoComum=(double)x/y;
	int modulo=x%y;
	

	System.out.println("Soma ="+soma);
	System.out.println("Subtra��o ="+subtracao);
	System.out.println("Multiplica��o ="+multiplicacao);
	System.out.println("Divis�o Inteira ="+divisaoInteira);
	System.out.println("Divis�o Comum="+divisaoComum);
	System.out.println("Modulo ="+modulo);
	
		
		
		
		
		
		
	}

}
