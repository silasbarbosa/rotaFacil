package br.com.pessoal.RotaFacil.modelos;
import br.com.pessoal.RotaFacil.calculos.CalculadoraDeCapacidade;

public class Motorista {

    private String nome;
    private boolean cnhValida;
    private int anosDeExperiencia;

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

    public boolean podeDirigir(Veiculo veiculo) {
        if (veiculo.getCapacidadeCarga()>15){
            if (this.anosDeExperiencia>=5){
                cnhValida = true;
            }
            else {
                cnhValida = false;
            }

        }
        else if (veiculo.getCapacidadeCarga()>=5) {
            if (this.anosDeExperiencia>=2){
                cnhValida = true;
            }
            else {
                cnhValida = false;
            }

        }
        else {
            if (this.anosDeExperiencia>=2){
                cnhValida = true;
            }
            else {
                cnhValida = false;
            }


        }
        return this.cnhValida;
    }

}
