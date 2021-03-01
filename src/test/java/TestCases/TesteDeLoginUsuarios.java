package TestCases;

import Suporte.PrintScreen;
import Suporte.TesteBase;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static Suporte.Relatorio.extentRelatorio;
import static Suporte.Relatorio.extentTeste;

public class TesteDeLoginUsuarios extends TesteBase {
    private WebDriver driver = this.pegarDriver();

    LoginTask loginTask = new LoginTask(driver);


    @ParameterizedTest
    @CsvFileSource(resources = "/login.csv", numLinesToSkip = 1)
    public void realizarCompra(String usuario, String senha) throws IOException {
        try {
            extentTeste = extentRelatorio.createTest("Teste de Login De Usuários ");

            loginTask.realizarLogin(usuario, senha);

            Thread.sleep(2000);
        } catch (Exception e) {
            extentTeste.log(Status.ERROR, e.getMessage(), PrintScreen.fazerCapturaDaFoto(driver));


        }
    }
}
