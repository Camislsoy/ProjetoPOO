package Produtos;

public class Principal {
    public static void main(String[] args) {
        Categoria eletronicos = new Categoria(1, "Eletrônicos");
        Categoria software = new Categoria(2, "Software");

        Produto tv = new ProdutoFisico(101, "TV", 2500.00, 10);
        Produto licencaWindows = new ProdutoDigital(102, "Licença Windows", 300.00, 5, 50.00);

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(tv);
        estoque.adicionarProduto(licencaWindows);

        System.out.println("Produtos disponíveis no estoque:");
        estoque.listarProdutos();

        System.out.println("\nRealizando venda:");
        Venda venda1 = new Venda(tv, 2);
        venda1.realizarVenda(2);

        System.out.println("\nEstoque atualizado:");
        estoque.listarProdutos();
    }
}