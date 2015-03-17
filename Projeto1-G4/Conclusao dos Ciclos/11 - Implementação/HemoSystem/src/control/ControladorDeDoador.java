package control;

import java.util.Date;

import model.ColecaoDoador;
import code.Doacao;
import code.Doador;

public class ControladorDeDoador {
	
	private ColecaoDoador doadores = new ColecaoDoador();

	public Doador getDoador(String nome, Date dataNascimento, int numDoc) {
		Doador doador = doadores.getDoador(nome, dataNascimento, numDoc);
		
		ControladorDeDoacao doacaoCtrl = new ControladorDeDoacao();		
		
		Doacao doacao = doacaoCtrl.criarDoacao();
		doacaoCtrl.adicionar(doacao);
		
		//WAT
		doacaoCtrl.mostrarInformacoesUltimaDoacao(doador);
		
		return doador;
	}

	public void entrarDados(String codDoador,String nomeCandidato,String nomeMae,String nomePai,char sexo,char estadoCivil,Date dataDeNascimento,String nacionalidade,String tipoDocumento,String numeroDocumento,String uf,String ruaEndereco,int numEndereco,String municipioEndereco,String compEndereco,String bairroEndereco,String ufEndereco,int cepEndereco,int telefone,String profissao,String escolaridade) {
		Doador doador = new Doador(
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
		doadores.adicionar(doador);
	}

}
