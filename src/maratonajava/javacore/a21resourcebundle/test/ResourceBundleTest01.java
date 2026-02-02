package maratonajava.javacore.a21resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("mensagens", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

        bundle = ResourceBundle.getBundle("mensagens", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        // Locale("fr", "CA");
        // mensagens_fr_CA.properties
        // mensagens_fr.properties
        // mensagens_pt_BR.properties
        // mensagens_pt.properties
        // mensagens.properties

        System.out.println(bundle.getString("hi"));
    }
}
