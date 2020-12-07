package co.com.choucair.certification.proyectobase.usernameinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target ENTER_COURSES_CERTIFICATION = Target.the("enter to courses and certification")
            .located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a/h4/strong"));

    public static final Target INPUT_COURSE = Target.the("search the course")
            .located(By.xpath("//input[@id='coursesearchbox']"));

    public static final Target BUTTON_CONFIRM = Target.the("button confirm search the course")
            .located(By.xpath("//button[contains(text(),'Ir')]"));

    public static final Target ENTER_COURSE = Target.the("enter the course that search")
            .located(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/h4[1]/a[1]"));

    public static final Target NAME_COURSE = Target.the("name of course")
            .located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
}
