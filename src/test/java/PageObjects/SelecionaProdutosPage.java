package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelecionaProdutosPage {

    private WebDriver driver;

    public SelecionaProdutosPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLinkDaImagemDoProduto(){
        return driver.findElement(By.id("item_4_title_link"));
    }

    public WebElement getTituloDaPaginaDeProdutos(){
        return  driver.findElement(By.className("product_label"));
    }


}
