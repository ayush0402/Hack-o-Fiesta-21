package com.yash10019coder.videocalling.Models;
public class Users {
    String profile_pic, username, mail, id, user_password;

    public Users(String mail) {
        this.mail = mail;
    }

    public Users(String profile_pic, String username, String mail, String id, String user_password) {
        this.profile_pic = profile_pic;
        this.username = username;
        this.mail = mail;
        this.id = id;
        this.user_password = user_password;

    }

    public Users() {

    }

    public Users(String username, String mail, String user_password) {

        this.username = username;
        this.mail = mail;
        this.user_password = user_password;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getId(String key) {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }


    public String getId() {
        return id;
    }
}