package steps;

import actions.HomeActions;
import actions.LoginActions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

    private HomeActions homePage = new HomeActions();
    private LoginActions loginActions = new LoginActions();

    @Dado("que estou na tela de login")
    public void queEstouNaTelaDeLogin() {
        homePage.acessarTelaLogin();
    }

    @Quando("informar o email {string}")
    public void informarOEmail(String email) {
        loginActions.preencherCampoEmail(email);
    }

    @E("informar a senha {string}")
    public void informarASenha(String senha) {
        loginActions.preencherCampoSenha(senha);
    }

    @E("clicar no botao ACCESS")
    public void clicarNoBotaoACCESS() {
        loginActions.acionarBtnAccess();
    }

    @Entao("o sistema deve apresentar a seguinte mensagem {string}")
    public void oSistemaDeveApresentarASeguinteMensagem(String arg0) {
        loginActions.validarMensagemEmailSenhaInvalido(arg0);
    }

    @Entao("o sistema deve apresentar as seguintes mensagens de erro {string} e {string}")
    public void oSistemaDeveApresentarErroNosCamposEmailESenha(String mensagem1, String mensagem2) {
        loginActions.validarErroCampoEmail(mensagem1);
        loginActions.validarErroCampoSenha(mensagem2);
    }

    @E("clicar no botao FORGOT YOUR PASSWORD")
    public void clicarNoBotaoFORGOTYOURPASSWORD() {
        loginActions.acionarBtnRecuperacaoSenha();
    }

    @Entao("o sistema deverar abrir a tela de recuperacao de senha")
    public void oSistemaDeverarAbrirATelaDeRecuperacaoDeSenha() {
        loginActions.validarTelaRecuperacaoSenha();
    }

    @E("clicar no botao CREATE AN ACCOUNT")
    public void clicarNoBotaoCREATEANACCOUNT() {
        loginActions.acionarBtnCriacaoConta();
    }

    @Entao("o sistema deverar abrir a tela de criacao de conta")
    public void oSistemaDeverarAbrirATelaDeCriacaoDeConta() {
        loginActions.validarTelaCriacaoConta();
    }
}
