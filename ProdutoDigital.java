package Produtos;

public class ProdutoDigital extends Produto {
    private int licencasDisponiveis;
    private double custoProducao;

    public ProdutoDigital(int id, String nome, double preco, int licencasDisponiveis, double custoProducao) {
        super(id, nome, preco);
        this.licencasDisponiveis = licencasDisponiveis;
        this.custoProducao = custoProducao;
    }

    public int getLicencasDisponiveis() {
        return licencasDisponiveis;
    }

    public void reduzirLicencas(int quantidade) {
        if (quantidade <= licencasDisponiveis) {
            licencasDisponiveis -= quantidade;
        } else {
            System.out.println("Licenças insuficientes para o produto: " + getNome());
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Licenças disponíveis: " + licencasDisponiveis + ", Custo de produção: " + custoProducao;
    }
}
