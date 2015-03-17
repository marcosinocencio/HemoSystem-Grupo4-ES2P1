package code;

import java.util.Date;

public class Doador {

	public Doador(String codDoador, String nomeCandidato, String nomeMae,String nomePai, char sexo, char estadoCivil, Date dataDeNascimento,String nacionalidade, String tipoDocumento, String numeroDocumento,String uf, String ruaEndereco, int numEndereco,String municipioEndereco, String compEndereco,String bairroEndereco, String ufEndereco, int cepEndereco,int telefone, String profissao, String escolaridade) {
		this.codDoador = codDoador;
		this.nomeCandidato = nomeCandidato;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.dataDeNascimento = dataDeNascimento;
		this.nacionalidade = nacionalidade;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.uf = uf;
		this.ruaEndereco = ruaEndereco;
		this.numEndereco = numEndereco;
		this.municipioEndereco = municipioEndereco;
		this.compEndereco = compEndereco;
		this.bairroEndereco = bairroEndereco;
		this.ufEndereco = ufEndereco;
		this.cepEndereco = cepEndereco;
		this.telefone = telefone;
		this.profissao = profissao;
		this.escolaridade = escolaridade;
	}

	private String codDoador;
	private String nomeCandidato;
	private String nomeMae;
	private String nomePai;
	private char sexo;
	private char estadoCivil;
	private Date dataDeNascimento;
	private String nacionalidade;
	private String tipoDocumento;
	private String numeroDocumento;
	private String uf;
	private String ruaEndereco;
	private int numEndereco;
	private String municipioEndereco;
	private String compEndereco;
	private String bairroEndereco;
	private String ufEndereco;
	private int cepEndereco;
	private int telefone;
	private String profissao;
	private String escolaridade;

	public Doador criarDoador(Object informaoees) {
		return null;
	}

	public String getCodDoador() {
		return codDoador;
	}

	public void setCodDoador(String codDoador) {
		this.codDoador = codDoador;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getRuaEndereco() {
		return ruaEndereco;
	}

	public void setRuaEndereco(String ruaEndereco) {
		this.ruaEndereco = ruaEndereco;
	}

	public int getNumEndereco() {
		return numEndereco;
	}

	public void setNumEndereco(int numEndereco) {
		this.numEndereco = numEndereco;
	}

	public String getMunicipioEndereco() {
		return municipioEndereco;
	}

	public void setMunicipioEndereco(String municipioEndereco) {
		this.municipioEndereco = municipioEndereco;
	}

	public String getCompEndereco() {
		return compEndereco;
	}

	public void setCompEndereco(String compEndereco) {
		this.compEndereco = compEndereco;
	}

	public String getBairroEndereco() {
		return bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}

	public String getUfEndereco() {
		return ufEndereco;
	}

	public void setUfEndereco(String ufEndereco) {
		this.ufEndereco = ufEndereco;
	}

	public int getCepEndereco() {
		return cepEndereco;
	}

	public void setCepEndereco(int cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

}