package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {
    private WebDriver driver;

    public FinishPage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getTituloDaPagina(){
        return driver.findElement(By.className("bm-burger-button"));

    }
    public WebElement getOpcaoSair(){
        return driver.findElement(By.id("logout_sidebar_link"));

    }

}
