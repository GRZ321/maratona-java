package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 -- categoria infantil
        // idade >=15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 1000;
        String categoria = "nada";
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }

        System.out.println(categoria);
    }

}

