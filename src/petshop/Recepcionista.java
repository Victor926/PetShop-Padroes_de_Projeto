package petshop;

public class Recepcionista extends ColleagueFuncionario {
    
    // O construtor agora exige o Mediador
    public Recepcionista(String nome, IMediadorAtendimento mediador) {
        super(nome, mediador);
    }

    // METODOS (Mantém a lógica de tarefa original)
    @Override
    public void realizarTarefa() {
        System.out.println(getNome() + " esta agendando um horario e recebendo um cliente.");
    }

    // MÉTODO DE COMUNICAÇÃO DE PARTIDA (Notifica o Mediator)
    public void solicitarAgendamento() {
        if (mediador == null) {
            System.out.println("[Recepcionista - ERRO] Não e possivel solicitar: Mediador nao esta ligado.");
            return;
        }
        // Chamada ao Mediador (passa 'this' para que o Mediador saiba quem notificou)
        System.out.println("\n[Recepcionista - Acao de Partida] " + getNome() + " solicita AGENDAMENTO de nova consulta.");
        mediador.notificar(this, "AGENDAR_CONSULTA");
    }
    
    // MÉTODO DE RESPOSTA (Reage à notificação do Mediator)
    @Override
    public void solicitarAcao(String acao) {
        if (acao.equals("LIBERAR_PROXIMO")) {
            System.out.println("<<< [Recepcionista - Acao Recebida] " + getNome() + " inicia o check-in do proximo cliente.");
        }
    }
}