package academy.devdojo.maratona.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 70000;

        for (int parcela = (int) valorCarro; parcela >= 1 ; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+parcela+" R$ "+ valorParcela);
        }





    }
}
