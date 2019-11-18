package sr.unasat.unabook.services;
import sr.unasat.unabook.entities.User;

public class UserService {

    public void fullName(User currentUser){
        String fullName = currentUser.getFirstname() + " " + currentUser.getLastname();
        System.out.println(fullName);
    }

    public void info(User currentUser){
        System.out.println(currentUser.getBasicInfo());
    }
}
