package Produtos;

public abstract class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public void adicionar(int quantidade) {
        this.quantidade += quantidade;
    }

    public void remover(int quantidadeVendida) {
        if (quantidadeVendida <= this.quantidade) {
            this.quantidade -= quantidadeVendida;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public abstract double calcularValorTotal(); // Método abstrato

    public abstract String apresentar(); // Método abstrato
}
