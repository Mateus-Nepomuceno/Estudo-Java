package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

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
