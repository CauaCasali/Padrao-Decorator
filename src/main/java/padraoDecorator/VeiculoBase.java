package padraoDecorator;

public class VeiculoBase implements Veiculo {

    public float preco;

    public VeiculoBase() {}

    public VeiculoBase(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getConfiguracao() {
        return "Modelo Base";
    }

}
