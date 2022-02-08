public class Main {
    public static void main(String[] args) throws Exception {

        Jogador jogador1 = new Jogador();
        jogador1.setNome("Fagner Conserva Lemos");
        jogador1.setData_de_nascimento("11/06/1989");
        jogador1.setPosicao("Defesa");
        jogador1.imprimirDados();


        System.out.println();

        Jogador jogador2 = new Jogador();
        jogador2.setNome("Leonardo Medeiros Prado");
        jogador2.setData_de_nascimento("20/05/1998");
        jogador2.setPosicao("Atacante");
        jogador2.imprimirDados();
    }
}
