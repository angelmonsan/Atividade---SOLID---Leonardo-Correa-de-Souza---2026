package exerc_3_LSP;

public class Bebida extends Produto {

    private int volume;

    public Bebida(String nome, double preco, int volume) {
        super(nome, preco);
        this.volume = volume;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Bebida: " + nome);
        System.out.println("Volume: " + volume + " ml");
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}
