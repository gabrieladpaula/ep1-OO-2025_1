package model;

public class Disciplina {
	private String nome;
	private String codigo;
	private int cargaHoraria;
	
	public Disciplina(String nome, String codigo, 
int cargaHoraria) {
		if (nome== null || nome.isEmpty()) {
			throw new IllegalArgumentException ("O nome da discplina não pode ser vazio.");
		}
		if (codigo == null || codigo.isEmpty()) {
			throw new IllegalArgumentException("O código da disciplina não pode ser vazio.");			
		}
		if (cargaHoraria <= 0) {
			throw new IllegalArgumentException("A carga horária deve ser maior que zero.");
		}
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	@Override
	public String toString() {
		return String.format("Disciplina: %s | Código: %s | Carga Horaria: %d horas)", nome, codigo, cargaHoraria);
	}

}
