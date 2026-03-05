class Carro {
    private String marca;
    private String cor;
    private int ano;

    public Carro(String marca, String cor, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public void Buzinar() {
        System.out.println("Meu " + marca + " " + cor + " faz " + "BI BI BI!");

    }
}