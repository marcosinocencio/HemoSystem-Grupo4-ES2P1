package code;

import java.util.Date;

public class Bolsa {

	private String tipoSanguineo;
	private char fatorRH;
	private Date data;
	private int horarioColeta;
	private int quantidadeSangue;
	private boolean disponibilidade;
	private String removidoPor;
	private String destino;
	private String motivo;

	public Bolsa(String tipoSanguineo, char fatorRH, Date data, int horarioColeta, int quantidadeSangue, boolean disponibilidade, String removidoPor, String destino, String motivo) {
		this.tipoSanguineo = tipoSanguineo;
		this.fatorRH = fatorRH;
		this.data = data;
		this.horarioColeta = horarioColeta;
		this.quantidadeSangue = quantidadeSangue;
		this.disponibilidade = disponibilidade;
		this.removidoPor = removidoPor;
		this.destino = destino;
		this.motivo = motivo;
	}

	public Bolsa criarBolsa(Object informac) {
		return null;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public char getFatorRH() {
		return fatorRH;
	}

	public void setFatorRH(char fatorRH) {
		this.fatorRH = fatorRH;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getHorarioColeta() {
		return horarioColeta;
	}

	public void setHorarioColeta(int horarioColeta) {
		this.horarioColeta = horarioColeta;
	}

	public int getQuantidadeSangue() {
		return quantidadeSangue;
	}

	public void setQuantidadeSangue(int quantidadeSangue) {
		this.quantidadeSangue = quantidadeSangue;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getRemovidoPor() {
		return removidoPor;
	}

	public void setRemovidoPor(String removidoPor) {
		this.removidoPor = removidoPor;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	

}
