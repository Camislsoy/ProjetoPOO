package Produtos;

public class ProdutoDigital extends Produto {
    private double taxaDownload;

    public ProdutoDigital(int codigo, String nome, double preco, int quantidade, double taxaDownload) {
        super(codigo, nome, preco, quantidade);
        this.taxaDownload = taxaDownload;
    }

    public double getTaxaDownload() { return taxaDownload; }
    public void setTaxaDownload(double taxaDownload) { this.taxaDownload = taxaDownload; }

    @Override
    public double calcularValorTotal() {
        return (getPreco() + taxaDownload) * getQuantidade();
    }

    @Override
    public String apresentar() {
        return "Produto Digital - Código: " + getCodigo() + ", Nome: " + getNome() +
                ", Preço: R$ " + getPreco() + ", Taxa de Download: R$ " + taxaDownload +
                ", Quantidade: " + getQuantidade();
    }
}