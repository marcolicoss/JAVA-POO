package aula2.Lista1;

import java.util.Scanner;

/* 
Fa�a um Programa que leia um vetor de 5 
n�meros inteiros, mostre a soma, 
a multiplica��o e os n�meros.
*/

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = scan.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        System.out.println("Soma: "+soma);
        System.out.println("Multiplicacao: "+multiplicacao);
        
    }
}
