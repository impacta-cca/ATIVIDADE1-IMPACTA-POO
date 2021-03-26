/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_Relacionamento;

/**
 *
 * @author anacris
 */
public class Carro {
    private double combustivel;
    private double desempenho;

    public Carro() {
        this.combustivel = 0.0;
        this.desempenho = 14.0;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public double getDesempenho() {
        return desempenho;
    }

    public void encherTanque(Gasolina gasolina) {
       this.combustivel = this.combustivel + gasolina.getLitros();
    }
    
    public void encherTanque(Alcool alcool) {
       this.combustivel = this.combustivel + alcool.getLitros();
    }

    void andar(double distancia) {
        combustivel = combustivel - distancia/desempenho;
    }
    
    
}
