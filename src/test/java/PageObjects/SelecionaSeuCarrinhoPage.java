package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelecionaSeuCarrinhoPage {
    private WebDriver driver;

    public SelecionaSeuCarrinhoPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getBotaoVerificacaoDeSaida(){
        return driver.findElement(By.cssSelector(".btn_action.checkout_button"));
    }
    public WebElement getDescricaoDoProduto(){
        return driver.findElement(By.className("inventory_item_name"));
    }


}
