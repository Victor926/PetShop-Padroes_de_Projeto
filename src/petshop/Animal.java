/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author victo
 */
public abstract class Animal {
    
    //ATRIBUTOS
    private String nome;
    private String especie;
    private int idade;
    private double peso;
    private String sexo;
    private static int numeroTotal = 1;
    private int id;

    
    //CONSTRUTOR
    public Animal(String nome, String especie, int idade, double peso, String sexo) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.id = numeroTotal;
        numeroTotal++;
    }

    //METODOS
    public abstract void emitirSom();
    
    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
      
    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", especie=" + especie + ", idade=" + idade + ", peso=" + peso + ", sexo=" + sexo + ", id=" + id + '}';
    }
     
}
