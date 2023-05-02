package model;

//Classe MotoEletrica filha de Motocicleta implementa interface VeiculoEletrico
public class MotoEletrica extends Motocicleta implements VeiculoEletrico {

    private String autonomia;

    public MotoEletrica(String modelo, String ano, String cor, String placa, String chassi, double valor,
            boolean partidaEletrica, String autonomia) {
        super(modelo, ano, cor, placa, chassi, valor, partidaEletrica);
        this.autonomia = autonomia;
    }

    // Metodo interface VeiculoEletrico
    @Override
    public String getAutonomia() {
        return autonomia;
    }

    // Polimorfismo
    public double calculaValor() {
        return getValor() * 1.2; //Preço do carro eletrico e 20% maior que o de compra
    }

    @Override
    public String toString() {
        return "/n Modelo: " + this.getModelo() + "\n Ano: " + this.getAno() + "\n Cor: " + this.getCor() + "\n Placa: " + this.getPlaca() + "\n Chassi: " + this.getChassi() + "\n Partida Eletrica: " + isPartidaEletrica() + "\n Valor: " + this.getValor() + "\n Autonomia: " + this.getAutonomia();  
    }
    
}