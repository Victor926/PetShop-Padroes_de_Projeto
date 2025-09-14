/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author victo
 */
public class Atendimento {
    //ATRIBUTOS
    private Cliente cliente;
    private Animal animal;
    private Servico servico;
    private Funcionario funcionario;
    private String data;
    
    //CONSTRUTOR
    public Atendimento(Cliente cliente, Animal animal, Servico servico, Funcionario funcionario, String data) {
        this.cliente = cliente;
        this.animal = animal;
        this.servico = servico;
        this.funcionario = funcionario;
        this.data = data;
    }
    
    //METODO COM POLIMORFISMO
    public void descreverAtendimento() {
        System.out.println("--- Detalhes do Atendimento ---");
        System.out.println("Data: " + this.data);
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Animal: " + this.animal.getNome() + " (" + this.animal.getEspecie() + ")");
        System.out.println("Servico: " + this.servico.getDescricao());
        System.out.println("Responsavel: " + this.funcionario.getNome() + " (ID: " + this.funcionario.getId() + ")");
        
        System.out.print("O animal faz: ");
        this.animal.emitirSom();
        System.out.println("\n");
        
        System.out.print("Acao do funcionario: ");
        this.funcionario.realizarTarefa(); 
        System.out.println("\n");
    }

    // GETTERS
    public Cliente getCliente() { 
        return cliente; 
    }
    
    public Animal getAnimal() { 
        return animal; 
    }
    
    public Servico getServico() { 
        return servico; 
    }
    
    public Funcionario getFuncionario() { 
        return funcionario; 
    }
    
    public String getData() { 
        return data; 
    }
    
}
