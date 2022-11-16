package com.spellme3.spellme3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "developer_tutorial")
public class AWord {
@Id
    @Column(name = "id")
    private long id;

    @Column(name = "word")
    private String word;

    public AWord() {
    }

    public AWord(long id, String word) {
        this.id = id;
        this.word = word;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"word\":\"" + word + '"' +
                '}';
    }
}
