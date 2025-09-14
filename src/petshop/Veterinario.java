/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author victo
 */
public class Veterinario extends Funcionario{
    
    public Veterinario(String nome) {
        super(nome);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(getNome() + " esta realizando um diagnostico clinico.");
    }
}
