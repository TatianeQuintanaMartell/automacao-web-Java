package TestCases;

import Suporte.TesteBase;
import Tasks.*;
import org.openqa.selenium.WebDriver;

public class CompraAdicionandoTodosOsProdutosNoCarrinho extends TesteBase {
    private WebDriver driver = this.pegarDriver();

    LoginTask loginTask = new LoginTask(driver);
    SelecionaProdutosTask selecionaProdutosTask = new SelecionaProdutosTask(driver);
    DetalhaProdutoTask detalhaProdutoTask = new DetalhaProdutoTask(driver);
    SelecionaSeuCarrinhoTask selecionaSeuCarrinhoTask = new SelecionaSeuCarrinhoTask(driver);
    DetalhaSuasInformacoesTask detalhaSuasInformacoesTask = new DetalhaSuasInformacoesTask(driver);
    DetalhaVisaoGeralTask detalhaVisaoGeralTask = new DetalhaVisaoGeralTask(driver);
    FinishTask finishTask = new FinishTask(driver);
}
