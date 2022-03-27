package actions;

import core.Methods;
import pages.CriacaoContaPage;
import pages.LoginPage;
import pages.RecuperacaoSenhaPage;

public class LoginActions extends Methods {
    private final LoginPage loginPage = new LoginPage();
    private final RecuperacaoSenhaPage recuperacaoSenhaPage = new RecuperacaoSenhaPage();
    private final CriacaoContaPage criacaoContaPage = new CriacaoContaPage();

    public void preencherCampoEmail(String email) {
        preencherCampo(loginPage.getCampoEmail(), email);
    }

    public void preencherCampoSenha(String senha) {
        preencherCampo(loginPage.getCampoSenha(), senha);
    }

    public void acionarBtnAccess() {
        clicar(loginPage.getBtnAccess());
    }

    public void validarMensagemEmailSenhaInvalido(String arg0) {
        validarMensagem(loginPage.getMsgUsuarioSenhaInvalido(), arg0);
    }


    public void validarErroCampoEmail(String mensagem1) {
        validarMensagem(loginPage.getMsmEmailInvalido(), mensagem1);
    }

    public void validarErroCampoSenha(String mensagem2) {
        validarMensagem(loginPage.getMsgSenhaInvalida(), mensagem2);
    }

    public void acionarBtnRecuperacaoSenha() {
        clicar(loginPage.getBtnEsqueceuSenha());
    }

    public void validarTelaRecuperacaoSenha() {
        validarElementoEmTela(recuperacaoSenhaPage.getTituloPage(), true);
    }


    public void acionarBtnCriacaoConta() {
        clicar(loginPage.getBtnCriarConta());
    }

    public void validarTelaCriacaoConta() {
        validarElementoEmTela(criacaoContaPage.getTituloCriacaContaPage(), true);
    }
}
