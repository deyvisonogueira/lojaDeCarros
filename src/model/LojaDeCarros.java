package model;

import java.util.ArrayList;
import java.util.List;

public class LojaDeCarros {

    private ArrayList<Cliente> clientes = new ArrayList<>(); // ok
    private ArrayList<Funcionario> funcionarios = new ArrayList<>(); //ok
    private ArrayList<Fornecedor> fornecedores = new ArrayList<>(); //ok
    private ArrayList<Pessoa> pessoas = new ArrayList<>(); // ok
    private ArrayList<Vendas> vendas = new ArrayList<>(); // ok
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    private ArrayList<Carro> carros = new ArrayList<>(); // ok
    private ArrayList<Motocicleta> motos = new ArrayList<>(); // ok
    private ArrayList<MotoEletrica> motosEletricas = new ArrayList<>(); // ok
    private ArrayList<CarroEletrico> carrosEletricos = new ArrayList<>(); // ok
    
    // ListClientes
    public void adicionaCliente (Cliente cli) {
        this.clientes.add(cli);
    }

    public List<Cliente> pesquisaCliente (String nome) {
        List<Cliente> pesquisaClientes = new ArrayList<Cliente>();
        for (Cliente cli : clientes) { // Percorre todas as posições do Array
        if (cli.getNome().equalsIgnoreCase(nome)) {
            pesquisaClientes.add(cli);
            }
        }
        return pesquisaClientes;
    }

    // ListFuncionario
    public void adicionaFuncionario (Funcionario fun) {
        this.funcionarios.add(fun);
    }

    public List<Funcionario> pesquisaFuncionario (String nome) {
        List<Funcionario> pesquisaFuncionarios = new ArrayList<Funcionario>();
        for (Funcionario fun : funcionarios) { // Percorre todas as posições do Array
        if (fun.getNome().equalsIgnoreCase(nome)) {
            pesquisaFuncionarios.add(fun);
            }
        }
        return pesquisaFuncionarios;
    }

    // ListFornecedor
    public void adicionaForncedor (Fornecedor forne) {
        this.fornecedores.add(forne);
    }

    public List<Fornecedor> pesquisaFornecedor (String nome) {
        List<Fornecedor> pesquisaFornecedores = new ArrayList<Fornecedor>();
        for (Fornecedor forne : fornecedores) { // Percorre todas as posições do Array
        if (forne.getNome().equalsIgnoreCase(nome)) {
            pesquisaFornecedores.add(forne);
            }
        }
        return pesquisaFornecedores;
    }
    
    // ListPessoas
    public void adicionaPessoa (Pessoa p) {
        this.pessoas.add(p);
    }

    public List<Pessoa> pesquisaPessoa (String nome) {
        List<Pessoa> pesquisaPessoas = new ArrayList<Pessoa>();
        for (Pessoa p : pessoas) { // Percorre todas as posições do Array
        if (p.getNome().equalsIgnoreCase(nome)) {
            pesquisaPessoas.add(p);
            }
        }
        return pesquisaPessoas;
    }

    //ListVendas
    public void adicionaVenda (Vendas venda) {
        this.vendas.add(venda);
    }

    public List<Vendas> pesquisaVenda (int numero) {
        List<Vendas> pesquisaVendas = new ArrayList<Vendas>();
        for (Vendas venda : vendas) { // Percorre todas as posições do Array
        if (venda.getId() == numero) {
            pesquisaVendas.add(venda);
            }
        }
        return pesquisaVendas;
    }

    //ListVeiculo
    public void adicionaVeiculo (Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public List<Veiculo> pesquisaVeiculo (String modelo) {
        List<Veiculo> pesquisaVeiculos = new ArrayList<Veiculo>();
        for (Veiculo veiculo : veiculos) { // Percorre todas as posições do Array
        if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
            pesquisaVeiculos.add(veiculo);
            }
        }
        return pesquisaVeiculos;
    }   

    //ListMotocicletaEletrica
    public void adicionaMotoEletrica (MotoEletrica motoE) {
        this.motosEletricas.add(motoE);
    }

    public List<MotoEletrica> pesquisaMotoEletrica (String modelo) {
        List<MotoEletrica> pesquisaMotosEletrica = new ArrayList<MotoEletrica>();
        for (MotoEletrica motoE : motosEletricas) { // Percorre todas as posições do Array
        if (motoE.getModelo().equalsIgnoreCase(modelo)) {
            pesquisaMotosEletrica.add(motoE);
            }
        }
        return pesquisaMotosEletrica;
    }

    //ListMotocicleta
    public void adicionaMotocicleta (Motocicleta moto) {
        this.motos.add(moto);
    }

    public List<Motocicleta> pesquisaMoto (String modelo) {
        List<Motocicleta> pesquisaMotos = new ArrayList<Motocicleta>();
        for (Motocicleta moto : motos) { // Percorre todas as posições do Array
        if (moto.getModelo().equalsIgnoreCase(modelo)) {
            pesquisaMotos.add(moto);
            }
        }
        return pesquisaMotos;
    }

    //ListCarro
    public void adicionaCarro (Carro car) {
        this.carros.add(car);
    }

    public List<Carro> pesquisaCarro (String modelo) {
        List<Carro> pesquisaCarros = new ArrayList<Carro>();
        for (Carro car : carros) { // Percorre todas as posições do Array
        if (car.getModelo().equalsIgnoreCase(modelo)) {
            pesquisaCarros.add(car);
            }
        }
        return pesquisaCarros;
    }

    //ListCarroEletrico
    public void adicionaCarroEletrico (CarroEletrico carroE) {
        this.carrosEletricos.add(carroE);
    }

    public List<CarroEletrico> pesquisaCarroEletrico (String modelo) {
        List<CarroEletrico> pesquisaCarrosEletrico = new ArrayList<CarroEletrico>();
        for (CarroEletrico carroE : carrosEletricos) { // Percorre todas as posições do Array
        if (carroE.getModelo().equalsIgnoreCase(modelo)) {
            pesquisaCarrosEletrico.add(carroE);
            }
        }
        return pesquisaCarrosEletrico;
    }    
}
