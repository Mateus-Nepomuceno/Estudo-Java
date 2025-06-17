package exercicios.introducao;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        /*
        Crie um programa que leia as notas de 10 alunos e armazene em um array. Em seguida, o programa deve:
        -Calcular a média geral da turma.
        -Exibir as notas acima da média.
        -Informar quantos alunos foram aprovados (nota ≥ 6).
         */
        Scanner scanner = new Scanner(System.in);
        double[] notasAlunos = new double[10];
        double soma = 0;
        int aprovados = 0;

        for (int i = 0; i < notasAlunos.length ; i++) {
            System.out.print("Digite a nota do aluno "+(i+1)+": ");
            notasAlunos[i] = scanner.nextDouble();
            soma += notasAlunos[i];

            if (notasAlunos[i]>=6){
                aprovados++;
            }
        }

        double media = soma/ notasAlunos.length;

        System.out.printf("A média da turma é: %.1f%n",media);
        System.out.print("Notas acima da média:");
        for (double notas : notasAlunos) {
            if (notas>media){
                System.out.print(" "+notas);
            }
        }

        System.out.println("\nNa turma foram aprovados "+aprovados+ " alunos");

        scanner.close();
    }
}
