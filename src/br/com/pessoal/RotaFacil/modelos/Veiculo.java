package br.com.pessoal.RotaFacil.modelos;

import org.w3c.dom.ls.LSOutput;
import javax.print.DocFlavor;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private boolean ativo;
    private double somaQuilometragemViagens;
    private int totalViagens;


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String exibeFichaTecnica(){
        return "Placa: " + this.placa + " Modelo: " + this.modelo + " AnoFabricacao: " + this.anoFabricacao;
    }

    public void registraViagem(double km){
        somaQuilometragemViagens += km;
        totalViagens = totalViagens + 1;
    }

    public double mediaKmPorVIagem(){
        return somaQuilometragemViagens/totalViagens;
    }
}
