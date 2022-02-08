import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Jogador {
    private String nome;
    private String posicao;
    private Date data_de_nascimento;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Date getData_de_nascimento() {
        return this.data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date dataFormatada = formato.parse(data_de_nascimento); 
        this.data_de_nascimento = dataFormatada;
    }

    public void imprimirDados(){

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(this.data_de_nascimento);

        System.out.println("Nome: " + this.nome);
        System.out.println("Posição: " + this.posicao);
        System.out.println("Data de Nascimento: " + dataFormatada);
        System.out.println("Idade: " + idadeJogador());
        System.out.println("Se aposenta em: " + tempoParaAposentar() + " anos");
    }

    public int idadeJogador(){

        Calendar data_nascimento = new GregorianCalendar();
        data_nascimento.setTime(this.data_de_nascimento);
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - data_nascimento.get(Calendar.YEAR);
        data_nascimento.add(Calendar.YEAR, idade);
        if (hoje.before(data_nascimento)) {
            idade--;
        }

        return idade;
        
    }

    public int tempoParaAposentar(){
        int tempo_para_aposentar = 0;

        if(this.posicao.equals("Defesa")){
            tempo_para_aposentar = 40 - this.idadeJogador();

        }else if(this.posicao.equals("Meio-Campo")){
            tempo_para_aposentar = 38 - this.idadeJogador();

        }else if(this.posicao.equals("Atacante")){
            tempo_para_aposentar = 35 - this.idadeJogador();

        }

        if(tempo_para_aposentar <= 0){
            return 0;
        }else{
            return tempo_para_aposentar;
        }
        
    }

}
