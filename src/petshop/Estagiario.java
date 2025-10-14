/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;

/**
 *
 * @author victo
 */
public class Estagiario extends Funcionario{
    // CONSTRUTOR
    public Estagiario(String nome) {
        super(nome);
    }

    // ADERÊNCIA AO Substituição de Liskov: Cumpre o contrato do tipo base 'Funcionario' 
    
    @Override
    public void realizarTarefa() {
        System.out.println(getNome() + " esta aprendendo e organizando documentos.");
    }
}
