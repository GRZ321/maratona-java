package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();    // variavel de referencia do tipo estudante, para criar objetos tem que usar sempre a palavra NEW, o nome do objeto
        estudante.idade = 12;
        estudante.nome = "Luffy";
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println(estudante);



    }
}
