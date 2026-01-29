package maratonajava.javacore.a18string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Mateus Nepomuceno";
        nome.concat(" DevDojo");
        nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Mateus Nepomuceno");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
