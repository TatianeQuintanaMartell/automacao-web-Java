package Tasks;

import PageObjects.DetalhaProdutoPage;
import PageObjects.SelecionaProdutosPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelecionaProdutosTask {
    private static WebDriver driver;
    private static SelecionaProdutosPage selecionaProdutosPage;
    private static Esperas esperas;
    private static DetalhaProdutoPage detalhaProdutoPage;


    public SelecionaProdutosTask(WebDriver driver) {
        this.driver = driver;
        selecionaProdutosPage = new SelecionaProdutosPage(this.driver);
        detalhaProdutoPage = new DetalhaProdutoPage(this.driver);
        esperas = new Esperas(this.driver);

    }

        public void realizarSelecaoDeProdutos(){
            selecionaProdutosPage.getLinkDaImagemDoProduto().click();
            validarSelecaoDeProdutos();
        }

    public void validarSelecaoDeProdutos(){
        WebElement verifica = esperas.esperarCarregarElemento(detalhaProdutoPage.getRotuloDoProduto());
        Assertions.assertTrue(verifica.isDisplayed());
    }

}


