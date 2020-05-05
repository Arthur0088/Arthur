package primeiraaula;

import java.util.Scanner;

public class média {

	public static void main(String[] args) {
	
		String nome ;
		float nota1, nota2, nota3, nota4, media, recuperacao;
		
		Scanner leitor=new Scanner(System.in);
		
		System.out.println("digite seu nome");
		nome=leitor.next();
		
		System.out.println("digite a primeira nota");
		nota1=leitor.nextFloat();
		
		System.out.println("digite a segunda nota");
		nota2=leitor.nextFloat();
		
		System.out.println("digite a terceira nota");
		nota3=leitor.nextFloat();
		
		System.out.println("digite a quarta nota");
		nota4=leitor.nextFloat();
		
		media= (nota1+nota2+nota3+nota4) /4;
		
	    if(media >=7)
	    System.out.println("aprovado");
	    
	    else if(media <7)
	    System.out.println("digite nota da recuperação");
	    recuperacao=leitor.nextFloat();
	    
	    if(recuperacao >=7)
	    	System.out.println("aprovado");
	     
	    else if(recuperacao < 7)
	    System.out.println("reprovado");
	    
	    
	 
	    
		
		
		
		
		
		
		
		
	}

}
