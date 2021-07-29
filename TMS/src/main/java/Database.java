
import java.util.ArrayList;
import java.util.List;


public class Database {
    private List<User> userList=new ArrayList<>(); 

    public Database() {
    }
    
    public void addUser(String username, String email, String password, String firstName, String lastName, String birthYear, String location, String gender){
        User user=new User(firstName, lastName, username, email, password, birthYear, location, gender);
        userList.add(user);
    }
}
