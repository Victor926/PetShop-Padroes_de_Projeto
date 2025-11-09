/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 * Detalhe de Baixo Nível: Alimento. Implementa a abstração IProduto.
 */
public class Alimento implements IProduto {
    private String nome;
    private double preco;
    private int estoque;
    private String sabor;
    private String tipoAnimal;

    public Alimento(String nome, double preco, int estoque, String sabor, String tipoAnimal) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.sabor = sabor;
        this.tipoAnimal = tipoAnimal;
    }

    // Implementação do contrato IProduto / Detalhavel
    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Alimento ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: R$" + this.preco);
        System.out.println("Em Estoque: " + this.estoque);
        System.out.println("Sabor: " + this.sabor);
        System.out.println("Para: " + this.tipoAnimal);
        System.out.println("---------------------------");
    }

    @Override
    public String getNome() { return nome; }

    @Override
    public double getPreco() { return preco; }
    
    // Getters específicos (Opcional)
    public String getSabor() { return sabor; }
    public String getTipoAnimal() { return tipoAnimal; }
}