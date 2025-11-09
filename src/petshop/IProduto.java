package petshop;

/**
 * Interface de Abstração para Produtos (DIP).
 * Define o contrato para qualquer item que possa ser incluído em um Pedido.
 */
public interface IProduto extends Detalhavel {
    
    // Métodos essenciais que o "Pedido" (módulo de alto nível) precisa
    String getNome();
    double getPreco();
}