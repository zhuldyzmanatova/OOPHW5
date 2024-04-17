package controller;

import java.util.List;

import model.User;
import service.DataService;

public class Controller {
    DataService service = new DataService();

    public void userList (User user){
        service.userList(user);
    } 

    public List<User> getUserList(String type){ 
        return service.getUserList(type);
    }
}
