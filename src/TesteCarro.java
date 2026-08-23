import br.com.pessoal.RotaFacil.modelos.Veiculo;

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();

        veiculo1.setPlaca("HON2244");
        veiculo1.setModelo("Opala");
        veiculo1.setAnoFabricacao(1976);

        veiculo1.registraViagem(30);
        veiculo1.registraViagem(20);
        veiculo1.registraViagem(40);

        veiculo1.exibeFichaTecnica();
        System.out.println("Média Km por viagem: " + veiculo1.mediaKmporViagem());
    }
