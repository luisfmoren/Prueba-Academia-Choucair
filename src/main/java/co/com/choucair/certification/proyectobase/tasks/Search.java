package co.com.choucair.certification.proyectobase.tasks;


import co.com.choucair.certification.proyectobase.usernameinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


public class Search implements Task {

    private String course;

    public Search(String course){
        this.course=course;
    }

    public static Performable the(String course) {
        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.ENTER_COURSES_CERTIFICATION),
                Enter.theValue(course).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_CONFIRM),
                Click.on(SearchCoursePage.ENTER_COURSE));

    }
}
