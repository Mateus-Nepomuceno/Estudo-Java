package exercicios.javacore.e2calculadoradobro.dominio;

public class Calculadora {

    public void arrayDobrado(double...num){
        if (num == null){
            return;
        }
        System.out.print("Os valores dobrados são: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] * 2;
            System.out.print(num[i]+" ");
        }
    }
}
