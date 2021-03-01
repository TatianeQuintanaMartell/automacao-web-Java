package Suporte;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static Suporte.Relatorio.*;

public class TesteBase extends GerenciadorDriver{
    private static WebDriver driver;
    private static OperacaoDeArquivos operacaoDeArquivos = new OperacaoDeArquivos();
    private String PATH = System.getProperty("user.dir") + File.separator + "src" + File.separator +
            "main" + File.separator + "resources" + File.separator + "URL.properties";
    private String propriedades = "URL.index";

    public static WebDriver pegarDriver(){

        driver = setDriver(TipoDriver.CHROME);
        return driver;

    }

    @BeforeEach
    public void iniciar(){

       // pegarDriver().get(URL);
        pegarDriver().get(operacaoDeArquivos.leituraDasPropriedades(PATH , propriedades));
        configurarRelatorioExtent();

    }

    @AfterEach
  //  @AfterAll
    public void terminar(){
        fecharDriver();
        fecharRelatorio();
    }


}
