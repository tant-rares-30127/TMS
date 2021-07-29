
import java.io.Serializable;


public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String birthYear;
    private String location;
    private String gender;

    public User(String firstName, String lastName, String username, String email, String password, String birthYear, String location, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthYear = birthYear;
        this.location = location;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", email=" + email + ", password=" + password + ", birthYear=" + birthYear + ", location=" + location + ", gender=" + gender + '}';
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    
}
