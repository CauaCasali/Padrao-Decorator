package padraoDecorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveRetornarPrecoVeiculoBase() {
        Veiculo veiculo = new VeiculoBase(100000.0f);

        assertEquals(100000.0f, veiculo.getPreco());
    }

    @Test
    void deveRetornarPrecoComBancoCouro() {
        Veiculo veiculo = new BancoCouro(new VeiculoBase(100000.0f));

        assertEquals(115000.0f, veiculo.getPreco());
    }

    @Test
    void deveRetornarPrecoComTetoSolar() {
        Veiculo veiculo = new TetoSolar(new VeiculoBase(100000.0f));

        assertEquals(110000.0f, veiculo.getPreco());
    }

    @Test
    void deveRetornarPrecoComSomPremium() {
        Veiculo veiculo = new SomPremium(new VeiculoBase(100000.0f));

        assertEquals(125000.0f, veiculo.getPreco());
    }

    @Test
    void deveRetornarPrecoComBancoCouroMaisTetoSolar() {
        Veiculo veiculo = new TetoSolar(new BancoCouro(new VeiculoBase(100000.0f)));

        assertEquals(126500.0f, veiculo.getPreco());
    }

    @Test
    void deveRetornarPrecoComBancoCouroMaisSomPremium() {
        Veiculo veiculo = new SomPremium(new BancoCouro(new VeiculoBase(100000.0f)));

        assertEquals(143750.0f, veiculo.getPreco());
    }

    @Test
    void deveRetornarPrecoComTetoSolarMaisSomPremium() {
        Veiculo veiculo = new SomPremium(new TetoSolar(new VeiculoBase(100000.0f)));

        assertEquals(137500.0f, veiculo.getPreco());
    }

    @Test
    void deveRetornarPrecoComBancoCouroMaisTetoSolarMaisSomPremium() {
        Veiculo veiculo = new SomPremium(new TetoSolar(new BancoCouro(new VeiculoBase(100000.0f))));

        assertEquals(158125.0f, veiculo.getPreco());
    }

    @Test
    void deveRetornarConfiguracaoVeiculoBase() {
        Veiculo veiculo = new VeiculoBase(100000.0f);

        assertEquals("Modelo Base", veiculo.getConfiguracao());
    }

    @Test
    void deveRetornarConfiguracaoComBancoCouro() {
        Veiculo veiculo = new BancoCouro(new VeiculoBase(100000.0f));

        assertEquals("Modelo Base/Bancos de Couro", veiculo.getConfiguracao());
    }

    @Test
    void deveRetornarConfiguracaoComBancoCouroMaisTetoSolar() {
        Veiculo veiculo = new TetoSolar(new BancoCouro(new VeiculoBase(100000.0f)));

        assertEquals("Modelo Base/Bancos de Couro/Teto Solar", veiculo.getConfiguracao());
    }

    @Test
    void deveRetornarConfiguracaoComBancoCouroMaisTetoSolarMaisSomPremium() {
        Veiculo veiculo = new SomPremium(new TetoSolar(new BancoCouro(new VeiculoBase(100000.0f))));

        assertEquals("Modelo Base/Bancos de Couro/Teto Solar/Som Premium", veiculo.getConfiguracao());
    }

}
