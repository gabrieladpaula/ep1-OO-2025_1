package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaAcademicoController {
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;
    private List<Turma> turmas;

    public SistemaAcademicoController() {
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public void cadastrarAlunoNormal(String nome, String cpf, String matricula, String curso) {
        if (buscarAlunoPorMatricula(matricula) != null) {
            throw new IllegalArgumentException("Já existe um aluno com a matrícula: " + matricula);
        }
        AlunoNormal aluno = new AlunoNormal(nome, cpf, matricula, curso);
        alunos.add(aluno);
    }

    public void cadastrarAlunoEspecial(String nome, String cpf, String matricula) {
        if (buscarAlunoPorMatricula(matricula) != null) {
            throw new IllegalArgumentException("Já existe um aluno com a matrícula: " + matricula);
        }
        AlunoEspecial aluno = new AlunoEspecial(nome, cpf, matricula);
        alunos.add(aluno);
    }

    public void cadastrarDisciplina(String nome, String codigo, int cargaHoraria) {
        if (buscarDisciplinaPorCodigo(codigo) != null) {
            throw new IllegalArgumentException("Já existe uma disciplina com o código: " + codigo);
        }
        Disciplina disciplina = new Disciplina(nome, codigo, cargaHoraria);
        disciplinas.add(disciplina);
    }

    public void criarTurma(String codigoDisciplina, String semestre, String sala, String professor) {
        Disciplina disciplina = buscarDisciplinaPorCodigo(codigoDisciplina);
        if (disciplina != null) {
            Turma turma = new Turma(disciplina, semestre, sala, professor);
            turmas.add(turma);
        } else {
            throw new IllegalArgumentException("Disciplina não encontrada para o código: " + codigoDisciplina);
        }
    }

    public boolean matricularAluno(String matricula, String codigoDisciplina) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        Disciplina disciplina = buscarDisciplinaPorCodigo(codigoDisciplina);

        if (aluno == null) {
            System.out.println("Aluno não encontrado com a matrícula: " + matricula);
            return false;
        }
        if (disciplina == null) {
            System.out.println("Disciplina não encontrada com o código: " + codigoDisciplina);
            return false;
        }

        return aluno.matricularDisciplina(disciplina);
    }

    private Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }

    private Disciplina buscarDisciplinaPorCodigo(String codigo) {
        for (Disciplina d : disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        return null;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}

