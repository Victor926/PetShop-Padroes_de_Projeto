/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petshop;

/**
 *
 * @author victo
 */
public class PetShop {

    // Novo métodoo que funciona com QUALQUER objeto que implementa Detalhavel
    public static void imprimirRelatorio(Detalhavel item) {
        System.out.println("\nGerando relatorio para o item...");
        item.exibirDetalhes();
    }
    
    // CLIENTE LSP - Depende apenas do tipo base Funcionario
    public static void executarServicoFuncionario(Funcionario f) {
        System.out.println("\n[LSP - CLIENTE DE TAREFAS]");
        System.out.println("Cliente invoca a tarefa do funcionario: " + f.getNome());
        f.realizarTarefa(); // Invocação polimórfica que depende do contrato
        System.out.println("[FIM DO CLIENTE DE TAREFAS]");
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        Cao rex = new Cao("Rex", 3, 15.5, "Macho", RacaCao.LABRADOR);
        Gato mimi = new Gato("Mimi", 2, 4.0, "Femea", RacaGato.SIAMES);

        System.out.println("ID do Cachorro " + rex.getNome() + ": " + rex.getId());
        System.out.println("ID do Gato " + mimi.getNome() + ": " + mimi.getId());
        System.out.println("---");


        Cliente ana = new Cliente("Ana", "9999-8888");
        ana.adicionarAnimal(rex);
        ana.adicionarAnimal(mimi);
        System.out.println("---");

        //utilizando interface
        System.out.println("\n Detalhando o cliente: ");
        imprimirRelatorio(ana);
        System.out.printf("\n\n");

        Servico banho = new Servico("Banho", 40.0);
        Servico tosa = new Servico("Tosa Completa", 60.0);

        System.out.println("Valor do Banho (sem desconto): R$" + banho.calcularValor());
        System.out.println("Valor da Tosa (com 10% de desconto): R$" + tosa.calcularValor(10));
        System.out.println("---\n ");

        //utilizando interface
        System.out.println("\n Detalhando servico: ");
        imprimirRelatorio(banho);
        System.out.println("\n \n");

        Funcionario veterinario = new Veterinario("Dr. Joao");
        Funcionario recepcionista = new Recepcionista("Joana");
        
        System.out.println("Funcionario: " + veterinario.getNome());
        veterinario.realizarTarefa();
        System.out.println("--- \n");

        System.out.println("Funcionario: " + recepcionista.getNome());
        recepcionista.realizarTarefa();
        System.out.println("--- \n");


        System.out.println("\n--- DETALHES DE UM ATENDIMENTO ESPECIFICO ---");
        Atendimento atendimento1 = new Atendimento(ana, rex, banho, veterinario, "14/09/2025");
        atendimento1.descreverAtendimento();
        System.out.println("------------------------------------------");

        Atendimento atendimento2 = new Atendimento(ana, mimi, tosa, recepcionista, "14/09/2025");
        atendimento2.descreverAtendimento();
        
        
        // ===========================================
        // INÍCIO DA DEMONSTRAÇÃO DO DIP EM PRODUTOS
        // ===========================================
        System.out.println("\n=============================================");
        System.out.println("  DEMONSTRAÇAO DO PRINCIPIO DE INVERSAO DE DEPENDENCIA (DIP) EM PEDIDOS ");
        System.out.println("=============================================");

        // Módulos de Baixo Nível (Classes Concretas)
        Remedio vermifugo = new Remedio("Vermífugo V-Max", 25.50, 80, "01/01/2027");
        Brinquedo bola = new Brinquedo("Bola de Borracha", 12.00, 50, "Borracha"); 
        Alimento racaoPremium = new Alimento("Racao Cao Adulto", 89.90, 20, "Frango", "Cachorro");
        
        // As variáveis podem ser tipadas como a abstração IProduto
        IProduto item1 = vermifugo;
        IProduto item2 = bola;
        IProduto item3 = racaoPremium;

        System.out.println("\n--- Detalhes e Pedidos (Alto Nivel) ---");
        
        // 1. Pedido de Remédio
        Pedido pedido1 = new Pedido(ana, item1, 1); 
        imprimirRelatorio(item1);
        pedido1.finalizarPedido();
        
        // 2. Pedido de Brinquedo
        Pedido pedido2 = new Pedido(ana, item2, 3); 
        imprimirRelatorio(item2);
        pedido2.finalizarPedido();

        // 3. Pedido de Alimento
        Pedido pedido3 = new Pedido(ana, item3, 1); 
        imprimirRelatorio(item3);
        pedido3.finalizarPedido();

        //System.out.println("=============================================");
        // FIM DA DEMONSTRAÇÃO DIP EM PRODUTOS
        // 
        // ===========================================

        /*
        // --- INICIO DA DEMONSTRAÇÃO LSP (EXISTENTE) ---
        System.out.println("\n=============================================");
        System.out.println("  DEMONSTRAÇÃO DO PRINCÍPIO DE LISKOV (LSP)  ");
        System.out.println("=============================================");

        // Prepara os novos objetos
        Funcionario estagiarioLSP = new Estagiario("Lucas (LSP OK)");
        Funcionario invalidoLSP = new FuncionarioInvalido("Josias (LSP VIOLADO)");

        */
        
    }
        
}