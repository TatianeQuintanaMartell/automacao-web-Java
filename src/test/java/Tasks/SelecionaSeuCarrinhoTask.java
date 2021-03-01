package Tasks;

import PageObjects.DetalhaSuasInformacoesPage;
import PageObjects.SelecionaSeuCarrinhoPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelecionaSeuCarrinhoTask {
    private static WebDriver driver;
    private static SelecionaSeuCarrinhoPage selecionaSeuCarrinhoPage;
    private static Esperas esperas;
    private static DetalhaSuasInformacoesPage detalhaSuasInformacoesPage;


    public SelecionaSeuCarrinhoTask(WebDriver driver) {
        this.driver = driver;
        selecionaSeuCarrinhoPage = new SelecionaSeuCarrinhoPage(this.driver);
        esperas = new Esperas(this.driver);
        detalhaSuasInformacoesPage = new DetalhaSuasInformacoesPage(this.driver);
    }

    public void realizarVerificacaoDeSaida(){
        selecionaSeuCarrinhoPage.getBotaoVerificacaoDeSaida().click();
        validarSeuCarrinho();
    }
    public void validarSeuCarrinho(){
        WebElement verifica = esperas.esperarCarregarElemento(detalhaSuasInformacoesPage.getDescricaoPagina());
        Assertions.assertTrue(verifica.isDisplayed());
    }

}
