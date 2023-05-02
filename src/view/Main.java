package view;

import java.util.Scanner;
import model.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        int escolherCadastro;
        String nome;
        String modelo;
        int numero;
        boolean continuar = true;

        LojaDeCarros ldc = new LojaDeCarros();
        Menu menu = new Menu();

        while (continuar) {
            System.out.println("-- Digite uma opção --");
            System.out.println("1- Cadastrar uma pessoa");
            System.out.println("2- Pesquisar pessoa");
            System.out.println("3- Cadastrar um veiculo");
            System.out.println("4- Pesquisar veiculo");
            System.out.println("5- Cadastrar uma venda");
            System.out.println("6- Pesquisar venda");
            System.out.println("7- Mostrar todos os cadastros de tudo");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("1- Cliente");
                    System.out.println("2- Funcionario");
                    System.out.println("3- Fornecedor");
                    escolherCadastro = scan.nextInt();

                    if (escolherCadastro == 1) {
                        ldc.adicionaCliente(menu.dadosCliente());
                        System.out.println("Cliente cadastrado com sucesso!");
                    } else if (escolherCadastro == 2) {
                        ldc.adicionaFuncionario(menu.dadosFuncionario());
                        System.out.println("Funcionario cadastrado com sucesso!");
                    } else if (escolherCadastro == 3) {
                        ldc.adicionaForncedor(menu.dadosFornecedor());
                        System.out.println("Pessoa cadastrado com sucesso!");
                    } else {
                        System.out.println("Opção invalida!");
                    }
                    break;
                }

                case 2: {
                    System.out.println("1- Cliente");
                    System.out.println("2- Funcionario");
                    System.out.println("3- Fornecedor");
                    escolherCadastro = scan.nextInt();

                    if (escolherCadastro == 1) {
                        System.out.println("Digite o nome do Cliente que você deseja pesquisar:");
                        nome = scan.next();
                        System.out.println(ldc.pesquisaCliente(nome));
                    } else if (escolherCadastro == 2) {
                        System.out.println("Digite o nome do Funcionario que você deseja pesquisar:");
                        nome = scan.next();
                        System.out.println(ldc.pesquisaFuncionario(nome));
                    } else if (escolherCadastro == 3) {
                        System.out.println("Digite o nome do Fornecedor que você deseja pesquisar:");
                        nome = scan.next();
                        System.out.println(ldc.pesquisaFornecedor(nome));
                    } else {
                        System.out.println("Opção invalida");
                    }
                    break;
                }

                case 3: {
                    System.out.println("1- Carro");
                    System.out.println("2- Motocicleta");
                    System.out.println("3- Carro Eletrico");
                    System.out.println("4- Moto Eletrica");
                    escolherCadastro = scan.nextInt();

                    if (escolherCadastro == 1) {
                        ldc.adicionaCarro(menu.dadosCarro());
                        System.out.println("Carro cadastrado com sucesso!");
                    } else if (escolherCadastro == 2) {
                        ldc.adicionaMotocicleta(menu.dadosMoto());
                        System.out.println("Moto cadastrada com sucesso!");
                    } else if (escolherCadastro == 3) {
                        ldc.adicionaCarroEletrico(menu.dadosCarroEletrico());
                        System.out.println("Carro Eletrico cadastrado com sucesso!");
                    } else if (escolherCadastro == 4) {
                        ldc.adicionaMotoEletrica(menu.dadosMotoEletrica());
                        System.out.println("Moto Eletrica cadastrada com sucesso!");
                    } else {
                        System.out.println("Opção invalida!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("1- Carro");
                    System.out.println("2- Motocicleta");
                    System.out.println("3- Carro Eletrico");
                    System.out.println("4- Moto Eletrica");
                    escolherCadastro = scan.nextInt();

                    if (escolherCadastro == 1) {
                        System.out.println("Digite o nome do Carro que você deseja pesquisar:");
                        modelo = scan.next();
                        System.out.println(ldc.pesquisaCarro(modelo));
                    } else if (escolherCadastro == 2) {
                        System.out.println("Digite o nome da Motocicleta que você deseja pesquisar:");
                        modelo = scan.next();
                        System.out.println(ldc.pesquisaMoto(modelo));
                    } else if (escolherCadastro == 3) {
                        System.out.println("Digite o nome do Carro Eletrico que você deseja pesquisar:");
                        modelo = scan.next();
                        System.out.println(ldc.pesquisaFornecedor(modelo));
                    } else if (escolherCadastro == 4) {
                        System.out.println("Digite o nome da Moto Eletrico que você deseja pesquisar:");
                        modelo = scan.next();
                        System.out.println(ldc.pesquisaFornecedor(modelo));
                    } else {
                        System.out.println("Opção invalida");
                    }
                    break;
                }
                case 5: {
                    if (opcao == 5) {
                        ldc.adicionaVenda(menu.informacoesVenda());
                    } else {
                        System.out.println("Parametro errado ou opção invalida!");
                    }
                    break;
                }
                case 6: {
                    if (opcao == 6) {
                        System.out.println("Digite o numero da Venda que você deseja pesquisar:");
                        numero = scan.nextInt();
                        System.out.println(ldc.pesquisaVenda(numero));
                    } else {
                        System.out.println("Venda não encontrada!");
                    }
                    break;
                }
                case 7: {
                    if (opcao == 7) {
                        System.out.println();
                        System.out.println(ldc.getClass());
                    } else {
                        System.out.println("Opção errada!");
                    }
                    break;
                }
                default: {
                    System.out.println("Opção Invalida");
                }
                System.out.println("Deseja continuar no menu? (S/N)");
                String resposta = scan.next();
                if (resposta.equalsIgnoreCase("N")) {
                    continuar = false;
                }
            }

        }

    }

}
