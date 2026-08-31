import br.com.pessoal.RotaFacil.modelos.Encomenda;
import br.com.pessoal.RotaFacil.modelos.Motorista;
import br.com.pessoal.RotaFacil.modelos.Rota;
import br.com.pessoal.RotaFacil.modelos.Veiculo;

public static  void main(String[] args) {




    Veiculo veiculo1 = new Veiculo();
        veiculo1.setCapacidadeCarga(16);
        veiculo1.setPlaca("HGB-1322");
        veiculo1.setAnoFabricacao(1979);
        veiculo1.setModelo("X110");


    Motorista motorista1 = new Motorista ();
        motorista1.setNome( "Motorista" );
        motorista1.setAnosDeExperiencia(8);
        motorista1.setCnhValida(true);



    Encomenda encomenda1 = new Encomenda ();
        encomenda1.setCodigoRastreio("HB77881922");
        encomenda1.setPesoKg(30);
        encomenda1.setVeiculo(veiculo1);
        encomenda1.setTotalTentativasEntrega(5);

    Encomenda encomenda2 = new Encomenda ();
        encomenda2.setCodigoRastreio("BR7888966");
        encomenda2.setPesoKg(50);
        encomenda2.setVeiculo(veiculo1);
        encomenda2.setTotalTentativasEntrega(3);


    Rota rota1 = new Rota ();
        rota1.setVeiculo(veiculo1);
        rota1.setEncomendaPrincipal(encomenda1);
        rota1.setMotorista(motorista1);
        rota1.setEncomendaSecundaria(encomenda2);
        System.out.println(rota1.rotaEstaLiberada());





}