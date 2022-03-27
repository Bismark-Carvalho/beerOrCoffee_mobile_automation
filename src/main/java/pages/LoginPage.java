package pages;

import org.openqa.selenium.By;

public class LoginPage {

    private By campoEmail = By.xpath("//android.widget.EditText[@text='name@enterprise.com']");
    private By campoSenha = By.xpath("//android.widget.EditText[@text='••••••••']");
    private By btnAccess = By.xpath("//android.widget.TextView[@text='Access']");
    private By msgUsuarioSenhaInvalido = By.xpath("//android.widget.TextView[@text='CLOSE']/../../android.widget.TextView");
    private By msmEmailInvalido = By.xpath("//android.widget.TextView[@text='Enter a valid email']");
    private By msgSenhaInvalida = By.xpath("//android.widget.TextView[@text='Enter your password']");
    private By btnAccessWithSSO = By.xpath("//android.widget.TextView[@text='Access with SSO']");
    private By btnEsqueceuSenha = By.xpath("//android.widget.TextView[@text='Forgot your password?']");
    private By btnCriarConta = By.xpath("//android.widget.TextView[@text='Create an account']");

    public By getCampoEmail() {
        return campoEmail;
    }

    public By getCampoSenha() {
        return campoSenha;
    }

    public By getBtnAccess() {
        return btnAccess;
    }

    public By getMsgUsuarioSenhaInvalido() {
        return msgUsuarioSenhaInvalido;
    }

    public By getMsgSenhaInvalida() {
        return msgSenhaInvalida;
    }

    public By getMsmEmailInvalido() {
        return msmEmailInvalido;
    }

    public By getBtnAccessWithSSO() {
        return btnAccessWithSSO;
    }

    public By getBtnEsqueceuSenha() {
        return btnEsqueceuSenha;
    }

    public By getBtnCriarConta() {
        return btnCriarConta;
    }
}
