/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author victo
 */
public class Cao extends Animal{
    
    //ATRIBUTOS
    private RacaCao raca;
    
    //METODOS
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
    
    public Cao(String nome, int idade, double peso, String sexo, RacaCao raca) {
        super(nome, "Cao", idade, peso, sexo);
        this.raca = raca;
    }

    public RacaCao getRaca() {
        return raca;
    }

    public void setRaca(RacaCao raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", especie='" + getEspecie() + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + getIdade() +
                ", peso=" + getPeso() +
                ", sexo=" + getSexo() +
                '}';
    }
    
}
