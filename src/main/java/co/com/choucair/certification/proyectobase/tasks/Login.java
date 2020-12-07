package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.usernameinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Login implements Task {

    private String strUser;
    private String strPassword;

    public Login (String strUser, String strPassword){
        this.strUser=strUser;
        this.strPassword=strPassword;
    }

    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Switch.toDefaultContext(),
                WaitUntil.the(ChoucairLoginPage.SELECT_MODAL, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON));

    }
}
