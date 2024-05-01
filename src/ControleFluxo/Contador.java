package ControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Digite o primeiro parâmetro: ");
		int paramentroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int paramentroDois = sc.nextInt();
		
		 try{
			 contar(paramentroUm, paramentroDois);
	        }catch (ParametrosInvalidosException e){
	            System.out.println("Erro: " + e.getMessage());
	        }
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }else {
            int diferenca = parametroDois - parametroUm;
            for (int i=1; i <= diferenca; i++) {
                System.out.println("Imprimindo a " + i + " interação: " + i);
            }
        }
	}  
 }
	

	
	


