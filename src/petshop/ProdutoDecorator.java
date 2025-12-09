package petshop;

public abstract class ProdutoDecorator implements IProduto {

    protected IProduto produtoDecorado;

    public ProdutoDecorator(IProduto produtoDecorado) {
        this.produtoDecorado = produtoDecorado;
    }

    @Override
    public String getNome() {
        return produtoDecorado.getNome();
    }

    @Override
    public abstract double getPreco();

    
    @Override
    public void exibirDetalhes() {
        produtoDecorado.exibirDetalhes();
    }
}