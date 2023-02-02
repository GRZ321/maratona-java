package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiat Uno";
        carro1.ano = 2010;
        carro1.modelo = "Sedan";

        carro2.nome = "Toyota Corolla";
        carro2.ano = 2019;
        carro2.modelo = "Sedan";

        carro1 = carro2;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("---------------------");



        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
