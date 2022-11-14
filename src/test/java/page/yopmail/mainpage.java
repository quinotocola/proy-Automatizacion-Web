package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class mainpage {

    public TextBox mailCreate = new TextBox(By.id("login"));

    public Button createMail = new Button(By.id("refreshbut"));

    public void create(String user){
        mailCreate.setText(user);
        createMail.click();
    }
}
