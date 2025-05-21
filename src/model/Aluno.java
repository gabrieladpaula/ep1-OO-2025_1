package model;

public class Aluno extends Pessoa {
	private String matricula;
	private String cursoGraduacao;

	public Aluno(String nome, String cpf, String matricula, String cursoGraduacao) {
		super(nome, cpf);
		this.matricula = matricula;
		this.cursoGraduacao = cursoGraduacao;
		}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCursoGraduacao() {
		return cursoGraduacao;
	}
	
		
	public void setCursoGraduacao(String cursoGraduacao) { 
		this.cursoGraduacao = cursoGraduacao;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"Matrícula:" + matricula +
				"Curso:" + cursoGraduacao; 
	}

}
