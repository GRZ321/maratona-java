package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercise01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gohan");
        funcionario.setIdade(16);
        funcionario.setSalario(new float[]{1200, 1400, 5000});



        funcionario.imprimeDados();
        System.out.println();
        funcionario.mediaSalario();

    }
}
