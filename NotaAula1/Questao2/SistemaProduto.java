package NotaAula1.Questao2;

import java.util.Scanner;

public class SistemaProduto {
    private static Scanner scanner = new Scanner(System.in);
    private static Produto produto;

    public static void main(String[] args) {
        cadastrarProduto();
        realizarVenda();
    }

    private static void cadastrarProduto() {
        System.out.println("Cadastro de Produto");
        System.out.print("Digite o código: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tamanho/peso: ");
        String tamanhoPeso = scanner.nextLine();
        System.out.print("Digite a cor: ");
        String cor = scanner.nextLine();
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a quantidade no estoque: ");
        int quantidadeEstoque = scanner.nextInt();
        scanner.nextLine(); 

        produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void realizarVenda() {
        if (produto == null) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        System.out.println("Venda do Produto: " + produto.getNome());
        System.out.print("Digite a quantidade a ser vendida: ");
        int quantidadeVendida = scanner.nextInt();

        if (quantidadeVendida > produto.getQuantidadeEstoque()) {
            System.out.println("Estoque insuficiente! Disponível: " + produto.getQuantidadeEstoque());
            return;
        }

        produto.reduzirEstoque(quantidadeVendida);
        double valorTotal = produto.getValor() * quantidadeVendida;
        System.out.printf("Valor total: R$ %.2f\n", valorTotal);

        System.out.println("Método de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Espécie");
        System.out.println("3. Transferência (5% de desconto)");
        System.out.println("4. Débito (5% de desconto)");
        System.out.println("5. Crédito (3x sem juros)");
        System.out.print("Escolha uma opção: ");
        int opcaoPagamento = scanner.nextInt();

        switch (opcaoPagamento) {
            case 1: 
            case 3: 
            case 4: 
                valorTotal *= 0.95; 
                System.out.printf("Valor com desconto: R$ %.2f\n", valorTotal);
                break;
            case 2: 
                System.out.print("Digite o valor pago: R$ ");
                double valorPago = scanner.nextDouble();
                if (valorPago >= valorTotal) {
                    double troco = valorPago - valorTotal;
                    System.out.printf("Troco: R$ %.2f\n", troco);
                } else {
                    System.out.println("Valor pago insuficiente!");
                }
                return; 
            case 5: 
                System.out.printf("Valor a ser pago em 3x: R$ %.2f\n", valorTotal / 3);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Venda realizada com sucesso!");
    }
}
