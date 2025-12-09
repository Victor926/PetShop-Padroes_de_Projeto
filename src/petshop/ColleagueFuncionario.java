package petshop;

/**
 * Colleague Abstrato. Estende Funcionario e adiciona a referência ao IMediadorAtendimento.
 */
public abstract class ColleagueFuncionario extends Funcionario {

    // Referência ao Mediador
    public IMediadorAtendimento mediador; // Tornamos público para injeção externa (no PetShop.java)

    public ColleagueFuncionario(String nome, IMediadorAtendimento mediador) {
        super(nome);
        this.mediador = mediador;
    }

    public abstract void solicitarAcao(String acao);
}
