class Carro {
    private String marca;
    private String cor;
    private int ano;

    public Carro(String marca, String cor, int ano){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public void Buzinar(){
        System.out.println("Meu " + marca + " " + cor + " faz " + "BI BI BI!");

    }

    static class Trator extends Carro {
        private int lanternas;
        private int alavancas;

        public Trator(String marca, String cor, int ano, int lanternas, int alavancas) {
            super(marca, cor, ano);
            this.lanternas = lanternas;
            this.alavancas = alavancas;
        }


        public void Buzinar() {
                System.out.println("BOOM BOOM!");
            }

    }
}

public class Heranca{
    public static void main(String[]args){
        Carro.Trator meutrator = new Carro.Trator("Caterpillar", "Amarelo", 1999, 6, 2);
        Carro meucarro = new Carro("Jaguar", "Preto", 2020);

        meutrator.Buzinar();
        meucarro.Buzinar();
    }
}
