package NotaAula1.Questao1;

import java.util.Scanner;

public class SituacaoAcademica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Aluno: %s\n", nome);
        System.out.printf("Média: %.2f\n", media);

        if (media >= 70) {
            System.out.println("Situação: Aprovado");
        } else if (media < 40) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Na final");
        }

        scanner.close();
    }
}
