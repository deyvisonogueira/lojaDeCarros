package model;

//Classe Carro filha de Veiculo
public class Carro extends Veiculo {

    private int numPortas;

    public Carro(String modelo, String ano, String cor, String placa, String chassi, int numPortas, double valor) {
        super(modelo, ano, cor, placa, chassi, valor);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    // metodo polimorfo
    public double calculaValor() {
        return getValor() * 1.1; // pega praço de compra e aumenta 10% para a venda
    }

    @Override
    public String toString() {
        return "/n Modelo: " + this.getModelo() + "\n Ano: " + this.getAno() + "\n Cor: " + this.getCor() + "\n Placa: " + this.getPlaca() + "\n Chassi: " + this.getChassi() + "\n Número de Protas: " + this.getNumPortas() + "\n Valor: " + this.getValor();
    }

}
