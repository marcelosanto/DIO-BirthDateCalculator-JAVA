import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class BirthDateFacade {
    private static BirthDateFacade instance = null;

    private BirthDateFacade() {
    }

    public static BirthDateFacade getInstance() {
        if (instance == null) {
            instance = new BirthDateFacade();
        }
        return instance;
    }

    public LocalDate getDateOfBirth(int age) {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateOfBirth = currentDate.minus(Period.ofYears(age));
        return dateOfBirth;
    }

    public DayOfWeek getDayOfWeekOfBirth(int age) {
        LocalDate dateOfBirth = getDateOfBirth(age);
        return dateOfBirth.getDayOfWeek();
    }

    public String getBirthDateInformation(int age) {
        LocalDate dateOfBirth = getDateOfBirth(age);
        DayOfWeek dayOfWeekOfBirth = getDayOfWeekOfBirth(age);
        return "A pessoa nasceu em " + dateOfBirth + " que é um(a) " + dayOfWeekOfBirth + ".";
    }
}