package control;

import java.util.ArrayList;

import code.Doacao;
import code.Doador;

public class ControladorDeDoacao {
	
	private ArrayList<Doacao> doacoes = new ArrayList<>();

	public Doacao informarDoacao(int codigoDoacao) {
		return null;
	}

	public void cancelarDoacao(Doacao doacao) {

	}

	public void dadosDoacao(Doador doador, Object infomacoes) {

	}

	public void mostrarInformacoesUltimaDoacao(Doador doador) {
		Doacao doacao = null;
		for (Doacao d : doacoes) {
			if (d.getCodDoador() == doador.getCodDoador()) {
				doacao = d;
				break;
			}
		}
		
		if (doacao != null) System.out.println(doacao.toString());
	}

}
