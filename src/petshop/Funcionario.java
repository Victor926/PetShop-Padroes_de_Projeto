/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author victo
 */
public abstract class Funcionario {
    //ATRIBUTOS
    private String nome;
    private int id;
    private static int numeroTotal = 1;

    //CONSTRUTOR
    public Funcionario(String nome) {
        this.nome = nome;
        this.id = numeroTotal;
        numeroTotal++;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
    
    //METODO ABSTRATO
    
    public abstract void realizarTarefa();
    
    @Override
    public String toString() {
        return "Funcionario{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               '}';
    }
}
