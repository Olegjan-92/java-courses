package ru.ponomarev.models;

/**
 * Created by oleg on 23.08.16.
 */
public class Message extends Base {
    private User user;
    private String text;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}