package model;

public class AlunoEspecial extends Aluno {
<<<<<<< HEAD
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
=======
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
		return String.format("%s  Tipo: Especial",
	super.toString());
	}
	
}
>>>>>>> e38209330ede1e47b811d37231029e8ebd0163fa
