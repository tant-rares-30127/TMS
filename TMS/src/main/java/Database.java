
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    private List<User> userList=new ArrayList<>(); 
    private String file="UserList";

    public Database() {
        try {
            readUserList();
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addUser(String firstName, String lastName, String username, String email, String password, String birthYear, String location, String gender){
        User user=new User(firstName, lastName, username, email, password, birthYear, location, gender);
        userList.add(user);
        try {
            saveUserList();
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<User> getList(){
        return userList;
    }
    
    public void saveUserList() throws IOException{
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
        o.writeObject(userList);
        o.close();
    }
    
    public void readUserList() throws IOException, ClassNotFoundException{
        ObjectInputStream in=new ObjectInputStream(new FileInputStream(file));
        List<User> userList=(List<User>) in.readObject();
        in.close();
        this.userList=userList;
    }
}
