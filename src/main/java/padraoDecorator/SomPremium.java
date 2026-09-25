package padraoDecorator;

public class SomPremium extends VeiculoDecorator {

    public SomPremium(Veiculo veiculo) {
        super(veiculo);
    }

    public float getPercentualAcrescimo() {
        return 25.0f;
    }

    public String getNomeItem() {
        return "Som Premium";
    }

}
