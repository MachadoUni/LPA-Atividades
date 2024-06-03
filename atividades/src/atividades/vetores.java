package atividades;
import java.util.Scanner;

public class vetores {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArr, soma = 0, maior, menor;
        
        System.out.println("Digite o tamanho da Array: ");
        numArr = sc.nextInt();
        int [] numeros = new int[numArr]; //Criação da array (vetor)
        
        //Preenchimento
        for(int i = 0; i < numArr; i++){
            
            System.out.print("Digite um valor: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Primeiro valor: "+ numeros[0]+ '\n' + "Segundo valor: " + numeros[1] + '\n' + "Terceiro valor: " + numeros[2]);
        
        //Soma
        for(int i = 0; i < numArr; i++){
            soma += numeros[i];
            
        }
        System.out.println("A soma dos valores é igual a " + soma);
        
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
        
        soma = numeros[1] + numeros[0];
        System.out.println(numeros[1] + " + " + numeros[0] + " = " + soma);
        
        System.out.println("A média de desses valores é: " + (soma / 2));
        
        sc.close();
        
    }
}
