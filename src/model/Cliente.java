package model;

public class Cliente extends Pessoa {
	private String dataNascimento;
	private int idade;

	public Cliente(String nome, String cpf, String endereco, String telefone, String dataNascimento, int idade) {
		super(nome, cpf, endereco, telefone);
		this.dataNascimento = dataNascimento;
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "\n Nome: " + this.getNome() + "\n CNPJ ou CPF: " + getCpf() + "\n Endereço: " + this.getEndereco() + "\n Telefone: " + this.getTelefone() + "\n Data de Nascimento: " + this.dataNascimento + "\n Idade: " + this.idade;
	}
}


