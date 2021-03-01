package Tasks;

import PageObjects.FinishPage;
import PageObjects.LoginPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishTask {
    private static WebDriver driver;
    private static FinishPage finishPage;
    private static Esperas esperas;
    private static LoginPage loginPage;

    public FinishTask(WebDriver driver){
        this.driver = driver;
        finishPage = new FinishPage(this.driver);
        loginPage = new LoginPage(this.driver);

    }

    public void finalizarCompra(){
        finishPage.getTituloDaPagina().click();
        finishPage.getOpcaoSair().click();
        validarSaidadoSite();
    }
    public void validarSaidadoSite(){
        WebElement verifica = esperas.esperarCarregarElemento(loginPage.getLogo());
        Assertions.assertTrue(verifica.isDisplayed());


    }
}
