/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 * Detalhe de Baixo Nível: Remedio. Implementa a abstração IProduto.
 */
public class Remedio implements IProduto {
    private String nome;
    private double preco;
    private int estoque;
    private String validade;

    public Remedio(String nome, double preco, int estoque, String validade) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.validade = validade;
    }

    // Implementação do contrato IProduto / Detalhavel
    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Remedio ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: R$" + this.preco);
        System.out.println("Em Estoque: " + this.estoque);
        System.out.println("Validade: " + this.validade);
        System.out.println("---------------------------");
    }

    @Override
    public String getNome() { return nome; }

    @Override
    public double getPreco() { return preco; }
    
    // Getters específicos (Opcional)
    public String getValidade() { return validade; }
}