package code;

public class Usuario {

	public Usuario(int cpf, String senha) {
		this.cpf = cpf;
		this.senha = senha;
	}

	private int cpf;

	private String senha;

	public Usuario criarUsuario(String nome, int idade, int sexo, int CPF, int tipoUsuario, String email, String senha) {
		return null;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
