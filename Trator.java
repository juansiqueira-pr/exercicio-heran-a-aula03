class Trator extends Carro {
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

