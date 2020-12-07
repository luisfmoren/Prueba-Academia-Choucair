package co.com.choucair.certification.proyectobase.usernameinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//*[@id=\"nav-menu\"]/ul[2]/li/a/strong"));

    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.xpath("//input[@id='username']"));

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.xpath("//input[@id='password']"));

    public static final Target ENTER_BUTTON = Target.the("Button to confirm login")
            .located(By.xpath("//button[contains(@class,'btn btn-primary')]"));

    public static final Target SELECT_MODAL =Target.the("move to modal")
            .located(By.xpath("//*[@id=\"Ingresar\"]/div/div/div[2]"));
 }
