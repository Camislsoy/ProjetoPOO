package Produtos;

public class ProdutoFisico extends Produto {
    public ProdutoFisico(int codigo, String nome, double preco, int quantidade) {
        super(codigo, nome, preco, quantidade);
    }

    @Override
    public double calcularValorTotal() {
        return getPreco() * getQuantidade();
    }

    @Override
    public String apresentar() {
        return "Produto Físico - Código: " + getCodigo() + ", Nome: " + getNome() +
                ", Preço: R$ " + getPreco() + ", Quantidade: " + getQuantidade();
    }
}
