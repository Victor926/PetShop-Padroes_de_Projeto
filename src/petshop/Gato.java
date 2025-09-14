/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author victo
 */
public class Gato extends Animal{
    
    //ATRIBUTOS
    private RacaGato raca;
    
    //METODOS
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
    
    public Gato(String nome, int idade, double peso, String sexo, RacaGato raca) {
        super(nome, "Cao", idade, peso, sexo);
        this.raca = raca;
    }

    public RacaGato getRaca() {
        return raca;
    }

    public void setRaca(RacaGato raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "id=" +getId() +
                ", nome='" + getNome() + '\'' +
                ", especie='" + getEspecie() + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + getIdade() +
                ", peso=" + getPeso() +
                ", sexo=" + getSexo() +
                '}';
    }
    
}
