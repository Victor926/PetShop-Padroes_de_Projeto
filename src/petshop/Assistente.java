/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author victo
 */
public class Assistente extends Funcionario{
    
    //CONSTRUTOR
    public Assistente(String nome) {
        super(nome);
    }
    
    //METODOS
    @Override
    public void realizarTarefa() {
        System.out.println(getNome() + " esta auxiliando no atendimento e na preparação do ambiente.");
    }
}
