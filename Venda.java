package Produtos;

public class Venda {
    private Produto produto;
    private int quantidade;

    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public boolean realizarVenda(int quantidadeVendida) {
        if (produto instanceof ProdutoFisico) {
            ProdutoFisico produtoFisico = (ProdutoFisico) produto;
            produtoFisico.reduzirEstoque(quantidadeVendida);
        } else if (produto instanceof ProdutoDigital) {
            ProdutoDigital produtoDigital = (ProdutoDigital) produto;
            produtoDigital.reduzirLicencas(quantidadeVendida);
        }
        System.out.println("Venda realizada: " + produto.getNome() + " - Quantidade: " + quantidadeVendida);
        return false;
    }
}
