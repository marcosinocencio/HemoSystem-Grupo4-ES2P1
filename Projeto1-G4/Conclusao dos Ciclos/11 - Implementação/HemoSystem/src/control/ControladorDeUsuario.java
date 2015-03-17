package control;

import java.util.ArrayList;

import model.ColecaoUsuario;
import code.Usuario;

public class ControladorDeUsuario {
	
	private ColecaoUsuario usuarios = new ColecaoUsuario();

	public void entrarDados(int cpf, int senha) {
		boolean acesso = usuarios.acessar(cpf, senha);
		Usuario usuario = usuarios.getUsuario(idUsuario);
	}

	public ArrayList getUsuarios() {
		return null;
	}

	public void filtrarLista(int cpf, int tipo, String nome) {

	}

	public void alterarUsuario(Object informacoes) {

	}

	public void indicarUsuarioPrivilegio(int tipoUsuario) {

	}

	public void entrarDados(String nome, int idade, int sexo, int CPF, int tipoUsuario, String email, String senha) {
		Usuario usuario = new Usuario(cpf, senha);
		usuarios.adicionar(usuario);
	}

	public void removerUsuario(Usuario usuario) {

	}

}
