package model;

import java.util.ArrayList;

import code.Usuario;

public class ColecaoUsuario {
	
	private ArrayList<Usuario> usuarios = new ArrayList<>();

	public boolean acessar(int cpf, int senha) {
		for (Usuario u : usuarios) {
			if (u.getCpf() == cpf && u.getSenha() == senha) return true;
		}
		return false;
	}

	public Usuario getUsuario(int idUsuario) {
		return null;
	}

	public ArrayList lerTodos() {
		return null;
	}

	public Usuario setUsuario(Object informacoes) {
		return null;
	}

	public Usuario alterar() {
		return null;
	}

	public Usuario filtrarLista(int cpf, int tipo, String nome) {
		return null;
	}

	public void adicionar(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void remove(Usuario usuario) {

	}

}
