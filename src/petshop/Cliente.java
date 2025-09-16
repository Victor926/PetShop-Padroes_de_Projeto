/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author victo
 */
public class Cliente implements Detalhavel{
    // ATRIBUTOS
    private String nome;
    private String telefone;
    private List<Animal> animaisDeEstimacao;

    // CONSTRUTOR
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.animaisDeEstimacao = new ArrayList<>();
    }

    // MÉTODOS
    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Cliente ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Pets cadastrados: " + this.animaisDeEstimacao.size());
        System.out.println("---------------------------");
    }
    //RETORNAR LISTA
    public List<Animal> getAnimaisDeEstimacao() {
        return animaisDeEstimacao;
    }
    
    //ADICIONAR ANIMAL
    public void adicionarAnimal(Animal animal) {
        this.animaisDeEstimacao.add(animal);
        System.out.println(animal.getNome() + " foi adicionado a lista de animais de " + this.nome + ".");
    }

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", telefone=" + telefone + '}';
    }
}
