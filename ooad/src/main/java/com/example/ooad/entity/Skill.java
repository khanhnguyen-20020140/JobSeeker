package com.example.ooad.entity;


public class Skill {
    private int id;
    private int accountId;
    private int name;
    private String evaluate;
    private String description;

    public Skill(int id, int accountId, int name, String evaluate, String description) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.evaluate = evaluate;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
