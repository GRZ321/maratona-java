package academy.devdojo.maratona.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = n.nextDouble();
        double imposto;
        String mensagemFinalSalario = "Imposto para pagar na Holanda é: ";

        if (salario >= 0 && salario <= 34712) {
            imposto = salario * 9.70 / 100;
            salario = salario - imposto;
        } else if (salario > 34712 && salario <= 68507){
            imposto = salario * 37.35 / 100;
            salario -= imposto;
        }else {
            imposto = salario * 49.50 / 100;
            salario -= imposto;
        }

        System.out.println(mensagemFinalSalario + imposto);







    }
}
