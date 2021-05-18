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
		//declaração das listas 
		List<Integer> id = new ArrayList<>(); 
		List <String>name = new ArrayList<>(); 
		List <Double>salario = new ArrayList<>();
		
		
		//começando o programa 
		System.out.println("Digite quantos funcionários serão registrados");
		n = sc.nextInt();
		    
		  for(i = 0 ; i < n ; i++) {
		       sc.nextLine();
		       System.out.println("Digite o nome do funcionário: ");
		       name.add(sc.nextLine());
		       System.out.println("Digite o id do funcionário: ");
		       id.add(sc.nextInt());
		       System.out.println("Digite o salario do funcionário: ");
		       salario.add(sc.nextDouble());
		    }
		    
		    System.out.println("Digite o id do funcionário que terá aumento de salário: ");
		    register = sc.nextInt();
		    
		    
		    if(id.indexOf(register) != -1 ) {
			      System.out.println("Digite o quantos porcento será incrementado o salário: ");
			      percentIncrement += sc.nextInt();
			      salarioFinal = (double)salario.get(id.indexOf(register)); 
			      salario2 = salarioFinal + (salarioFinal  *  percentIncrement/100);
			      salario.set(id.indexOf(register), salario2);
			  }else{
			      System.out.println("O id não existe");
			  }  
		   
		    
		    for(i = 0 ; i < n ; i++) {
		    	System.out.println("O nome do funcionário é: "+ name.get(i));
		    	System.out.println("O id do funcionário é: "+ id.get(i));
		    	System.out.println("O salario do funcionário é: "+ salario.get(i));
		    }
	}
}


