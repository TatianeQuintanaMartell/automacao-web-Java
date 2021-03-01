//mapeia elementos
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetalhaProdutoPage {

    private  WebDriver driver;

    public DetalhaProdutoPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getRotuloDoProduto(){
        return driver.findElement(By.className("inventory_details_name"));
    }

    public WebElement getAdicionarAoCarrinho(){
        return driver.findElement(By.cssSelector(".btn_primary"));
    }
    public WebElement getVerificarCarrinho(){
        return driver.findElement(By.id("shopping_cart_container"));
    }

}
