package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class messagesaction {

    public TextBox msgto = new TextBox(By.id("msgto"));

    public TextBox subject = new TextBox(By.id("msgsubject"));

    public TextBox mdgbody = new TextBox(By.id("msgbody"));

    public Button enviar = new Button(By.id("msgsend"));

    public messagesaction(){}

    public void sendmessage(String sendto, String asun, String messa){
        msgto.setText(sendto);
        subject.setText(asun);
        mdgbody.setText(messa);
        enviar.click();

    }
}
