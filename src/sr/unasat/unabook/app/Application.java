package sr.unasat.unabook.app;
import sr.unasat.unabook.entities.User;
import sr.unasat.unabook.services.AuthenticationService;
import sr.unasat.unabook.services.UserService;

import java.time.LocalDateTime;


public class Application {
    public static void main(String[] args) {

        User sara = new User(1,"sara@test.com0","djojo","Sara", "123456", LocalDateTime.now());

        UserService userService = new UserService();
        AuthenticationService authenticationService = new AuthenticationService();
        authenticationService.logIn("devina@test.com","123458");

        userService.fullName(sara);
        userService.info(sara);


    }
}
