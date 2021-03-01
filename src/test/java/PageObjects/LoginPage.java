package PageObjects;

import Suporte.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private Esperas esperas;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        esperas = new Esperas(this.driver);
    }

    public WebElement getNomeCampoDoUsuario(){
        WebElement campoUsuario = driver.findElement(By.xpath("//div[@class='login-box']/form/input[@id='user-name']"));
        return campoUsuario;
    }

    public WebElement getCampoSenhaDoUsuario(){
        return esperas.esperarVisibilidadeDoElemento(By.id("password"));

    }

    public WebElement getBotaoDeLogin(){
        return driver.findElement(By.id("login-button"));
    }

    public WebElement getLogo(){
        return  driver.findElement(By.className("bot_column"));
    }

    public WebElement getLoginLogo(){
        return  driver.findElement(By.className("login_logo"));

    }

}
