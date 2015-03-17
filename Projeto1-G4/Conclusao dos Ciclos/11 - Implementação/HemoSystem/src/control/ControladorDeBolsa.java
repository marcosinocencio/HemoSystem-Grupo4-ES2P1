package control;

import java.util.ArrayList;
import java.util.Date;

import model.ColecaoBolsaDeSangue;
import code.Bolsa;

public class ControladorDeBolsa {
	
	private ColecaoBolsaDeSangue bolsas = new ColecaoBolsaDeSangue();

	public ArrayList pequisarBolsa() {
		return null;
	}

	public ArrayList ordenarBolsa(int indiceDeOrdenacao) {
		return null;
	}

	public void alterarBolsa(int disponivel, String motivo, String quemTirou, String destino) {

	}

	public void confirmarAlteracao() {

	}

	public void informarDadosSanguineos(String tipoSanguineo, char fatorRH, Date data, int horarioColeta, int quantidadeSangue, boolean disponibilidade, String removidoPor, String destino, String motivo) {
		Bolsa bolsa = new Bolsa(
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
		
		bolsas.adicionar(bolsa);
	}

}
