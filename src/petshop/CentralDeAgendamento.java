package petshop;

import java.util.Random;

/**
 * Mediator Concreto. Contém a lógica para gerenciar as interações entre a Recepcionista e o Veterinário.
 */
public class CentralDeAgendamento implements IMediadorAtendimento {

    private ColleagueFuncionario recepcionista;
    private ColleagueFuncionario veterinario;
    
    // Simula uma regra de negócio complexa (ocupação, escala, etc.)
    private boolean isVeterinarioOcupado() {
        return new Random().nextBoolean();
    }

    public CentralDeAgendamento(ColleagueFuncionario recepcionista, ColleagueFuncionario veterinario) {
        this.recepcionista = recepcionista;
        this.veterinario = veterinario;
    }

    // O método notificar deve conter a lógica de negócio do Mediator
    @Override
    public void notificar(ColleagueFuncionario colega, String evento) {
        System.out.println("\nMediador <" + colega.getNome() + "> notifica evento: " + evento);
        
        // REGRAS DE NEGÓCIO DA CENTRAL
        
        // 1. Se a Recepcionista solicita um agendamento
        if (colega == recepcionista && evento.equals("AGENDAR_CONSULTA")) {
            System.out.println(">>> Central: Verificando disponibilidade do Veterinario...");
            
            if (isVeterinarioOcupado()) {
                System.out.println("!!! CENTRAL: Dr. " + veterinario.getNome() + " Ocupado. Agendamento em espera.");
            } else {
                System.out.println(">>> CENTRAL: Veterinario disponivel. Repassando a solicitação.");
                veterinario.solicitarAcao("PREPARAR_DIAGNOSTICO");
            }
        } 
        
        // 2. Se o Veterinário notifica que terminou o atendimento
        else if (colega == veterinario && evento.equals("FIM_ATENDIMENTO")) {
            System.out.println(">>> CENTRAL: Atendimento concluido. Notificando Recepcionista.");
            recepcionista.solicitarAcao("LIBERAR_PROXIMO");
        }
        
        // Se houver algum evento não tratado que ainda lança a exceção, este bloco garante que
        // não seja o caso. Remova a linha abaixo se você tiver mais lógica para adicionar
        // throw new UnsupportedOperationException("Not supported yet."); // ESTA LINHA CAUSA O ERRO E DEVE SER REMOVIDA
    }
}