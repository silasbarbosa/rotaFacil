import br.com.pessoal.RotaFacil.calculos.FiltroDeManutecao;
import br.com.pessoal.RotaFacil.modelos.Caminhao;
import br.com.pessoal.RotaFacil.modelos.Encomenda;

public static void main(String[] args) {
    Caminhao caminhao2 = new Caminhao();

    caminhao2.setCargaPorEixoToneladas(1.2);
    caminhao2.setPlaca("HGB-1322");
    caminhao2.setAnoFabricacao(1979);
    caminhao2.setModelo("X110");

    Encomenda encomenda1 = new Encomenda();

    encomenda1.setCodigoRastreio("HB77881922");
    encomenda1.setPesoKg(30);
    encomenda1.setVeiculo(caminhao2);
    encomenda1.setTotalTentativasEntrega(5);

    System.out.println(encomenda1.getNivelPrioridade());
    System.out.println(encomenda1.getVeiculo().getPlaca());

    FiltroDeManutecao  filtro1 = new FiltroDeManutecao();

    filtro1.filtraPrioridade(caminhao2);
    filtro1.filtraPrioridade(encomenda1);

}
