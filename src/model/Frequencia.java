package model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Frequencia {
	private Set<LocalDate> datasPresenca;
	
	public Frequencia() {
		this.datasPresenca = new HashSet<>();
	}
	
	public void registrarPresenca(LocalDate data) {
		if (data == null) {
			throw new IllegalArgumentException("A data não pode ser nula.");
		}
		if (data.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Não é possivel registrar presença para uma data futura.");
		}
		datasPresenca.add(data);
	}
	
	public double calcularPorcentagemPresenca(int totalAulas) {
		if (totalAulas <= 0) {
			throw new IllegalArgumentException("O total de aulas deve ser maior que zero.");
		}
		return (double) datasPresenca.size() / totalAulas *100;
	}
	
	public Set<LocalDate> getDatasPresenca() {
		return new HashSet<>(datasPresenca);
	}
	
	@Override
	public String toString() {
		return "Frequências registradas: " + datasPresenca;
	}

}
