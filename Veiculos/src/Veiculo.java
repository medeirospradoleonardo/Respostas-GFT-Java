public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String km;
    private Boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private Double preco;


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getKm() {
        return this.km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public Boolean isIsLigado() {
        return this.isLigado;
    }

    public Boolean getIsLigado() {
        return this.isLigado;
    }

    public void setIsLigado(Boolean isLigado) {
        this.isLigado = isLigado;
    }

    public int getLitrosCombustivel() {
        return this.litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void acelerar(){
        this.setVelocidade(this.velocidade + 20);
    }

    public void abastecer(int combustivel){
        int litros = this.litrosCombustivel + combustivel;

        if(litros >= 60){
            this.setLitrosCombustivel(60);
        }else{
            this.setLitrosCombustivel(litros);
        }
    } 

    public void frear(){
        if(this.getVelocidade() > 0){
            this.setVelocidade(this.velocidade - 20);
        }
    }

    public void pintar(String cor){
        this.setCor(cor);
    } 

    public void ligar(){
        if(!this.getIsLigado()){
            this.setIsLigado(true);
        }
    }

    public void desligar(){
        if(this.getIsLigado()){
            if(this.getVelocidade() <= 0){
                this.setIsLigado(false); 
            }
        }
    }

    public void imprimirDados(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Quilometragem: " + this.getKm());
        System.out.println("Quantidade de litros no combustível: " + this.getLitrosCombustivel());
        if(this.getIsLigado()){
            System.out.println("Carro ligado: " + "Sim");    
        }else{
            System.out.println("Carro ligado: " + "Não");    
        }
        System.out.println("Velocidade: " + this.getVelocidade());
    }


}