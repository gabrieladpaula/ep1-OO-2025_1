package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
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