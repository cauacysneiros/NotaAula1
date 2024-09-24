package NotaAula1.Questao2;

public class Produto {

        String codigo;
        String nome;
        String tamanhoPeso;
        String cor;
        double valor;
        int quantidadeEstoque;

        // Construtor
        public Produto(String codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
            this.codigo = codigo;
            this.nome = nome;
            this.tamanhoPeso = tamanhoPeso;
            this.cor = cor;
            this.valor = valor;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        // Métodos getter
        public String getCodigo() {
            return codigo;
        }

        public String getNome() {
            return nome;
        }

        public double getValor() {
            return valor;
        }

        public int getQuantidadeEstoque() {
            return quantidadeEstoque;
        }

        // Método para reduzir a quantidade em estoque
        public void reduzirEstoque(int quantidade) {
            this.quantidadeEstoque -= quantidade;
        }
    }


