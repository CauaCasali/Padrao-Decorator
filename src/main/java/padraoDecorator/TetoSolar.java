package padraoDecorator;

public class TetoSolar extends VeiculoDecorator {

    public TetoSolar(Veiculo veiculo) {
        super(veiculo);
    }

    public float getPercentualAcrescimo() {
        return 10.0f;
    }

    public String getNomeItem() {
        return "Teto Solar";
    }

}
