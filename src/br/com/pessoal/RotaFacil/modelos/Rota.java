package br.com.pessoal.RotaFacil.modelos;

public class Rota {
 private Veiculo veiculo;
 private Motorista motorista;
 private Encomenda encomendaPrincipal;
 private Encomenda encomendaSecundaria;
 private boolean apto;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Encomenda getEncomendaPrincipal() {
        return encomendaPrincipal;
    }

    public void setEncomendaPrincipal(Encomenda encomendaPrincipal) {
        this.encomendaPrincipal = encomendaPrincipal;
    }

    public Encomenda getEncomendaSecundaria() {
        return encomendaSecundaria;
    }

    public void setEncomendaSecundaria(Encomenda encomendaSecundaria) {
        this.encomendaSecundaria = encomendaSecundaria;
    }


    public boolean rotaEstaLiberada (){
         if(this.motorista.podeDirigir(this.veiculo)==true){
             if( this.encomendaPrincipal.getNivelPrioridade() <=4 && this.encomendaSecundaria.getNivelPrioridade() <=4){
                apto = true;
             }
             else{
                apto = false;
             }
         }
         else {
             apto = false;
         }

     return apto;
 }
}
