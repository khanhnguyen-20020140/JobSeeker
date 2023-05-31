package com.example.ooad.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "App_User", //
        uniqueConstraints = { //
                @UniqueConstraint(name = "APP_USER_UK", columnNames = "User_Name") })
public class AppUser {

    @Id
    @GeneratedValue
    @Column(name = "User_Id", nullable = false)
    private Long userId;

    @Column(name = "User_Name", length = 36, nullable = false)
    private String userName;

    @Column(name = "Encryted_Password", length = 128, nullable = false)
    private String encrytedPassword;

    @Column(name = "Enabled", length = 1, nullable = false)
    private boolean enabled;

    private String linkCV;


    private String workexperiences;

    private String name;

    private String education;

    private String skill;

    private Integer MinWage;

    private Integer MaxWage;

    private String prize ;

    private String location ;

    private String img;

    @OneToMany(mappedBy = "appUser", cascade = CascadeType.ALL)
    List<AppliedJob> appliedJobList = new ArrayList<>();

    @OneToMany(mappedBy = "appUser")
    List<Company> companyList = new ArrayList<>();

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public AppUser() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getLinkCV() {
        return linkCV;
    }

    public void setLinkCV(String linkCV) {
        this.linkCV = linkCV;
    }



    public String getWorkexperiences() {
        return workexperiences;
    }

    public void setWorkexperiences(String workexperiences) {
        this.workexperiences = workexperiences;
    }



    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Integer getMinWage() {
        return MinWage;
    }

    public void setMinWage(Integer minWage) {
        MinWage = minWage;
    }

    public Integer getMaxWage() {
        return MaxWage;
    }

    public void setMaxWage(Integer maxWage) {
        MaxWage = maxWage;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public AppUser(Long userId, String userName, String encrytedPassword, boolean enabled, String linkCV, String workexperiences, String name, String education, String skill, Integer minWage, Integer maxWage, String prize, String location, String img) {
        this.userId = userId;
        this.userName = userName;
        this.encrytedPassword = encrytedPassword;
        this.enabled = enabled;
        this.linkCV = linkCV;
        this.workexperiences = workexperiences;
        this.name = name;
        this.education = education;
        this.skill = skill;
        MinWage = minWage;
        MaxWage = maxWage;
        this.prize = prize;
        this.location = location;
        this.img = img;
    }
}
