package actions;

import core.Methods;
import pages.HomePage;

public class HomeActions extends Methods {

    private HomePage homePage = new HomePage();

    public void acessarTelaLogin() {
        clicar(homePage.getBntCloseModalPerissaoLocalizacao());
        clicar(homePage.getBtnLogin());
    }
}
