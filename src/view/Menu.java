package view;

import java.util.Scanner;

import model.*;

public class Menu {
    // Atributos para Pessoas

    private String nome, cpf, endereco, telefone; // Pessoa
    private String dataNascimento; // Cliente
    private int idade; // Cliente
    private String cargo; // Funcionario
    private String dataAdimissao; // Funcionario
    private boolean ativo; // Funcionario
    private double salario; // Funcionario
    private String empresa; // Fornecedor
    private String cnpj;

    // Atributos para Veiculos
    private String modelo, chassi, placa, cor, ano; // Veiculo
    private double valor; // Veiculo
    private int numPortas; // Carro
    private boolean partidaEletrica; // Motocicleta
    private String autonomia; // Carro e moto eletrica

    // Atributos para Vendas
    private int id;
    private String funcVenda; //
    private boolean pagamentoAprazo;
    private double meses;

    private Scanner leitor;

    public Menu() {
        leitor = new Scanner(System.in);
    }

    // Menu para pessoas
    private void informacoesPessoa() {
        System.out.println("Qual o nome? ");
        this.nome = leitor.nextLine();
        System.out.println("Qual o CPF? ");
        this.cpf = leitor.nextLine();
        System.out.println("Qual o endereco? ");
        this.endereco = leitor.nextLine();
        System.out.println("Qual o telefone? ");
        this.telefone = leitor.nextLine();
    }

    public Cliente dadosCliente() {
        informacoesPessoa();

        System.out.println("Data nascimento: ");
        this.dataNascimento = leitor.nextLine();
        System.out.println("Idade: ");
        this.idade = leitor.nextInt();

        Cliente clien = new Cliente(nome, cpf, endereco, telefone, dataNascimento, idade);
        return clien;
    }

    public Funcionario dadosFuncionario() {
        informacoesPessoa();

        System.out.println("Cargo: ");
        this.cargo = leitor.nextLine();
        System.out.println("Data adimissão: ");
        this.dataAdimissao = leitor.nextLine();
        System.out.println("Está ativo? (sim ou não)");
        String respostaAtivo = leitor.nextLine();
        if (respostaAtivo.equalsIgnoreCase("sim")) {
            this.ativo = true;
        } else {
            this.ativo = false;
        }
        System.out.println("Salario: ");
        this.salario = leitor.nextDouble();

        Funcionario func = new Funcionario(nome, cpf, endereco, telefone, cargo, dataAdimissao, ativo, salario);
        return func;
    }

    public Fornecedor dadosFornecedor() {
        informacoesPessoa();
        System.out.println("Empresa: ");
        this.empresa = leitor.nextLine();
        System.out.println("CNPJ da empresa: ");
        this.cnpj = leitor.nextLine();

        Fornecedor forn = new Fornecedor(nome, cpf, endereco, telefone, empresa, cnpj);
        return forn;
    }

    // Menu para veiculos
    private void informacoesVeiculo() {
        System.out.println("Qual o modelo? ");
        this.modelo = leitor.nextLine();
        System.out.println("Qual o chassi? ");
        this.chassi = leitor.nextLine();
        System.out.println("Qual a placa? ");
        this.placa = leitor.nextLine();
        System.out.println("Qual a cor? ");
        this.cor = leitor.nextLine();
        System.out.println("Qual o ano? ");
        this.ano = leitor.nextLine();
        System.out.println("Qual o valor? ");
        this.valor = leitor.nextDouble();
    }

    public Carro dadosCarro() {
        informacoesVeiculo();
        System.out.println("Informe o numero de portas do carro: ");
        this.numPortas = leitor.nextInt();

        Carro c = new Carro(modelo, ano, cor, placa, chassi, numPortas, valor);
        System.out.println("Valor calculado: " + c.calculaValor());

        return c;
    }

    public CarroEletrico dadosCarroEletrico() {
        dadosCarro();
        System.out.println("Qual a autonomia do Carro (Tempo de Bateria enquanto usado na energia)");
        this.autonomia = leitor.nextLine();

        CarroEletrico ce = new CarroEletrico(modelo, ano, cor, placa, chassi, numPortas, valor, autonomia);
        System.out.println("Valor calculado: " + ce.calculaValor());

        return ce;
    }

    public Motocicleta dadosMoto() {
        informacoesVeiculo();
        System.out.println("Tem partida eletrica? (sim ou não)");
        String respostaPartida = leitor.nextLine();
        if (respostaPartida.equalsIgnoreCase("sim")) {
            this.partidaEletrica = true;
        } else {
            this.partidaEletrica = false;
        }

        Motocicleta m = new Motocicleta(modelo, ano, cor, placa, chassi, valor, partidaEletrica);
        System.out.println("Valor Calculado: " + m.calculaValor());

        return m;
    }

    public MotoEletrica dadosMotoEletrica() {
        dadosMoto();
        System.out.println("Qual a autonomia da Moto (Tempo de Bateria enquanto usado na energia)");
        this.autonomia = leitor.nextLine();

        MotoEletrica me = new MotoEletrica(modelo, ano, cor, placa, chassi, valor, partidaEletrica, autonomia);
        System.out.println("Valor calculadoo: " + me.calculaValor());

        return me;
    }

    public Vendas informacoesVenda() {
        System.out.println("Qual o modelo? ");
        this.modelo = leitor.nextLine();
        System.out.println("Qual o chassi? ");
        this.chassi = leitor.nextLine();
        System.out.println("Qual a placa? ");
        this.placa = leitor.nextLine();
        System.out.println("Qual a cor? ");
        this.cor = leitor.nextLine();
        System.out.println("Qual o ano? ");
        this.ano = leitor.nextLine();
        System.out.println("Qual o valor? ");
        this.valor = leitor.nextDouble();
        System.out.println("Funcionário responsável pela venda: ");
        this.nome = leitor.nextLine();
        System.out.println("Pagamento a prazo ? ");
        String resposta = leitor.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            this.pagamentoAprazo = true;
            System.out.println("Quantidade de meses ? ");
            this.meses = leitor.nextInt();
        } else {
            this.pagamentoAprazo = false;
        }
        Vendas v = new Vendas(nome, pagamentoAprazo, id, modelo, chassi, placa, cor, ano, valor);
        System.out.println("Valor calculado: " + v.calculaValor());

        return v;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncVenda() {
        return funcVenda;
    }

    public void setFuncVenda(String funcVenda) {
        this.funcVenda = funcVenda;
    }

    public boolean isPagamentoAprazo() {
        return pagamentoAprazo;
    }

    public void setPagamentoAprazo(boolean pagamentoAprazo) {
        this.pagamentoAprazo = pagamentoAprazo;
    }

    public double getMeses() {
        return meses;
    }

    public void setMeses(double meses) {
        this.meses = meses;
    }

    public Scanner getLeitor() {
        return leitor;
    }

    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }

}
