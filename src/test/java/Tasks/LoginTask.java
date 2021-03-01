package Tasks;

import PageObjects.LoginPage;
import PageObjects.SelecionaProdutosPage;
import Suporte.Esperas;
import Suporte.PrintScreen;
import Suporte.Relatorio;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginTask {

    private static WebDriver driver;
    private static LoginPage login;
    private static Esperas esperas;
    private static SelecionaProdutosPage seleciona;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        login = new LoginPage(this.driver);
        esperas = new Esperas(this.driver);
        seleciona = new SelecionaProdutosPage(this.driver);

    }

    public void realizarLogin(String usuario, String senha){
        login.getNomeCampoDoUsuario().sendKeys(usuario);
        login.getCampoSenhaDoUsuario().sendKeys(senha);
        login.getBotaoDeLogin().click();
        validarLogin();
    }

    private void validarLogin() {
        try {
            esperas.esperarCarregarElemento(seleciona.getTituloDaPaginaDeProdutos());
            String cabecalho = seleciona.getTituloDaPaginaDeProdutos().getText();
            Assertions.assertEquals("Products",cabecalho);
            Relatorio.extentTeste.log(Status.PASS, "Pagina Inicial Carregada com Sucesso" + cabecalho,
                    PrintScreen.fazerCapturaDaFoto(driver));
        }
        catch (Exception e){
            Relatorio.extentTeste.log(Status.FAIL,"Login Falhou!" ,PrintScreen.fazerCapturaDaFotoBase64(driver));

        }


    }



}
