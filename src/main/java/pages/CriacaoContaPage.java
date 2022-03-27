package pages;

import org.openqa.selenium.By;

public class CriacaoContaPage {

    private By tituloCriacaContaPage = By.xpath("//android.widget.TextView[@text='Name']/../android.widget.TextView[1]");


    public By getTituloCriacaContaPage() {
        return tituloCriacaContaPage;
    }
}
