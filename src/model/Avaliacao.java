package model;

public class Avaliacao {
<<<<<<< HEAD
	private String tipo;
	private double nota;
	private String descricao;
	
	 public Avaliacao(String tipo, double nota, String descricao) {
		this.tipo = tipo;
		setNota(nota);
		this.descricao = descricao;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public double getNota() {
		return nota;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setNota(double nota) {
		if (nota < 0 || nota > 10) {
			throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
		}
		this.nota = nota;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
 	
	@Override
	public String toString() {
		return String.format("Avaliação: %s |  Nota: %.2f | Descrição: %s", tipo, nota, descricao);
	}
=======

>>>>>>> e38209330ede1e47b811d37231029e8ebd0163fa
}
