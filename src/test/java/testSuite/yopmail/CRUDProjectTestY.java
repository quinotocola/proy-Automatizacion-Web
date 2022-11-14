package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.FluentWait;

public class CRUDProjectTestY extends TestBaseY{

    @Test
    public void verifyTest() throws InterruptedException {

        mainPage.mailCreate.setText(user);
        mainPage.createMail.click();
        mailSection.newMail.click();
        Thread.sleep(5000);
        messageSaction.msgto.setText(sendto);
        messageSaction.subject.setText(asun);
        messageSaction.mdgbody.setText(messa);
        messageSaction.enviar.click();
        mailSection.refresh.click();


    }
}
