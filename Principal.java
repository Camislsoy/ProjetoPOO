package Produtos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados para categorias de produtos equipamentos eletronicos ou software
        System.out.print("Digite o ID da categoria do produto 1: ");
        int idCategoria1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome da categoria  do produto 1: ");
        String nomeCategoria1 = scanner.nextLine();

        System.out.print("Digite o ID da categoria  do produto 2: ");
        int idCategoria2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome da categoria  do produto 2: ");
        String nomeCategoria2 = scanner.nextLine();

        Categoria eletronicos = new Categoria(idCategoria1, nomeCategoria1);
        Categoria software = new Categoria(idCategoria2, nomeCategoria2);

        // Entrada de dados para produtos
        System.out.print("Digite o ID do primeiro produto: ");
        int idProduto1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do primeiro produto: ");
        String nomeProduto1 = scanner.nextLine();
        System.out.print("Digite o preço do primeiro produto: ");
        double precoProduto1 = scanner.nextDouble();
        System.out.print("Digite o estoque do primeiro produto: ");
        int estoqueProduto1 = scanner.nextInt();

        Produto tv = new ProdutoFisico(idProduto1, nomeProduto1, precoProduto1, estoqueProduto1);

        System.out.print("\nDigite o ID do segundo produto: ");
        int idProduto2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do segundo produto: ");
        String nomeProduto2 = scanner.nextLine();
        System.out.print("Digite o preço do segundo produto: ");
        double precoProduto2 = scanner.nextDouble();
        System.out.print("Digite o estoque do segundo produto: ");
        int estoqueProduto2 = scanner.nextInt();
        System.out.print("Digite a quantidade do segundo produto: ");
        double quantidade2 = scanner.nextDouble();

        Produto licencaWindows = new ProdutoDigital(idProduto2, nomeProduto2, precoProduto2, estoqueProduto2, quantidade2);


        Estoque estoque = new Estoque();
        estoque.adicionarProduto(tv);
        estoque.adicionarProduto(licencaWindows);

        System.out.println("\nProdutos disponíveis no estoque:");
        estoque.listarProdutos();


        System.out.println("\nRealizando venda:");
        System.out.print("Digite a quantidade a ser vendida do primeiro produto: ");
        int quantidadeVenda1 = scanner.nextInt();

        Venda venda1 = new Venda(tv, quantidadeVenda1);
        venda1.realizarVenda(quantidadeVenda1);


        System.out.println("\nEstoque atualizado:");
        estoque.listarProdutos();


        scanner.close();
    }
}
