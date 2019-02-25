package spring.database.entities;

import org.mortbay.jetty.security.Password;
import org.springframework.data.annotation.Id;


import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;


public class User {
    @Id
    private BigInteger id;

    private LinkedList<Book> favorites = new LinkedList<>();
    private String login;
    private Password password;
    private Date registered;

    public User(String login, Password password) {
        this.login = login;
        this.password = password;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public LinkedList<Book> getFavorites() {
        return favorites;
    }

    public void setFavorites(LinkedList<Book> favorites) {
        this.favorites = favorites;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }
}
