package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 //variaveis que iremos usar 
		int i, percentIncrement = 0, n, register; 
		double salarioFinal = 0, salario2 = 0; 
		Scanner sc = new Scanner(System.in); 
		//declara��o das listas 
		List<Integer> id = new ArrayList<>(); 
		List <String>name = new ArrayList<>(); 
		List <Double>salario = new ArrayList<>();
		
		
		//come�ando o programa 
		System.out.println("Digite quantos funcion�rios ser�o registrados");
		n = sc.nextInt();
		    
		  for(i = 0 ; i < n ; i++) {
		       sc.nextLine();
		       System.out.println("Digite o nome do funcion�rio: ");
		       name.add(sc.nextLine());
		       System.out.println("Digite o id do funcion�rio: ");
		       id.add(sc.nextInt());
		       System.out.println("Digite o salario do funcion�rio: ");
		       salario.add(sc.nextDouble());
		    }
		    
		    System.out.println("Digite o id do funcion�rio que ter� aumento de sal�rio: ");
		    register = sc.nextInt();
		    
		    
		    if(id.indexOf(register) != -1 ) {
			      System.out.println("Digite o quantos porcento ser� incrementado o sal�rio: ");
			      percentIncrement += sc.nextInt();
			      salarioFinal = (double)salario.get(id.indexOf(register)); 
			      salario2 = salarioFinal + (salarioFinal  *  percentIncrement/100);
			      salario.set(id.indexOf(register), salario2);
			  }else{
			      System.out.println("O id n�o existe");
			  }  
		   
		    
		    for(i = 0 ; i < n ; i++) {
		    	System.out.println("O nome do funcion�rio �: "+ name.get(i));
		    	System.out.println("O id do funcion�rio �: "+ id.get(i));
		    	System.out.println("O salario do funcion�rio �: "+ salario.get(i));
		    }
	}
}


