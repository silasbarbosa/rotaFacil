package br.com.pessoal.RotaFacil.modelos;


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

    public double getSomaQuilometragemViagens() {
        return somaQuilometragemViagens;
    }

    public int getTotalViagens() {
        return totalViagens;
    }

    public void exibeFichaTecnica(){
        System.out.println("Placa: " + this.placa + "\nModelo:  " + this.modelo + "\nAno Fabricacao: " + this.anoFabricacao);
    }

    public void registraViagem(double km){
        totalViagens = totalViagens + 1;
        System.out.println(somaQuilometragemViagens= km+ somaQuilometragemViagens);
    }

    public double mediaKmporViagem(){
        return somaQuilometragemViagens/totalViagens;
    }
}