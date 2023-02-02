package academy.devdojo.maratona.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // soma, subtração, divisão, multiplicação
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        // %
        int resto = 20 % 3;
        System.out.println(resto);

        //  <  >  <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);

        // && --- AND /// OR -- || (Or) ---- !
        int idade = 29;
        float salario = 3500F;
        boolean isDentrodaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        System.out.println(isDentrodaLeiMaiorQueTrinta);
        boolean isDentrodaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentrodaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // =,   +=  , -= ,  *= ,  /=,  %=

        double bonus = 1800;
        bonus -= 1000;
        bonus += 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        int contador2 = 0;
        System.out.println(++contador2);

    }
}
