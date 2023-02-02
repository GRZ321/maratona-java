package academy.devdojo.maratona.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

       String nome = "Gabriel";
       String endereco = "Rua Carolina Prado Penteado, 629";
       double salario = 2000.0;
       String dataRecebimentoSalario = "19/01/2023";
       String relatorio = "Eu "+ nome + ", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
