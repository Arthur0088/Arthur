package primeiraaula;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
	
			String nome, cidade;
			int idade;
			
			Scanner leitor=new Scanner(System.in);
		   
			System.out.print("digite seu nome");
			nome=leitor.next();
					
			System.out.println("boas vindas "+ nome +"!");
			
			System.out.print("digite sua idade");
			idade=leitor.nextInt();
			
			System.out.print("digite sua cidade");
            cidade=leitor.next();
            
           
            
            System.out.println("NOME: "+ nome +"");
            System.out.println("IDADE: "+ idade +"");
            System.out.println("CIDADE: "+ cidade +"");
            
            
            		
            		
	
		
		
		
		
	}

}
