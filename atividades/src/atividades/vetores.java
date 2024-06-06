package atividades;
import java.util.Scanner;

public class vetores {
	public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);
        int numArr, soma = 0, maior, menor;
        
        do{
        System.out.println("Digite o tamanho da Array: ");
        numArr = sc.nextInt();
        }while(numArr < 2);
        
        int [] numeros = new int[numArr]; //Criação da array (vetor)
        
        //Preenchimento
        for(int i = 0; i < numArr; i++){
            
            System.out.print("Digite um valor: ");
            numeros[i] = sc.nextInt();
        }
        
        for(int i = 0; i < numArr; i++){
            System.out.print(numeros[i] + " ");
        }
        
        //Soma
        for(int i = 0; i < numArr; i++){
            soma += numeros[i];
        }
		
        System.out.println("\nA soma dos valores é igual a " + soma);
        
        //Media
        System.out.println("A média de todos os valores é: " + (soma / numArr));
        
        //Identificar o maior e menor
        menor = numeros[0];
        maior = numeros[0];
        for(int i = 0; i < numArr; i++){
            
            if(numeros[i] < menor) menor = numeros[i];
            if(numeros[i] > maior) maior = numeros[i];
            
        }
        System.out.println("O maior numero é: " + maior + ", e o menor numero é: " + menor);
        
        //Substituir
        System.out.print("Digite um valor novamente:");
        numeros[1] = sc.nextInt();
        System.out.print("Digite um valor:");
        numeros[0] = sc.nextInt();
        
        soma = 0;
        
        for(int i = 0; i < numArr; i++){
            soma += numeros[i];
        }
        System.out.println("A soma do vetor é " + soma);
        
        System.out.println("A média da soma é: " + (soma / numArr));
        
        sc.close();
        
    }
}
