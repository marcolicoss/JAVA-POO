package aula2.Lista1;

import java.util.Scanner;

/* Fa�a um Programa que leia 10 n�meros inteiros 
e armazene-os num vetor. Armazene os n�meros 
pares no vetor PAR e os n�meros IMPARES no 
vetor impar. Imprima os tr�s vetores.*/

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        
        int countPar = 0;
        int countImpar = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = scan.nextInt();
            
            if (numeros[i] % 2 == 0) {
                pares[countPar] = numeros[i];
                countPar++;
            }
            else {
                impares[countImpar] = numeros[i];
                countImpar++;
            }
        }
        
        System.out.print("Todos:");
        imprimeVetor(numeros);
        
        System.out.println("");
        System.out.print("pares: ");
        imprimeVetor(pares);
        
        System.out.println("");
        System.out.print("impares: ");
        imprimeVetor(impares);
    }
    
    // =====================================================
    public static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
              System.out.print("*"+vetor[i]+", ");  
            }
        }
    }
}
