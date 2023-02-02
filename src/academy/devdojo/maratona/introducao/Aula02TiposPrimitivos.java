package academy.devdojo.maratona.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, float, double, char, byte, short, long, boolean
        int age = (int) 100000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0035';
        String nome = "Gabriel Romulo Zaniboni";

        System.out.println( "A idade é "+age + " anos");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(numeroGrande);
        System.out.println( "Oi meu nome é "+ nome);
    }
}
