import br.com.pessoal.RotaFacil.modelos.Caminhao;
import br.com.pessoal.RotaFacil.modelos.Moto;
import br.com.pessoal.RotaFacil.calculos.CalculadoraDeCapacidade;

public static void main(String[] args) {
    Caminhao caminhao3 = new Caminhao();

    caminhao3.setCargaPorEixoToneladas(8);
    caminhao3.setPlaca("HCB-1822");
    caminhao3.setAnoFabricacao(1990);
    caminhao3.setModelo("X220");
    caminhao3.setNumeroDeEixos(4);

    Caminhao caminhao4 = new Caminhao();

    caminhao4.setCargaPorEixoToneladas(10);
    caminhao4.setPlaca("HCC-1234");
    caminhao4.setAnoFabricacao(2000);
    caminhao4.setModelo("X720");
    caminhao4.setNumeroDeEixos(4);

    Moto moto3 = new Moto();

    moto3.setPlaca("GXO7830");
    moto3.setModelo("Shotgun");
    moto3.setCilindradas(650);
    moto3.setAnoFabricacao(2026);
    moto3.setCapacidadeCarga(0.1);

    CalculadoraDeCapacidade calculadora1 = new CalculadoraDeCapacidade();

    calculadora1.incluiVeiculo(moto3);
    calculadora1.incluiVeiculo(caminhao3);
    calculadora1.incluiVeiculo(caminhao4);
    System.out.println(calculadora1.getCapacidadeTotal());

}