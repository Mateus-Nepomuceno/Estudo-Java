package maratonajava.javacore.a16excecption.exception.test;

import maratonajava.javacore.a16excecption.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException{
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha");
        String senhaDigitado = sc.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}