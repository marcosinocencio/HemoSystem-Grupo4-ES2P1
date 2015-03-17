package code;

import java.util.Date;

import control.ControladorDeBolsa;
import control.ControladorDeDoacao;
import control.ControladorDeDoador;
import control.ControladorDeExames;
import control.ControladorDeUsuario;

public class HemoSystem {

	private ControladorDeBolsa bolsaCtrl = new ControladorDeBolsa();
	private ControladorDeDoacao doacoCtrl = new ControladorDeDoacao();
	private ControladorDeDoador doadorCtrl = new ControladorDeDoador();
	private ControladorDeExames exameCtrl = new ControladorDeExames();
	private ControladorDeUsuario usuarioCtrl = new ControladorDeUsuario();
	
	public void AcessarSistema() {
		usuarioCtrl.entrarDados(cpf, senha);
	}

	public void pesquisarBolsa() {
		
	}

	public void pesquisaUsuario() {

	}

	public void pesquisarDoacaoAtual() {

	}

	public void registrarBolsa() {
		bolsaCtrl.informarDadosSanguineos(
			tipoSanguineo,
			fatorRH,
			data,
			horarioColeta,
			quantidadeSangue,
			disponibilidade,
			removidoPor,
			destino,
			motivo
		);
	}

	public void registrarDoador() {
		doadorCtrl.entrarDados(
				codDoador,
				nomeCandidato,
				nomeMae,
				nomePai,
				sexo,
				estadoCivil,
				dataDeNascimento,
				nacionalidade,
				tipoDocumento,
				numeroDocumento,
				uf,
				ruaEndereco,
				numEndereco,
				municipioEndereco,
				compEndereco,
				bairroEndereco,
				ufEndereco,
				cepEndereco,
				telefone,
				profissao,
				escolaridade
		);
	}

	public void registrarDoacao() {
		Doador doador = doadorCtrl.getDoador(nome, dataNascimento, numDoc);
	}

	public void registrarUsuario() {
		usuarioCtrl.entrarDados(nome, idade, sexo, CPF, tipoUsuario, email, senha);
	}

	public void visualizarUltimaDoacao() {
		Doador doador = doadorCtrl.getDoador(nome, dataNascimento, numDoc);
	}

}
