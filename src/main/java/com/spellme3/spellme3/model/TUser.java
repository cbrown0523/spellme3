//package com.spellme3.spellme3.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.Objects;
//@Entity
//@Table(name = "users")
//public class TUser {
//    private @Id @GeneratedValue long id;
//    private String username;
//    private  String password;
//    private  boolean loggedIn=false;
//    public TUser() {
//    }
//    public TUser( String username,
//                 String password) {
//        this.username = username;
//        this.password = password;
//        this.loggedIn = false;
//    }
//   // public long getId() {
//        return id;
//    }
//    public String getUsername() {
//        return username;
//    }
//    public void setUsername(String username) {
//        this.username = username;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public boolean isLoggedIn() {
//        return loggedIn;
//    }
//    public void setLoggedIn(boolean loggedIn) {
//        this.loggedIn = loggedIn;
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof User)) return false;
//        TUser user = (TUser)  o;
//        return Objects.equals(username, user.username) &&
//                Objects.equals(password, user.password);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, username, password,
//                loggedIn);
//    }
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", loggedIn=" + loggedIn +
//                '}';
//    }
//}