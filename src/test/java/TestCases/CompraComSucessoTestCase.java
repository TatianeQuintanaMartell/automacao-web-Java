//é o teste propriamente dito
package TestCases;
import Suporte.PrintScreen;
import Suporte.TesteBase;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import static Suporte.Relatorio.*;

public class CompraComSucessoTestCase extends TesteBase {

        private WebDriver driver = this.pegarDriver();

    LoginTask loginTask = new LoginTask(driver);
    SelecionaProdutosTask selecionaProdutosTask = new SelecionaProdutosTask(driver);
    DetalhaProdutoTask detalhaProdutoTask = new DetalhaProdutoTask(driver);
    SelecionaSeuCarrinhoTask selecionaSeuCarrinhoTask = new SelecionaSeuCarrinhoTask(driver);
    DetalhaSuasInformacoesTask detalhaSuasInformacoesTask = new DetalhaSuasInformacoesTask(driver);
    DetalhaVisaoGeralTask detalhaVisaoGeralTask = new DetalhaVisaoGeralTask(driver);
    FinishTask finishTask = new FinishTask(driver);


//    public static Object[][] loginTestData(){
//        return new Object[][] {{"standard_user","secret_sauce"}};
//    }

    //@Test
    @ParameterizedTest
   //@CsvFileSource(resources = "/login.csv", numLinesToSkip = 1) // procura de um arq csv, "1 numero de linhas para pular, resources é o local
    //@MethodSource("loginTestData") // procura de um métoso / retorna valor para o teste parametrizado nesse caso usamos uma matriz. método dataprovider tem q ser statico
    @MethodSource("Suporte.ClasseDeDados#loginTestData")
    public void realizarCompra(String usuario, String senha) throws IOException {
        try {
            extentTeste = extentRelatorio.createTest("Realiza Compra Com Sucesso");

            loginTask.realizarLogin(usuario,senha);
            selecionaProdutosTask.realizarSelecaoDeProdutos();
            detalhaProdutoTask.adicionarProdutoAoCarrinho();
            selecionaSeuCarrinhoTask.realizarVerificacaoDeSaida();
            detalhaSuasInformacoesTask.preencherInformacoes();
            detalhaVisaoGeralTask.terminarVisaoGeral();
            finishTask.finalizarCompra();
            Thread.sleep(2000);
        }
        catch (Exception e){
            extentTeste.log(Status.ERROR,e.getMessage(),PrintScreen.fazerCapturaDaFoto(driver));



        }


    }


}
