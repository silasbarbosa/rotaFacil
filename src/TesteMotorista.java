import br.com.pessoal.RotaFacil.modelos.Caminhao;
import br.com.pessoal.RotaFacil.modelos.Motorista;
import br.com.pessoal.RotaFacil.modelos.Veiculo;
void main() {
    Motorista motorista1 = new Motorista();

    Caminhao caminhao5 = new Caminhao();

    motorista1.setNome("Motorista 1");
    motorista1.setAnosDeExperiencia(10);

    caminhao5.setCapacidadeCarga(10);

    System.out.println(motorista1.podeDirigir(caminhao5));


}