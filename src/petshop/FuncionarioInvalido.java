/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 * Esta classe simula uma VIOLAÇÃO DO LSP.
 * O contrato do tipo base 'Funcionario' exige que realizarTarefa() execute e 
 * reporte a tarefa. Este subtipo quebra o contrato ao lançar uma exceção 
 * inesperada, forçando o código cliente a depender do tipo específico, 
 * o que viola o princípio.
 */
public class FuncionarioInvalido extends Funcionario {
    
    public FuncionarioInvalido(String nome) {
        super(nome);
    }

    // VIOLAÇÃO DO LSP: Lança uma exceção inesperada para o cliente que 
    // está usando o tipo base 'Funcionario'.
    @Override
    public void realizarTarefa() {
        throw new UnsupportedOperationException("O funcionario " + getNome() + " NAO DEVERIA SER USADO para realizar tarefas neste contexto. O contrato da classe base foi quebrado!");
    }
}
