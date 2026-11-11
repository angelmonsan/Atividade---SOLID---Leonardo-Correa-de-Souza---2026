package exerc_3_LSP;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Pizza("Pizza de Calabresa", 45.00, "Grande"));

        produtos.add(new Hamburguer("X-Burguer", 25.00, true));

        produtos.add(new Bebida("Refrigerante", 8.00, 2000));

        for (Produto produto : produtos) {
            produto.exibirInformacoes();
            System.out.println("--------------------");
        }
    }
}
