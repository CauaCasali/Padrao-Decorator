package padraoDecorator;

public class BancoCouro extends VeiculoDecorator {

    public BancoCouro(Veiculo veiculo) {
        super(veiculo);
    }

    public float getPercentualAcrescimo() {
        return 15.0f;
    }

    public String getNomeItem() {
        return "Bancos de Couro";
    }

}
