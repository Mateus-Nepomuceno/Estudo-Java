package maratonajava.javacore.a18string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Mateus"; //String constant pool
        String nome2 = "Mateus";
        nome = nome.concat(" Nepomuceno"); // nome += " Nepomuceno"
        System.out.println(nome == nome2);

        String nome3 = new String("Mateus"); // 1. Variavel de referencia, 2. Objeto do tipo String, 3. String no pool de Strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
