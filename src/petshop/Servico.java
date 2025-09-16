/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author victo
 */
public class Servico implements Detalhavel{
    // ATRIBUTOS
    private String descricao;
    private double valorBase;

    // CONSTRUTOR
    public Servico(String descricao, double valorBase) {
        this.descricao = descricao;
        this.valorBase = valorBase;
    }

    // METODOS COM SOBRECARGA
    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Servico ---");
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Valor Base: R$" + this.valorBase);
        System.out.println("---------------------------");
    }
    //VALOR SEM DESCONTO
    public double calcularValor() {
        return this.valorBase;
    }

    //VALOR COM DESCONTO
    public double calcularValor(double percentualDesconto) {
        if (percentualDesconto > 0 && percentualDesconto <= 100) {
            double desconto = this.valorBase * (percentualDesconto / 100);
            return this.valorBase - desconto;
        } else {
            System.out.println("Percentual de desconto invalido. Retornando valor base.");
            return this.valorBase;
        }
    }

    // GETTERS E SETTERS
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    @Override
    public String toString() {
        return "Servico{" + "descricao=" + descricao + ", valorBase=" + valorBase + '}';
    }
}
