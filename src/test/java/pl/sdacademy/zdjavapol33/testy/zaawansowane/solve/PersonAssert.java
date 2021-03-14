package pl.sdacademy.zdjavapol33.testy.zaawansowane.solve;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;


import java.util.Date;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : zdjavapol33
 * @since : 14.03.2021
 **/
public class PersonAssert extends AbstractAssert<PersonAssert, Person> {

    public PersonAssert hasNoBirthDay() {
        isNotNull();

        String assertjErrorMessage = "\nExpecting Person <%s> to havent birthday\n but was:\n  <%s> ";

        // null safe check
        Date birthdayDate = actual.getBirthdayDate();

        if (!Objects.areEqual(birthdayDate, null)) {
            failWithMessage(assertjErrorMessage, actual.getName(), birthdayDate);
        }

        // return the current assertion for method chaining
        return this;
    }

    public PersonAssert(Person actual) {
        super(actual, PersonAssert.class);
    }

    public static PersonAssert assertThat(Person actual) {
        return new PersonAssert(actual);
    }

}