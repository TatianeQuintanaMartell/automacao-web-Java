package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetalhaSuasInformacoesPage {
    private WebDriver driver;

    public DetalhaSuasInformacoesPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getPrimeiroNome(){
        return driver.findElement(By.id("first-name"));
    }
    public WebElement getUltimoNome(){
        return  driver.findElement(By.id("last-name"));
    }
    public WebElement getCEP(){
        return driver.findElement(By.id("postal-code"));
    }
    public WebElement getBotaoContinue(){
        return driver.findElement(By.className("btn_primary"));
    }
    public WebElement getDescricaoPagina(){
        return driver.findElement(By.className("subheader"));
    }


}
