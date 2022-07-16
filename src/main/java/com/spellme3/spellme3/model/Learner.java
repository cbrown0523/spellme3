package com.spellme3.spellme3.model;

import javax.persistence.*;

@Entity
public class Learner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String age;
    private String wordsAttempted;
    private String wordsCorrect;
    private String wordsAverage;
    //time stamp
//    @OneToOne
//    @JoinTable(
//            name = "learner_table",
//            joinColumns = @JoinColumn(name = "learner_id"),
//            inverseJoinColumns = @JoinColumn(name = "admin_id")
//    )
//    public AccountHolder admin = new AccountHolder();

//    @ManyToOne
//    @JoinColumn(name = "wordList_id", referencedColumnName = "id")
//    @JsonIncludeProperties("id")
//    private WordList wordList;
//
//    @ManyToOne
//    @JoinColumn(name = "admin_id", referencedColumnName = "id")
//    private AccountHolder admin;


    public Learner() {
    }

    public Learner(Long id, String name, String age, String wordsAttempted, String wordsCorrect, String wordsAverage, AccountHolder admin, Word wordList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.wordsAttempted = wordsAttempted;
        this.wordsCorrect = wordsCorrect;
        this.wordsAverage = wordsAverage;
//        this.admin = admin;
//        this.wordList = wordList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWordsAttempted() {
        return wordsAttempted;
    }

    public void setWordsAttempted(String wordsAttempted) {
        this.wordsAttempted = wordsAttempted;
    }

    public String getWordsCorrect() {
        return wordsCorrect;
    }

    public void setWordsCorrect(String wordsCorrect) {
        this.wordsCorrect = wordsCorrect;
    }

    public String getWordsAverage() {
        return wordsAverage;
    }

    public void setWordsAverage(String wordsAverage) {
        this.wordsAverage = wordsAverage;
    }

//    public AccountHolder getAdmin() {
//        return admin;
//    }
//
//    public void setAdmin(AccountHolder admin) {
//        this.admin = admin;
//    }


}
