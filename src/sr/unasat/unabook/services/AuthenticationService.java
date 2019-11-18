package sr.unasat.unabook.services;

import sr.unasat.unabook.exceptions.ForbiddenException;
import sr.unasat.unabook.exceptions.InvalidCredentialsException;
import sr.unasat.unabook.entities.User;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class AuthenticationService {
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<User> loggedInUsers = new ArrayList<User>();


    public AuthenticationService() {

        //Existing Users
        User sara = new User(1,"sara@test.com","djojo","Sara", "123456", LocalDateTime.now());
        User devina = new User(2,"devina@test.com","lowtoe","Devina", "123458", LocalDateTime.now());
        User shayant = new User(3,"bien@test.com","sital","Bien", "123459", LocalDateTime.now());

        //Add User to Array
        users.add(sara);
        users.add(devina);
        users.add(shayant);
    }

    public void logIn(String email, String password){

        try {
            for (int i=0; i < users.size();i++){
                User currentUser = users.get(i);
                //Check if user with email
                if (currentUser.getEmail().equals(email)){
                    //Check if password is correct
                    if (!currentUser.getPassword().equals(password)){
                        throw new InvalidCredentialsException("foutieve Info");
                    }else{
                        loggedInUsers.add(currentUser); //add current user to logged IN array
                        System.out.println("logged in as: "+ currentUser.getFirstname());
                    }
                    break;
                }else{
                    if (i == (users.size()-1)){
                        throw new ForbiddenException("Geen gebruiker gevonden met email: " + email);
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }


    }


}
