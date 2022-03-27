package pages;

import org.openqa.selenium.By;

public class HomePage {

    private By bntCloseModalPerissaoLocalizacao = By.xpath("//android.widget.TextView[@text='No']");
    private By btnLogin = By.xpath("//android.widget.TextView[@text='Login']");


    public By getBntCloseModalPerissaoLocalizacao() {
        return bntCloseModalPerissaoLocalizacao;
    }

    public By getBtnLogin() {
        return btnLogin;
    }
}
