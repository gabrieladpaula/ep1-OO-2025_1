package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private Disciplina disciplina;
	private String semestre;
	private String sala;
	private String professor;
	private List<Aluno> alunosMatriculados;
	
	public Turma(Disciplina disciplina, String semestre, 
String sala, String professor) {
		this.disciplina = disciplina;
		this.semestre = semestre;
		this.sala = sala;
		this.professor = professor;
		this.alunosMatriculados = new ArrayList<>();
	}
	
	public void adicionarAluno(Aluno aluno) {
		if (!alunosMatriculados.contains(aluno)) {
			alunosMatriculados.add(aluno);
		}else {
			System.out.println("Aluno já matriculado.");
		}
	}
    
	public void removerAluno(Aluno aluno) {
		if(alunosMatriculados.remove(aluno)) {
			System.out.println("Aluno removido com sucesso.");
		}else {
			System.out.println("Aluno não encontrado na lista.");
		}
	}
	
	public void listarAlunosMatriculados() {
		if (alunosMatriculados.isEmpty()) {
			System.out.println("Nenhum aluno matriculado.");
			return;
		}
		System.out.println("Alunos matriculados:");
		for (Aluno aluno : alunosMatriculados) {
			System.out.println(aluno);
		}
	}
	
	public List<Aluno> getAlunosMatriculados() {
		return new ArrayList<>(alunosMatriculados);
	}
	
	@Override
	public String toString() {
		return String.format("Turma de %s  Semestre: %s  Sala: %s  Professor: %s",
				disciplina.getNome(), semestre, sala, professor);
	}
}
