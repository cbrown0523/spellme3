package com.spellme3.spellme3.payloads.requests;

public class LoginRequests {

        private String username;
        private String password;

    public LoginRequests(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

