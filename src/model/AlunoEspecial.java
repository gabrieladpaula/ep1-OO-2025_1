package model;

public class AlunoEspecial extends Aluno {
    public AlunoEspecial(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }
    
    @Override
    public boolean matricularDisciplina(String disciplina) {
        if (getDisciplinasMatriculadas().size() < 2) {
            adicionarDisciplina(disciplina);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("%s  Tipo: Especial", super.toString());
    }
}