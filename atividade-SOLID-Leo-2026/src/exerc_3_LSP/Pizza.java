package exerc_3_LSP;

public class Pizza extends Produto {

    private String tamanho;

    public Pizza(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Pizza: " + nome);
        System.out.println("Tamanho: " + tamanho);
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}

