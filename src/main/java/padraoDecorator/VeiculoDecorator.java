package padraoDecorator;

public abstract class VeiculoDecorator implements Veiculo {

    private Veiculo veiculo;

    public VeiculoDecorator(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public abstract float getPercentualAcrescimo();

    public float getPreco() {
        return this.veiculo.getPreco() * (1 + (this.getPercentualAcrescimo() / 100));
    }

    public abstract String getNomeItem();

    public String getConfiguracao() {
        return this.veiculo.getConfiguracao() + "/" + this.getNomeItem();
    }

}
