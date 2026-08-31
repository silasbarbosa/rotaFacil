package br.com.pessoal.RotaFacil.modelos;

import br.com.pessoal.RotaFacil.calculos.PrioridadeEntrega;
import br.com.pessoal.RotaFacil.calculos.Rastreavel;

public class Encomenda implements PrioridadeEntrega,  Rastreavel {
    private String codigoRastreio;
    private double pesoKg;
    private int totalTentativasEntrega;
    private Veiculo veiculo;
    private int prioridade;

    public String getCodigoRastreio() {
        return codigoRastreio;
    }

    public void setCodigoRastreio(String codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int getTotalTentativasEntrega() {
        return totalTentativasEntrega;
    }

    public void setTotalTentativasEntrega(int totalTentativasEntrega) {
        this.totalTentativasEntrega = totalTentativasEntrega;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getNivelPrioridade(){
        if (totalTentativasEntrega>3){
            prioridade = 4;
        }
        else{
            prioridade = 2;
        }
        return prioridade;
    }
    public String gerarCodigoRastreio(){
        return gerarCodigoRastreio();
    }



}
