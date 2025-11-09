/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 * Módulo de Alto Nível: Pedido.
 * Depende da abstração IProduto, não de Remédio, Brinquedo ou Alimento.
 */
public class Pedido {
    
    private Cliente cliente;
    private IProduto item; 
    private int quantidade;
    
    // CONSTRUTOR: Recebe o tipo abstrato IProduto
    public Pedido(Cliente cliente, IProduto item, int quantidade) {
        this.cliente = cliente;
        this.item = item;
        this.quantidade = quantidade;
    }
    
    // MÉTODO DE LÓGICA DE NEGÓCIO
    public void finalizarPedido() {
        double valorTotal = item.getPreco() * quantidade; // Usa método da abstração
        
        System.out.println("\n------ Finalizando Pedido ------");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Item: " + item.getNome() + " (Tipo: " + item.getClass().getSimpleName() + ")");
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Valor Unitario: R$%.2f\n", item.getPreco());
        System.out.printf("Valor Total: R$%.2f\n", valorTotal);
        System.out.println("Status: Pedido processado com sucesso.");
        System.out.println("------------------------\n");
    }
    
    // GETTERS
    public IProduto getItem() {
        return item;
    }
}