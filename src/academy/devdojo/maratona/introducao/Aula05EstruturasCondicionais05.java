package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana considerando o 1 como domingo
        byte dia = 100;
        // char, int , byte, enum, String;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Inválida! Digite de 1 até 7");
                break;


        }

        char sexo = 'M';
        switch(sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção Inválida! Digite outro valor");
                break;
        }


    }
}
