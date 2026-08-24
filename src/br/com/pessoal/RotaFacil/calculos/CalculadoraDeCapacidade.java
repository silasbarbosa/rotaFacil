package br.com.pessoal.RotaFacil.calculos;

import br.com.pessoal.RotaFacil.modelos.Veiculo;

public class CalculadoraDeCapacidade {
    private double capacidadeTotal;

    public double getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void incluiVeiculo(Veiculo veiculo){
        capacidadeTotal+= veiculo.getCapacidadeCarga();
    }
}

