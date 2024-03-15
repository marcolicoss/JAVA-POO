package aula2.Lista1;

import java.util.Scanner;
/*
Escreva um algoritmo que calcule a m�dia dos n�meros digitados pelo usu�rio, se eles forem 
pares. Termine a leitura se o usu�rio digitar zero (0). 
*/
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0, contador = 0;

        while (true) {
            System.out.print("Digite um numero (ou 0 para sair): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break; // sai do la�o se o n�mero digitado for zero
            }

            if (numero % 2 == 0) {
                soma += numero;
                contador++;
            }
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Media dos numeros pares digitados: " + media);
        } else {
            System.out.println("Nenhum numero par foi digitado.");
        }
    }
}
