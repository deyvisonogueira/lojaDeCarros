package model;

//Classe CarroEletrico filha de Carro implementa interface VeiculoEletrico
public class CarroEletrico extends Carro implements VeiculoEletrico{
    private String autonomia;

    public CarroEletrico(String modelo, String ano, String cor, String placa, String chassi, int numPortas,
            double valor, String autonomia) {
        super(modelo, ano, cor, placa, chassi, numPortas, valor);
        this.autonomia = autonomia;
    }
    
    @Override
    public String getAutonomia() {
        return autonomia;
    }
    // Polimorfismo com interface 
    
    public double calculaValor() {
        return getValor() * 1.2; //Preço do carro eletrico e 20% maior que o de compra
    }

    @Override
    public String toString() {
        return "/n Modelo: " + this.getModelo() + "\n Ano: " + this.getAno() + "\n Cor: " + this.getCor() + "\n Placa: " + this.getPlaca() + "\n Chassi: " + this.getChassi() + "\n Número de Protas: " + this.getNumPortas() + "\n Valor: " + this.getValor() + "\n Autonomia: " + this.getAutonomia();  
    }   
    
}
