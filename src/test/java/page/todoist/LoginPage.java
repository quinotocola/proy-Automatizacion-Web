package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox ponerMail = new TextBox(By.id("element-0"));

    public TextBox ponerPwd = new TextBox(By.id("element-3"));

    public Button loggear = new Button(By.id("start-email-login"));

    public void login (String mail, String pwd){
        ponerMail.setText(mail);
        ponerPwd.setText(pwd);
        loggear.click();

    }
}
