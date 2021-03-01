//cria a pasta onde vai ficar o relatorio
package Suporte;

import java.io.File;

public class CriarPasta {

    public static void criarPastaParaRelatorio (String caminho){
        File diretorioRelatorio =  new File(caminho);
        if (!diretorioRelatorio.exists()){
            diretorioRelatorio.mkdir();
        }
    }
}
