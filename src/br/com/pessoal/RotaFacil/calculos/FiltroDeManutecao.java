package br.com.pessoal.RotaFacil.calculos;

import br.com.pessoal.RotaFacil.modelos.PrioridadeEntrega;

public class FiltroDeManutecao {

    public void filtraPrioridade(PrioridadeEntrega prioridade) {
        if (prioridade.getNivelPrioridade()>=4){
            System.out.println("Ação imediata necesária");
        }
        else if (prioridade.getNivelPrioridade()==2|| prioridade.getNivelPrioridade() ==3){
            System.out.println("Monitorar nas próximas 24h");

        }
        else {
            System.out.println("Sem ações necessárias");
        }
    }

}
