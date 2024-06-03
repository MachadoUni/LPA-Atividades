package atividades;
import java.util.Scanner;

public class matrizes {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int linha, coluna, busca, resultados = 0, pares = 0, impares = 0;
   	 
    	do{
    	System.out.print("Digite o numero de linhas:");
    	linha = sc.nextInt();
    	}while(linha <= 0);
    	do{
    	System.out.print("Digite o numero de colunas:");
    	coluna = sc.nextInt();
    	}while(coluna <= 0);
   	 
    	//criação da matriz
    	int matriz[][] = new int[linha][coluna];
   	 
    	for (int i = 0; i < linha; i++){
        	for (int j = 0; j < coluna; j++){
            	System.out.println("Informe um valor para pocição " + i + ", " + j);
            	matriz[i][j] = sc.nextInt();
        	}
    	}
   	 
    	for (int i = 0; i < linha; i++){
        	for (int j = 0; j < coluna; j++){
            	System.out.print(matriz[i][j] + ", ");
        	}
        	System.out.print('\n');
    	}
   	 
    	//busca
    	System.out.println("Digite um valor para buscar na matriz: ");
    	busca = sc.nextInt();
   	 
    	for (int i = 0; i < linha; i++){
        	for (int j = 0; j < coluna; j++){
            	if(matriz[i][j] == busca) resultados++;
        	}
    	}
   	 
    	System.out.println("A matriz possui " + resultados + " posições com esse valor." + '\n');
    	
    	for(int i = 0; i < linha; i++) {
    		for (int j = 0; j < coluna; j++){
            	if(matriz[i][j] % 2 == 0) {
            		pares++;
            	}else {
            		impares++;
            	}
    		}
    	}
    	
    	System.out.println("Existem " + pares + " numeros pares na matriz e " + impares + " numeros impares");
    	
    	System.out.println('\n');
    	System.out.print("Digite o tamanho das matrizes quadradas: ");
    	linha = sc.nextInt();
    	
    	int quadrada1 [][] = new int[linha][linha];
    	int quadrada2 [][] = new int[linha][linha];
    	
    	for (int i = 0; i < linha; i++){
        	for (int j = 0; j < linha; j++){
            	System.out.println("Informe um valor para pocição " + i + ", " + j + " da matriz quadrada 1");
            	quadrada1[i][j] = sc.nextInt();
        	}
    	}
   	 
    	for (int i = 0; i < linha; i++){
        	for (int j = 0; j < linha; j++){
            	System.out.println("Informe um valor para pocição " + i + ", " + j + " da matriz quadrada 2");
            	quadrada2[i][j] = sc.nextInt();
        	}
    	}
    	
    	System.out.println('\n');
    	System.out.print("Matriz quadrada 1: " + '\n');
    	
    	for (int i = 0; i < linha; i++){
        	for (int j = 0; j < linha; j++){
            	System.out.print(quadrada1[i][j] + ", ");
        	}
        	System.out.print('\n');
    	}
    	
    	System.out.println('\n');
    	System.out.print("Matriz quadrada 2: " + '\n');
    	
    	for (int i = 0; i < linha; i++){
        	for (int j = 0; j < linha; j++){
            	System.out.print(quadrada2[i][j] + ", ");
        	}
        	System.out.print('\n');
    	}
    	
    	int soma [][] = new int [linha][linha];
    	
    	for (int i = 0; i < linha; i++){
        	for (int j = 0; j < linha; j++){
        		soma[i][j] = quadrada1[i][j] + quadrada2[i][j];
        	}
    	}
    	
    	System.out.println('\n');
    	System.out.print("A soma das duas matrizes é igual a:" + '\n');

    	for (int i = 0; i < linha; i++){
        	for (int j = 0; j < linha; j++){
            	System.out.print(soma[i][j] + ", ");
        	}
        	System.out.print('\n');
    	}
    	
    	sc.close();
	}
}

