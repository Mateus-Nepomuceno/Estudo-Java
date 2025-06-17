package maratonajava.javacore.a8associacao.exercicio.test;

import maratonajava.javacore.a8associacao.exercicio.dominio.Aluno;
import maratonajava.javacore.a8associacao.exercicio.dominio.Local;
import maratonajava.javacore.a8associacao.exercicio.dominio.Professor;
import maratonajava.javacore.a8associacao.exercicio.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("DevDojo");

        Aluno aluno = new Aluno("Mateus", 21);
        Aluno[] alunos = {aluno};

        Professor professor = new Professor("William","Java");

        Seminario seminario = new Seminario("Maratona Java",alunos, local);
        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);
        professor.imprimeDados();
    }
}
