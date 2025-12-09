/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package petshop;

/**
 * Interface do Mediator (Torre de Comando - Livro 04).
 * Define o contrato para comunicação entre os colegas.
 */
public interface IMediadorAtendimento {
    /**
     * Usado pelos colegas para notificar o mediador sobre uma ação/estado.
     */
    void notificar(ColleagueFuncionario colega, String evento);
}