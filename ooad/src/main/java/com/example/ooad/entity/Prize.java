package com.example.ooad.entity;


public class Prize {
    private int id;
    private int accountId;
    private String name;
    private String description;
    private String dateAwarded;

    public Prize(int id, int accountId, String name, String description, String dateAwarded) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.description = description;
        this.dateAwarded = dateAwarded;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAwarded() {
        return dateAwarded;
    }

    public void setDateAwarded(String dateAwarded) {
        this.dateAwarded = dateAwarded;
    }
}
