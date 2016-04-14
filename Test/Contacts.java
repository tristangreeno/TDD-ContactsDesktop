/**
 * Created by tristangreeno on 4/14/16.
 */
public class Contacts {
    private String name;
    private String number;
    private String email;

    Contacts(String name, String number, String email) {
        if (name != null &&
                number != null &&
                email != null) {
            this.name = name;
            this.number = number;
            this.email = email;
        }
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }
}
