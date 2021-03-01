//metodos para validar e realizar interações
package Tasks;

import PageObjects.DetalhaProdutoPage;
import PageObjects.SelecionaProdutosPage;
import PageObjects.SelecionaSeuCarrinhoPage;
import Suporte.Esperas;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class    DetalhaProdutoTask {
    private static WebDriver driver;
    private static DetalhaProdutoPage detalhaProdutoPage;
    private static Esperas esperas;
    private static SelecionaSeuCarrinhoPage selecionaSeuCarrinhoPage;

    public DetalhaProdutoTask(WebDriver driver){
        this.driver = driver;
        detalhaProdutoPage = new DetalhaProdutoPage(this.driver);
        esperas = new Esperas(this.driver);
        selecionaSeuCarrinhoPage = new SelecionaSeuCarrinhoPage(this.driver);
    }

    public void adicionarProdutoAoCarrinho(){
        detalhaProdutoPage.getAdicionarAoCarrinho().click();
        detalhaProdutoPage.getVerificarCarrinho().click();
        realizarVerificacaoDoCarrinho();
    }
    public void realizarVerificacaoDoCarrinho(){
        WebElement verifica = esperas.esperarCarregarElemento(selecionaSeuCarrinhoPage.getDescricaoDoProduto());
        Assertions.assertTrue(verifica.isDisplayed());
    }
}
