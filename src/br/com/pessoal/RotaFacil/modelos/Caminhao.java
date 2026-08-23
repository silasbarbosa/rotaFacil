package br.com.pessoal.RotaFacil.modelos;

import org.w3c.dom.ls.LSOutput;

public class Caminhao extends Veiculo {
    private int numeroDeEixos;
    private double cargaPorEixoToneladas;

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public void setNumeroDeEixos(int numeroDeEixos) {
        this.numeroDeEixos = numeroDeEixos;
    }

    public double getCargaPorEixoToneladas() {
        return cargaPorEixoToneladas;
    }

    public void setCargaPorEixoToneladas(double cargaPorEixoToneladas) {
        this.cargaPorEixoToneladas = cargaPorEixoToneladas;
    }

    @Override
    public double getCapacidadeCarga(){
        return this.cargaPorEixoToneladas* this.numeroDeEixos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Placa: " + this.getPlaca()+ "\nModelo:  " + this.getModelo() + "\nAno Fabricacao: " + this.getAnoFabricacao()+ "\nEixos: " + this.getNumeroDeEixos());
    }
}
