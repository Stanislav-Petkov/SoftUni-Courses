package validPerson;

import java.util.Date;

public class PersonCreationException extends Throwable {
    private Date dateOfAttempt;

    PersonCreationException(String message) {
        super(message);
        this.dateOfAttempt = new Date();
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " " + this.dateOfAttempt.toString();
    }
}
