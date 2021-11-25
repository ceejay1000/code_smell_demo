package com.ceejay;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User1 {

    // Large class
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate dateRegistered = LocalDate.now();
    private int likes;
    private String tweets;
    private List<User> registeredUsers = new ArrayList<>();
    private double totalLikes;
    private List<String> userTweets = new ArrayList();


    public User1(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    public int getLikes() {
        return likes;
    }

    public String getTweets() {
        return tweets;
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public double getTotalLikes() {
        return totalLikes;
    }

    public List<String> getUserTweets() {
        return userTweets;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateRegistered=" + dateRegistered +
                ", likes=" + likes +
                ", tweets='" + tweets + '\'' +
                ", registeredUsers=" + registeredUsers +
                ", totalLikes=" + totalLikes +
                ", userTweets=" + userTweets +
                '}';
    }
}
