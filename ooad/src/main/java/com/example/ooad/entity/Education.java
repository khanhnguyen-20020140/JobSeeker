package com.example.ooad.entity;


public class Education {
    private int id;
    private int accountId;
    private String degree;
    private String degreeType;
    private String schoolName;
    private String specialize;
    private String startDate;
    private String endDate;

    public Education(int id, int accountId, String degree, String degreeType, String schoolName, String specialize, String startDate, String endDate) {
        this.id = id;
        this.accountId = accountId;
        this.degree = degree;
        this.degreeType = degreeType;
        this.schoolName = schoolName;
        this.specialize = specialize;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
