package Main;

import model.*;
import java.time.LocalDate;

public class TesteMain {
	public static void main(String [] args) {
		Disciplina matematica = new Disciplina ("Matemática",
	"MAT101", 60);
		Disciplina fisica = new Disciplina ("Física", 
	"FIS102", 45);
		
		AlunoNormal aluno1 = new AlunoNormal ("Gabriela de Paula",
		"12345678900", "232002717", "Engenharia de Software");
		
		Turma turmaMatematica = new Turma(matematica, "2022/1", 
	"Sala 101", "Prof. João Carlos");
		
		turmaMatematica.adicionarAluno(aluno1);
		
		turmaMatematica.removerAluno(aluno1);
		
		System.out.println("--- Alunos Matriculados ---");
		turmaMatematica.listarAlunosMatriculados();
		
		System.out.println("--- Detalhes da Disciplina ---");
		System.out.println(turmaMatematica);
		
		Avaliacao prova = new Avaliacao ("Prova Final", 9.0,
	"Avaliação do semestre");
		
		Frequencia frequencia = new Frequencia();
		frequencia.registrarPresenca(LocalDate.of(2022,  6, 1));
		frequencia.resgistrarPrensenca(LocalDate.of(2022, 6, 3));
	    
		System.out.println("--- Frequência ---");
		System.out.println(frequencia);
		System.out.printf("Porcentagem de presença: %.2f%%\n",
	frequencia.calcularPorcentagemPresenca());
	}
