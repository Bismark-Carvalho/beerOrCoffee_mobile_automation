package pages;

import org.openqa.selenium.By;

public class RecuperacaoSenhaPage {
    private By tituloPage = By.xpath("//android.widget.TextView[@text='Recover Password']");

    public By getTituloPage() {
        return tituloPage;
    }
}
