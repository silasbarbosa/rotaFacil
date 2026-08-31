package br.com.pessoal.RotaFacil.modelos;
import br.com.pessoal.RotaFacil.calculos.CalculadoraDeCapacidade;

public class Motorista {

    private String nome;
    private boolean cnhValida;
    private int anosDeExperiencia;
    private boolean aptoDirigirVeiculo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }


    public void setCnhValida(boolean cnhValida) {
        this.cnhValida = cnhValida;
    }

    public boolean isCnhValida() {
        return cnhValida;
    }

    public boolean podeDirigir(Veiculo veiculo) {
        if(this.isCnhValida()==true){
            if (veiculo.getCapacidadeCarga()>15){
                if (this.anosDeExperiencia>=5){
                    this.aptoDirigirVeiculo = true;
                }
                else {
                    this.aptoDirigirVeiculo = false;
                }

            }
            else if (veiculo.getCapacidadeCarga()>=5) {
                if (this.anosDeExperiencia>=2){
                    this.aptoDirigirVeiculo = true;
                }
                else {
                    this.aptoDirigirVeiculo = false;
                }

            }
            else {
                if (this.anosDeExperiencia>=2){
                    this.aptoDirigirVeiculo = true;
                }
                else {
                    this.aptoDirigirVeiculo = false;
                }


            }
        }
        else{
            this.aptoDirigirVeiculo = false;
        }


        return this.aptoDirigirVeiculo;
    }

}
