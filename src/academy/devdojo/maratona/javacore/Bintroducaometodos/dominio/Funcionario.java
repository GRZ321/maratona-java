package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private float[] salario;


    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (float aux : salario) {
            System.out.print(aux + " ");
        }

    }

    public void mediaSalario() {
        float soma = 0;
        int contador = 0;
        for (float aux : salario) {
            soma += aux;
            contador++;
        }
        float media = soma / contador;
        System.out.println(media);


    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(float[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float[] getSalario() {
        return salario;
    }
}
