package code;

import java.util.Date;

public class Doacao {

	private String codDoacao;

	private char tipoDoacao;

	private String nomePacienteDoacao;

	private String hospitalPacienteInternado;

	private char procedimento;

	private String responsavel;

	private Date data;

	public Doacao criarDoacao(Doador doador, Object infomaoces) {
		return null;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Doação\n");
		sb.append("Código = " + codDoacao + " \n");
		sb.append("Tipo = " + tipoDoacao + " \n");
		sb.append("Nome do Paciente = " + nomePacienteDoacao+ " \n");
		sb.append("Hospital da Internação = " + hospitalPacienteInternado+ " \n");
		sb.append("Procedimento = " + procedimento + " \n");
		sb.append("Responsável = " + responsavel + " \n");
		sb.append("Data = " + data + " \n");
		
		return sb.toString();
	}
	
	public String getCodDoacao() {
		return codDoacao;
	}

	public void setCodDoacao(String codDoacao) {
		this.codDoacao = codDoacao;
	}

	public char getTipoDoacao() {
		return tipoDoacao;
	}

	public void setTipoDoacao(char tipoDoacao) {
		this.tipoDoacao = tipoDoacao;
	}

	public String getNomePacienteDoacao() {
		return nomePacienteDoacao;
	}

	public void setNomePacienteDoacao(String nomePacienteDoacao) {
		this.nomePacienteDoacao = nomePacienteDoacao;
	}

	public String getHospitalPacienteInternado() {
		return hospitalPacienteInternado;
	}

	public void setHospitalPacienteInternado(String hospitalPacienteInternado) {
		this.hospitalPacienteInternado = hospitalPacienteInternado;
	}

	public char getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(char procedimento) {
		this.procedimento = procedimento;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
