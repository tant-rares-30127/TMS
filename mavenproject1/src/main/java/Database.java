
import java.util.ArrayList;
import java.util.List;


public class Database {
    private List<User> userList=new ArrayList<>(); 

    public Database() {
    }
    
    public void addUser(String username, String email, String password){
        User user=new User(username, email, password);
        userList.add(user);
    }
}
