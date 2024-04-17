package view;

import java.util.List;

import controller.Controller;
import model.User;

public class StudentView {
    private Controller controller = new Controller();

    public void userList (User user){
        controller.userList(user);
        System.out.println("Добавлен студент " + user);
    }
    
    public List<User> getUserList(){
        return controller.getUserList("student");
    }
}
