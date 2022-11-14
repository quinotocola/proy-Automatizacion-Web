package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.yopmail.mailsection;
import page.yopmail.mainpage;
import page.yopmail.messagesaction;
import session.Session;
import util.GetProperties;

public class TestBaseY {

    mainpage mainPage = new mainpage();

    mailsection mailSection = new mailsection();

    messagesaction messageSaction = new messagesaction();

    String user= GetProperties.getInstance().getUser();
    String sendto= GetProperties.getInstance().getSendto();
    String asun= GetProperties.getInstance().getAsunto();
    String messa= GetProperties.getInstance().getMessage();



    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
