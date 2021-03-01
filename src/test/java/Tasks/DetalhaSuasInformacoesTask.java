package Tasks;

import PageObjects.DetalhaVisaoGeralPage;
import PageObjects.DetalhaSuasInformacoesPage;
import Suporte.Esperas;
import Suporte.GeradorFakers;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetalhaSuasInformacoesTask {
    private static WebDriver driver;
    private static DetalhaSuasInformacoesPage detalhaSuasInformacoesPage;
    private static Esperas esperas;
    private static DetalhaVisaoGeralPage detalhaVisaoGeralPage;
    private static GeradorFakers geradorFakers;

    public DetalhaSuasInformacoesTask(WebDriver driver) {
        this.driver = driver;
        detalhaSuasInformacoesPage = new DetalhaSuasInformacoesPage(this.driver);
        esperas = new Esperas(this.driver);
        detalhaVisaoGeralPage = new DetalhaVisaoGeralPage(this.driver);
        geradorFakers = new GeradorFakers(this.driver);

    }
    public void preencherInformacoes(){
       // detalhaSuasInformacoesPage.getPrimeiroNome().sendKeys("Tatiane");
        detalhaSuasInformacoesPage.getPrimeiroNome().sendKeys(geradorFakers.getPrimeiroNome());
        detalhaSuasInformacoesPage.getUltimoNome().sendKeys(geradorFakers.getSegundoNome());
        detalhaSuasInformacoesPage.getCEP().sendKeys(geradorFakers.getCep());
        detalhaSuasInformacoesPage.getBotaoContinue().click();
        validarPreenchimentoDeInformacoes();
    }

    public void validarPreenchimentoDeInformacoes(){
        WebElement verifica = esperas.esperarCarregarElemento(detalhaVisaoGeralPage.getDescricaoDoProduto());
        Assertions.assertTrue(verifica.isDisplayed());
    }


}
