package aula2.Lista1;

import java.util.Scanner;
/*
 Foi feita uma pesquisa entre os 1000 habitantes de uma regi�o para coletar os seguintes dados: 
sexo  (0-feminino,  1-masculino),  idade  e  altura.  Fa�a  um  algoritmo  que  leia  as  informa��es 
coletadas e mostre as seguintes informa��es: 
a) m�dia da idade do grupo; 
b) m�dia da altura das mulheres; 
c) m�dia da idade dos homens; 
d) percentual de pessoas com idade entre 18 e 35 anos (inclusive). 
*/
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPessoas = 3;
        int contMulheres = 0;
        int contHomens = 0;
        int contJovens = 0;
        int somaIdades = 0;
        int somaIdadeHomens = 0;
        double somaAlturasMulheres = 0;
        int idade, sexo;
        double altura;

        for (int i = 1; i <= numPessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: ");
            idade = scan.nextInt();
            
            System.out.print("Sexo (0 - feminino, 1 - masculino): ");
            sexo = scan.nextInt();

            System.out.print("Altura: ");
            altura = scan.nextDouble();

            if (sexo == 0) {
                contMulheres++;
                somaAlturasMulheres += altura;
            } else {
                contHomens++;
                somaIdadeHomens += idade;
            }

            if (idade >= 18 && idade <= 35) {
                contJovens++;
            }

            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / (contMulheres + contHomens);
        double mediaAlturasMulheres = somaAlturasMulheres / contMulheres;
        double mediaIdadesHomens = (double) somaIdadeHomens / contHomens;
        double percJovens = (double) contJovens / numPessoas * 100;

        System.out.println("\nRESULTADOS:");
        System.out.printf("M�dia de idade do grupo: %.2f\n", mediaIdades);
        System.out.printf("M�dia de altura das mulheres:  %.2f\n", mediaAlturasMulheres);
        System.out.printf("M�dia de idade dos homens:  %.2f\n", mediaIdadesHomens);
        System.out.printf("Percentual de jovens (18 a 35 anos):  %.2f %%\n", percJovens);
    }
}
