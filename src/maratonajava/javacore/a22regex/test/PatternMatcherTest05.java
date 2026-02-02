package maratonajava.javacore.a22regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-zA-Z, dígitos, _
        // \W = Tuo o que não for incluso no \w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $
        //. 1.3 = 123, 133, 1@3, 1A3

        String regex = "([a-z0-9._-])+@([a-z])+(\\.([a-z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com.br, #@!zoro@mail.br, sakura@mail teste@gmail.com";
        System.out.print("Email válido: ");
        System.out.println("#@!zoro@mail.br".matches(regex));

        System.out.println("Email selecionado: "+texto.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex:  "+regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+ matcher.group()+"\n");
        }
    }
}
