package exerc_3_LSP;

public class Hamburguer extends Produto {

    private boolean artesanal;

    public Hamburguer(String nome, double preco, boolean artesanal) {
        super(nome, preco);
        this.artesanal = artesanal;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Hambúrguer: " + nome);

        if (artesanal) {
            System.out.println("Tipo: Artesanal");
        } else {
            System.out.println("Tipo: Tradicional");
        }

        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}
