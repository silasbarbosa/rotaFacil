import br.com.pessoal.RotaFacil.modelos.Caminhao;

public static void main(String[] args) {


    Caminhao caminhao1 = new Caminhao();

    caminhao1.setPlaca("MVB-1596");
    caminhao1.setModelo("111-S");
    caminhao1.setAnoFabricacao(1975);
    caminhao1.setNumeroDeEixos(4);
    caminhao1.setCargaPorEixoToneladas(30);


    caminhao1.exibeFichaTecnica();
    System.out.println("Capacidade total de Carga deste caminhão é de: " + caminhao1.getCapacidadeCarga() + " Toneladas");

    System.out.println("A prioridade desse caminhão é: " + caminhao1.getNivelPrioridade());
}