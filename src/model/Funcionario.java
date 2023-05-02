package model;

public class Funcionario extends Pessoa {
    private String cargo;
    private String dataAdimissao; 
    private boolean ativo; 
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, String telefone, String cargo, String dataAdimissao,
            boolean ativo, double salario) {
        super(nome, cpf, endereco, telefone);
        this.cargo = cargo;
        this.dataAdimissao = dataAdimissao;
        this.ativo = ativo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdimissao() {
        return dataAdimissao;
    }

    public void setDataAdimissao(String dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
	public String toString() {
		return "\n Nome: " + this.getNome() + "\n CPF" + getCpf() + "\n Endereço" + this.getEndereco() + "\n Telefone" + this.getTelefone() + "\n Cargo:" + this.cargo + "\n Data de Adimissão" + this.dataAdimissao + "\n Ativo? " + this.ativo + "Salario:" + this.salario;
	}

}
