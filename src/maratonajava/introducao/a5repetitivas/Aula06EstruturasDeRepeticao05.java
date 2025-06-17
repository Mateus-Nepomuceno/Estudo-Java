package maratonajava.introducao.a5repetitivas;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorCarro = 30000;
        double valorParcela;

        for (int i = (int) valorCarro; i >= 1; i--) {
            valorParcela = valorCarro / i;
            if (valorParcela<1000){
                continue;
            }
            System.out.printf("Valor da parcela em %dx é igual a %.2f%n", i, valorParcela);
        }
    }
}
