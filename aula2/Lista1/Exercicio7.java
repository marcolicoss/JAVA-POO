package aula2.Lista1;

import java.util.Scanner;
/*
Uma empresa deseja aumentar seus pre�os em 20%. 
Fa�a um algoritmo que leia o c�digo e 
o pre�o de custo de cada produto e calcule o pre�o novo.

Calcule tamb�m, a m�dia dos pre�os com e sem aumento. 
Mostre o c�digo e o pre�o novo de cada produto e, no final, as m�dias. 
A entrada de dados deve terminar quando for lido um c�digo de produto negativo.
*/
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        double precoCusto, precoNovo, somaPrecoCusto = 0, somaPrecoNovo = 0;
        int quantidadeProdutos = 0;

        do {
            System.out.print("Digite o c�digo do produto (ou um n�mero negativo para sair): ");
            codigo = scanner.nextInt();

            if (codigo >= 0) {
                System.out.print("Digite o pre�o de custo do produto: R$");
                precoCusto = scanner.nextDouble();

                precoNovo = precoCusto * 1.2; // Aumento de 20%
                somaPrecoCusto += precoCusto;
                somaPrecoNovo += precoNovo;
                quantidadeProdutos++;

                System.out.printf("C�digo do produto: %d | Pre�o novo: R$%.2f\n", codigo, precoNovo);
            }
        } while (codigo >= 0);

        double mediaPrecoCusto = somaPrecoCusto / quantidadeProdutos;
        double mediaPrecoNovo = somaPrecoNovo / quantidadeProdutos;

        System.out.printf("M�dia dos pre�os de custo: R$%.2f | M�dia dos pre�os com aumento: R$%.2f\n",
                mediaPrecoCusto, mediaPrecoNovo);
    }
}
