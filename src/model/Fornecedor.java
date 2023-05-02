package model;

public class Fornecedor extends Pessoa{
	private String empresa;
	private String cnpj;

	public Fornecedor(String nome, String cpf, String endereco, String telefone, String empresa, String cnpj) {
		super(nome, cpf, endereco, telefone);
		this.empresa = empresa;
		this.cnpj = cnpj;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		
		return "\n Nome: " + this.getNome()  + "\n CNPJ ou CPF" + getCpf() + "\n Endereço" + this.getEndereco() + "\n Telefone" + this.getTelefone() + "\n Empresa: " + this.empresa + "\n CNPJ da Empresa: " + this.cnpj;
	}
}
	