package Produtos;

import java.util.Scanner;

public abstract class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    // Construtores
    public Produto(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Construtor com quantidade padrão
    public Produto(int codigo, String nome, double preco) {
        this(codigo, nome, preco, 0);
    }

    // Getters e setters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para reduzir a quantidade do estoque
    public void reduzirQuantidade(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
        } else {
            System.out.println("Estoque insuficiente para o produto: " + nome);
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    // Método estático para criar um produto físico ou digital
    public static Produto criarProduto(Scanner scanner, boolean isDigital) {
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade do produto em estoque: ");
        int quantidade = scanner.nextInt();

        if (isDigital) {
            System.out.print("Digite a quantidade virtual (licenças ou downloads): ");
            double quantidadeDigital = scanner.nextDouble();
            return new ProdutoDigital(codigo, nome, preco, quantidade, quantidadeDigital);
        } else {
            return new ProdutoFisico(codigo, nome, preco, quantidade);
        }
    }
}
