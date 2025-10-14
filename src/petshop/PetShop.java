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
        
        // --- INICIO DA DEMONSTRAÇÃO LSP ---
        System.out.println("\n=============================================");
        System.out.println("  DEMONSTRAÇÃO DO PRINCÍPIO DE LISKOV (LSP)  ");
        System.out.println("=============================================");

        // Prepara os novos objetos
        Funcionario estagiarioLSP = new Estagiario("Lucas (LSP OK)");
        Funcionario invalidoLSP = new FuncionarioInvalido("Josias (LSP VIOLADO)");

        // 1. ADERÊNCIA AO LSP: A substituição é válida.
        // O cliente 'executarServicoFuncionario' recebe um Estagiario, mas o trata 
        // como Funcionario. O contrato é cumprido e o programa funciona.
        executarServicoFuncionario(estagiarioLSP);

        // 2. VIOLAÇÃO AO LSP: A substituição é inválida e pode quebrar o cliente.
        // O cliente recebe um FuncionarioInvalido, mas espera um Funcionario.
        // O subtipo quebra o contrato, e o cliente falha.
        try {
            executarServicoFuncionario(invalidoLSP);
        } catch (UnsupportedOperationException e) {
            System.err.println("\n!!! VIOLAÇÃO DO LSP CAPTURADA !!!");
            System.err.println("Erro: " + e.getMessage());
            System.err.println("O subtipo (FuncionarioInvalido) quebrou o contrato do tipo base (Funcionario), causando uma falha inesperada no código cliente.");
            System.err.println("---------------------------------");
        }
        
    }
        
}
