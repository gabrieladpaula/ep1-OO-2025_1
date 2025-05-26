package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
<<<<<<< HEAD
    private String matricula;
    private List<Disciplina> disciplinasMatriculadas = new ArrayList<>();
    
    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }

    public void removerDisciplinas(Disciplina disciplina) {
        disciplinasMatriculadas.remove(disciplina);
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public boolean matricularDisciplina(Disciplina disciplina) {
    	if (!disciplinasMatriculadas.contains(disciplina)) {
    		disciplinasMatriculadas.add(disciplina);
    		return true;
    	}
    	return false;
        
    }

    @Override
    public String toString() {
        return String.format("%s Matrícula: %s Disciplinas Matriculadas: %s",
                super.toString(), matricula, disciplinasMatriculadas);	      
    }
}
=======
	private String matricula;
	private List<String> disciplinasMatriculadas = new ArrayList<>();
	
	public Aluno (String nome, String cpf, String matricula) {
		super(nome, cpf);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void adicionarDisciplina(String disciplina) {
		disciplinasMatriculadas.add(disciplina);
	}
	
	public void removerDisciplinas(String disciplina) {
		disciplinasMatriculadas.remove(disciplina);
	}
	
	public List<String> getDisciplinasMatriculadas() {
		return disciplinasMatriculadas;
		
	}
	
	public boolean matricularDisciplina(String disciplina) {
		adicionarDisciplina(disciplina);
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s Matrícula: %s Disciplinas Matriculadas: %s",
				super.toString(), matricula, disciplinasMatriculadas);	      
	}
}
>>>>>>> e38209330ede1e47b811d37231029e8ebd0163fa
