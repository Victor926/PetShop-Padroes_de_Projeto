package petshop;

/**
 * Decorator Concreto 1: Adiciona um custo fixo de embalagem especial.
 */
public class CustoEmbalagemDecorator extends ProdutoDecorator {

    private static final double CUSTO_FIXO = 5.00;

    public CustoEmbalagemDecorator(IProduto produtoDecorado) {
        super(produtoDecorado);
    }

    @Override
    public String getNome() {
        return produtoDecorado.getNome() + " + Embalagem Especial";
    }

    @Override
    public double getPreco() {
        return produtoDecorado.getPreco() + CUSTO_FIXO;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Exibe os detalhes originais do produto
        System.out.println("[Decorador] Custo Fixo de Embalagem: R$" + CUSTO_FIXO);
    }
}