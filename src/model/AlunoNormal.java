package model;

public class AlunoNormal extends Aluno {
<<<<<<< HEAD
    private String cursoGraduacao;
    
    public AlunoNormal(String nome, String cpf, String matricula, String cursoGraduacao) {
        super(nome, cpf, matricula);
        this.cursoGraduacao = cursoGraduacao;
    }
    
    public String getCursoGraduacao() {
        return cursoGraduacao;
    }
    
    public void setCursoGraduacao(String cursoGraduacao) {
        this.cursoGraduacao = cursoGraduacao;
    }
    
    @Override
    public boolean matricularDisciplina(String disciplina) {
        if (getDisciplinasMatriculadas().size() < 6) {
            adicionarDisciplina(disciplina);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("%s  Curso: %s", super.toString(), cursoGraduacao);
    }
}
=======
	private String cursoGraduacao;
	
	public AlunoNormal(String nome,String cpf, String matricula, String cursoGraduacao) {
		super(nome, cpf, matricula);
		this.cursoGraduacao = cursoGraduacao;
	}
	
	public String getCursoGraduacao() {
		return cursoGraduacao;
	}
	
	public void setCursoGraduacao(String cursoGraduacao) {
		this.cursoGraduacao = cursoGraduacao;
	}
	
	@Override
	public boolean matricularDisciplina(String disciplina) {
		if (getDisciplinasMatriculadas().size() < 6) {
			adicionarDisciplina(disciplina);
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%s  Curso: %s",
	super.toString(), cursoGraduacao);
	}
	
}
>>>>>>> e38209330ede1e47b811d37231029e8ebd0163fa
