package petshop;

public class CustoGarantiaEstendidaDecorator extends ProdutoDecorator {

    private static final double PERCENTUAL_GARANTIA = 0.10; // 10%

    public CustoGarantiaEstendidaDecorator(IProduto produtoDecorado) {
        super(produtoDecorado);
    }

    @Override
    public String getNome() {
        return produtoDecorado.getNome() + " + Garantia Estendida (10%)";
    }

    @Override
    public double getPreco() {
        double precoBase = produtoDecorado.getPreco();
        return precoBase * (1 + PERCENTUAL_GARANTIA);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); 
        System.out.println("[Decorador] Adicionado 10% de Garantia Estendida.");
    }
}