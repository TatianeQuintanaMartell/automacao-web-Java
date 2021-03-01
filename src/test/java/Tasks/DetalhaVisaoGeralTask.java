package Tasks;

import PageObjects.DetalhaVisaoGeralPage;
import PageObjects.FinishPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetalhaVisaoGeralTask {
    private static WebDriver driver;
    private static DetalhaVisaoGeralPage detalhaVisaoGeralPage;
    private static Esperas esperas;
    private static FinishPage finishPage;

    public DetalhaVisaoGeralTask(WebDriver driver){
        this.driver = driver;
        detalhaVisaoGeralPage = new DetalhaVisaoGeralPage(this.driver);
        esperas = new Esperas(this.driver);
        finishPage = new FinishPage(this.driver);
    }

    public void terminarVisaoGeral(){
        detalhaVisaoGeralPage.getBotaoTerminar().click();
        verificarVisaoGeral();
    }

    public void verificarVisaoGeral(){
        WebElement verifica = esperas.esperarCarregarElemento(finishPage.getTituloDaPagina());
        Assertions.assertTrue(verifica.isDisplayed());
    }

}
