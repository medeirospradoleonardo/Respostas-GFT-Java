public class Main {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setMarca("BMW");
        veiculo1.setModelo("I8");
        veiculo1.setPlaca("LSN4149");
        veiculo1.setPreco(650000.0);
        veiculo1.setCor("Cinza");
        veiculo1.setKm("15000");
        veiculo1.setIsLigado(false);
        veiculo1.setLitrosCombustivel(30);

        veiculo1.imprimirDados();

        System.out.println();

        veiculo1.ligar();
        veiculo1.abastecer(40);
        veiculo1.acelerar();
        veiculo1.acelerar();
        veiculo1.imprimirDados();

        System.out.println();

        veiculo1.frear();
        veiculo1.imprimirDados();

        System.out.println();

        veiculo1.pintar("Branco");
        veiculo1.desligar();
        veiculo1.imprimirDados();

        System.out.println();

        veiculo1.frear();
        veiculo1.desligar();
        veiculo1.imprimirDados();
        
    }
}
