package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Gol";
        carro1.ano = 2015;
        carro1.modelo = "V2";

        carro2.nome = "Ferrari";
        carro2.ano = 2024;
        carro2.modelo = "V6";

        carro1 = carro2;

        System.out.println("Carro 01: Nome - "+carro1.nome+". Ano - "+carro1.ano+". Modelo -"+carro1.modelo);
        System.out.println("Carro 02: Nome - "+carro2.nome+". Ano - "+carro2.ano+". Modelo -"+carro2.modelo);
    }
}
