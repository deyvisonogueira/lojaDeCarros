package model;

//Classe Vendas extende Veiculo
public class Vendas extends Veiculo {

    private static int idCount = 0; //Variável estática para contar o número de vendas
    private int id;
    private String funcVenda; //Referencia entre classes
    private boolean pagamentoAprazo;
    private double calculaPagamento;

    public Vendas(String funcVenda, boolean pagamentoAprazo, double calculaPagamento, String modelo, String ano, String cor, String placa, String chassi, double valor) {
        super(modelo, ano, cor, placa, chassi, valor);
        idCount++; //Incrementa o contador de vendas
        this.id = idCount; //Atribui o valor do contador ao ID da venda atual
        this.funcVenda = funcVenda;
        this.calculaPagamento = calculaPagamento;
        // this.funcVenda.setNome(funcVenda.getNome());
    }

    public double getCalculaPagamento() {
        return calculaPagamento;
    }

    public void setCalculaPagamento(double calculaPagamento) {
        this.calculaPagamento = calculaPagamento;
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

    public double calculaValor() {
        double calculaPagamento = valor;

        if (pagamentoAprazo == true) {
            calculaPagamento = calculaPagamento * 1.05; //acréssimo de 5% no valor original
            double juros = 0.01;
            int meses = 0;

            for (int i = 1; i <= meses; i++) {
                calculaPagamento += calculaPagamento * juros; //acréssimo de juros de 1% a cada mes
            }
        }

        return calculaPagamento;
    }

    @Override
    public String toString() {
        return "\n Numero da Venda: " + this.id + "\n Funcionario: " + this.funcVenda + "\n Pagamento a Prazo: " + pagamentoAprazo + "\n Modelo: " + getModelo() + "\n Ano: " + this.getAno() + "\n Cor: " + this.getCor() + "\n Placa: " + this.getPlaca() + "\n Chassi: " + this.getChassi() + "\n Valor: " + this.valor;
    }

}
