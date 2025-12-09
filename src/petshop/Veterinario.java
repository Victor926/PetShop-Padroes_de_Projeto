package petshop;

public class Veterinario extends ColleagueFuncionario {
    
    // O construtor agora exige o Mediador
    public Veterinario(String nome, IMediadorAtendimento mediador) {
        super(nome, mediador);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(getNome() + " esta realizando um diagnostico clinico.");
    }

    // MÉTODO DE COMUNICAÇÃO DE PARTIDA (Notifica o Mediator)
    public void terminarAtendimento() {
        if (mediador == null) {
            System.out.println("[Veterinario - ERRO] Nao eh possivel notificar: Mediador nao esta ligado.");
            return;
        }
        // Chamada ao Mediador
        System.out.println("\n[Veterinario - Acao de Partida] " + getNome() + " notifica o Mediador: Atendimento CONCLUIDO.");
        mediador.notificar(this, "FIM_ATENDIMENTO");
    }
    
    // MÉTODO DE RESPOSTA (Reage à notificação do Mediator)
    @Override
    public void solicitarAcao(String acao) {
        if (acao.equals("PREPARAR_DIAGNOSTICO")) {
            System.out.println("<<< [Veterinario - Acao Recebida] " + getNome() + " INICIA o preparo para um novo diagnostico.");
        }
    }
}