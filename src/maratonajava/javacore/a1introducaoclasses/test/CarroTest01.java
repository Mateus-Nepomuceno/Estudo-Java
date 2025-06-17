package maratonajava.javacore.a1introducaoclasses.test;

import maratonajava.javacore.a1introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Gol";
        carro1.modelo = "Sport";
        carro1.ano = 2015;

        carro2.nome = "Lamborghini";
        carro2.modelo = "Urus";
        carro2.ano = 2018;

        System.out.println("Carro 1: "+carro1.nome+" - Modelo: "+carro1.modelo+" - Ano: "+carro1.ano);
        System.out.println("Carro 2: "+carro2.nome+" - Modelo: "+carro2.modelo+" - Ano: "+carro2.ano);
    }
}
