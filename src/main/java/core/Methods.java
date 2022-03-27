package core;

import io.appium.java_client.MobileElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Methods {
    protected WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10000L);

    protected void waitElement(By by) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(wait.until(ExpectedConditions.visibilityOf(DriverFactory.getDriver().findElement(by)))));
        } catch (Exception e) {
            System.out.println("Elemento nao localizado " + by + "\n");
            e.printStackTrace();
            fail();
        }
    }

    protected void clicar(By by) {
        try {
            waitElement(by);
            MobileElement element = DriverFactory.getDriver().findElement(by);
            element.click();
        } catch (Exception e) {
            System.out.println("\n");
            System.out.println("erro ao clicar no elemento desejado " + by);
            System.out.println("\n");
            e.printStackTrace();
        }
    }

    protected void preencherCampo(By by, String text) {
        try {
            waitElement(by);
            MobileElement element = DriverFactory.getDriver().findElement(by);
            element.clear();
            element.sendKeys(text);
        } catch (Exception e) {
            System.out.println("\n");
            System.out.println("Erro ao preencher campo desejado " + by);
            System.out.println("\n");
            e.printStackTrace();
        }
    }

    protected void validarMensagem(By by, String mensagem) {
        if (!mensagem.isEmpty()) {
            waitElement(by);
            assertEquals(mensagem, getTextElement(by));
        }
    }

    protected String getTextElement(By by) {
        waitElement(by);
        return DriverFactory.getDriver().findElement(by).getText();
    }

    protected void validarElementoEmTela(By by, boolean deveExistir) {
        boolean elementoExiste = DriverFactory.getDriver().findElement(by).isDisplayed();
        if (deveExistir) {
            Assert.assertTrue(elementoExiste);
        } else {
            Assert.assertFalse(elementoExiste);
        }
    }
}

