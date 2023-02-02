package academy.devdojo.maratona.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch: Dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        // considerando 1 como domingo

        Scanner d = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        byte diaDaSemana = d.nextByte();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo - Final de Semana!");
                break;
            case 2:
                System.out.println("Segunda - dia útil");
                break;
            case 3:
                System.out.println("Terça - dia útil");
                break;
            case 4:
                System.out.println("Quarta - dia útil");
                break;
            case 5:
                System.out.println("Quinta - dia útil!");
                break;
            case 6:
                System.out.println("Sexta - dia útil");
                break;
            case 7:
                System.out.println("Sábado - Fim de Semana!");
                break;
            default:
                System.out.println("Digite um número válido!!");
                break;

        }

    }
}
