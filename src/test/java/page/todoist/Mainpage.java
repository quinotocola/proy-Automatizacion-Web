package page.todoist;

import control.Button;
import org.openqa.selenium.By;

public class Mainpage {

    public Button login = new Button(By.linkText("/auth/login"));
}
