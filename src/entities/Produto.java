package entities;

import exceptions.ProdutoException;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;



    public Produto(String nome, double preco, int quantidade) {

        if (preco < 0) {
            throw new ProdutoException("O preço do produto não pode ser negativo");
        }
        if (quantidade < 0) {
            throw new ProdutoException("A quantidade do produto não pode ser negativo");
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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

    @Override
    public String toString() {
        return "Nome do produto: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade;
    }

}
