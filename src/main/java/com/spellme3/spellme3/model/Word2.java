package com.spellme3.spellme3.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Word2 {
   @JsonProperty("Text")

    private String text;



    private String money;

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public Word2(String text) {
//        this.text = text;
//    }

    public Word2() {
    }

    @Override
    public String toString() {
        return "{" +
                "\"text\":\"" + text + '"' +
                ", \"money\":\"" + money + '"' +
                '}';
    }
}
