package model;

import java.util.ArrayList;
import java.util.Date;

import code.Doador;

public class ColecaoDoador {
	
	private ArrayList<Doador> doadores = new ArrayList<>();

	public Doador getDoador(String nome, Date dataNascimento, int numDoc) {
		for (Doador d : doadores) {
			if (d.getNomeCandidato().equals(nome) && d.getDataDeNascimento().equals(dataNascimento) || d.getNumeroDocumento() == numDoc) return d;
		}
		return null;
	}

	public void adicionar(Doador doador) {

	}

}
