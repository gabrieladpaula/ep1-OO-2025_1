package Main;

import java.time.LocalDate;
import model.*;

public class TesteMain {
    public static void main(String[] args) {
        testePessoa();
        testeAlunos();
        testeMatriculas();
        testeDisciplina();
        testeTurma();
        testeAvaliacao();
        testeFrequencia();
    }
    
    private static void testePessoa() {
        Pessoa pessoa = new Pessoa("Gabriela de Paula Nascimento", "123.456.789-00");
        System.out.println("=== Teste Pessoa ===");
        System.out.println(pessoa);        
    }
    
    private static void testeAlunos() {
        AlunoNormal alunoNormal = new AlunoNormal("Gabriela de Paula Nascimento",
                "123.456.789-00", "232002717", "Engenharia de Software");
    
        AlunoEspecial alunoEspecial = new AlunoEspecial("Martinho da Vila", 
                "555.666.777-88", "23200718");
        
        System.out.println("\n=== Teste Alunos ===");
        System.out.println(alunoNormal);
        System.out.println(alunoEspecial);
    }
    
    private static void testeMatriculas() {
        AlunoNormal alunoNormal = new AlunoNormal("Gabriela de Paula Nascimento", 
                "123.456.789-00", "232002717", "Engenharia de Software");
        AlunoEspecial alunoEspecial = new AlunoEspecial("Martinho da Vila", 
                "555.666.777-88", "232002718");
        
        System.out.println("\n=== Teste Matrículas ===");
        
        for (int i = 1; i <= 7; i++) {
            boolean resultado = alunoNormal.matricularDisciplina("DISC" + i);
            System.out.println("Matrícula AlunoNormal DISC" + i + ": " + 
                    (resultado ? "Sucesso" : "Falha (limite atingido)"));
        }
        
        for (int i = 1; i <= 3; i++) {
            boolean resultado = alunoEspecial.matricularDisciplina("DISC" + i);
            System.out.println("Matrícula AlunoEspecial DISC" + i + ": " + 
                    (resultado ? "Sucesso" : "Falha (limite atingido)"));
        }
        
        System.out.println("\nDisciplinas Aluno Normal: " + 
                alunoNormal.getDisciplinasMatriculadas());
        System.out.println("Disciplinas Aluno Especial: " + 
                alunoEspecial.getDisciplinasMatriculadas());
    }

    private static void testeDisciplina() {
        Disciplina OO = new Disciplina("Orientação a Objeto", "OO123", 60);
        Disciplina IAL = new Disciplina("Introdução a Álgebra", "IAL123", 45);
        
        System.out.println("\n=== Teste Disciplinas ===");
        System.out.println(OO);
        System.out.println(IAL);
    }
    
    private static void testeTurma() {
        Disciplina OO = new Disciplina("Orientação a Objeto", "OO123", 60);
        AlunoNormal aluno = new AlunoNormal("Gabriela de Paula Nascimento",
                "123.456.789-00", "232002717", "Engenharia de Software");
        
        Turma turma = new Turma(OO, "2023.2", "Sala 101", "Dr. Carlos");
        turma.adicionarAluno(aluno);
        
        System.out.println("\n=== Teste Turma ===");
        System.out.println(turma);
        turma.listarAlunosMatriculados();
    }
    
    private static void testeAvaliacao() {
        Avaliacao prova1 = new Avaliacao("P1", 5.5, "Conteúdo das Aulas 1-6");
        System.out.println("\n=== Teste Avaliação ===");
        System.out.println(prova1);
    }
    
    private static void testeFrequencia() {
        Frequencia frequenciaAluno = new Frequencia();
        
        frequenciaAluno.registrarPresenca(LocalDate.now().minusDays(2));
        frequenciaAluno.registrarPresenca(LocalDate.now().minusDays(1));

        System.out.println("\n=== Teste de Frequência ===");
        System.out.println("Percentual de presença: " +
                frequenciaAluno.calcularPorcentagemPresenca(5) + "%");
    }
}
