package model;

//Classe Motocicleta filha de Veiculo
public class Motocicleta extends Veiculo {
    private boolean partidaEletrica;

    public Motocicleta(String modelo, String ano, String cor, String placa, String chassi, double valor,
            boolean partidaEletrica) {
        super(modelo, ano, cor, placa, chassi, valor);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }     

    public double calculaValor() {
        return getValor() * 1.1; // pega praço de compra e aumenta 10% para a venda
    }

    @Override
    public String toString() {
        return "/n Modelo: " + this.getModelo() + "\n Ano: " + this.getAno() + "\n Cor: " + this.getCor() + "\n Placa: " + this.getPlaca() + "\n Chassi: " + this.getChassi() + "\n Partida Eletrica: " + partidaEletrica + "\n Valor: " + this.getValor();  
    }
    
}