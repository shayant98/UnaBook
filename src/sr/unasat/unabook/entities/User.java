package sr.unasat.unabook.entities;

import java.time.LocalDateTime;

public class User {
    private long id;
    private String email,lastname, firstname, password;
    private LocalDateTime lastloggin;

    public User(long id, String email, String lastname, String firstname, String password, LocalDateTime lastloggin) {
        this.id = id;
        this.email = email;
        this.lastname = lastname;
        this.firstname = firstname;
        this.password = password;
        this.lastloggin = lastloggin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getLastloggin() {
        return lastloggin;
    }

    public void setLastloggin(LocalDateTime lastloggin) {
        this.lastloggin = lastloggin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", password='" + password + '\'' +
                ", lastloggin=" + lastloggin +
                '}';

    }
    public String getBasicInfo() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastloggin=" + lastloggin +
                '}';

    }
}
