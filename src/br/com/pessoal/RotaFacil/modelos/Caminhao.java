package br.com.pessoal.RotaFacil.modelos;

import org.w3c.dom.ls.LSOutput;

public class Caminhao extends Veiculo  implements PrioridadeEntrega{
    private int numeroDeEixos;
    private double cargaPorEixoToneladas;
    private int prioridade;

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

    public int getNivelPrioridade() {
        if(this.getCapacidadeCarga()>=20){
            prioridade = 4;
        }
        else{
            prioridade = 2;
        }
        return prioridade;
    }

    @Override
    public double getCapacidadeCarga(){
        return this.getCargaPorEixoToneladas() * this.numeroDeEixos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Placa: " + this.getPlaca()+ "\nModelo:  " + this.getModelo() + "\nAno Fabricacao: " + this.getAnoFabricacao()+ "\nEixos: " + this.getNumeroDeEixos());
    }
}
