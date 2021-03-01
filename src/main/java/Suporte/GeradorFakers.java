package Suporte;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class GeradorFakers {
    private Faker fake;
    private String primeiroNome;
    private String segundoNome;
    private String cep;
    private String email;
    private String celular;

    public GeradorFakers(WebDriver driver){
        fake = new Faker(new Locale("pt-BR"));
    }

    public String getPrimeiroNome() {
        primeiroNome = fake.name().firstName();
        return primeiroNome;
    }

    public String getSegundoNome() {
        segundoNome = fake.name().lastName();
        return segundoNome;
    }

    public String getCep() {
        cep = fake.address().zipCode();
        return cep;
    }

    public String getEmail() {
        email = fake.internet().emailAddress();
        return email;
    }

    public String getCelular() {
        celular = fake.phoneNumber().cellPhone();
        return celular;
    }
}
