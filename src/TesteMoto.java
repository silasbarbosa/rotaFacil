import br.com.pessoal.RotaFacil.modelos.Moto;

void main() {
    Moto moto1 = new Moto();

    moto1.setPlaca("GUO7830");
    moto1.setModelo("Classic 350");
    moto1.setCilindradas(350);
    moto1.setAnoFabricacao(2026);

    moto1.registraViagem(25);
    moto1.registraViagem(25);

    moto1.exibeFichaTecnica();
    System.out.println("Média Km por viagem: " + moto1.mediaKmporViagem());


}