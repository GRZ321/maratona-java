package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario for maior que 5 mil
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro Dev Dojo!";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;


        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);

    }
}
