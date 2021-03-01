package Suporte;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class OperacaoDeArquivos {
    public String leituraDasPropriedades(String arquivo, String propriedade){
        try(InputStream input = new FileInputStream(arquivo)){
                Properties prop = new Properties();
                prop.load(input);
                return prop.getProperty(propriedade);

            }
        catch (IOException e){
            System.out.println("Arquivo de Propriedades não encontrado");
            e.printStackTrace();
        }
        return null;

    }
}
