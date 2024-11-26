package Produtos;

public class ProdutoFisico extends Produto {
    private int quantidadeEstoque;

    public ProdutoFisico(int id, String nome, double preco, int quantidadeEstoque) {
        super(id, nome, preco);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void reduzirEstoque(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente para o produto: " + getNome());
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Estoque: " + quantidadeEstoque;
    }
}

