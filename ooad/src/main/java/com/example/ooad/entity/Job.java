package com.example.ooad.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue
    private int jobId;

    private String name;
    private String field;       // Linh vuc cong viec (IT, Marketing, ...)
    private Boolean isFullTime; // full time or part time
    private String rank;        // Chuc vu (Nhan vien, Truong phong, ...)
    private String experience;  // Kinh nghiem (1 nam, 2 nam, ...)
    private int salary;         // Luong (5 trieu, 10 trieu, ...)
    private String description; // Mo ta cong viec
    private int hiringNumber;   // So luong nhan vien can tuyen
    private String gender;      // Gioi tinh (Nam, Nu, Khong yeu cau)
    private String timePost;    // Thoi gian dang tin
    private String timeEnd;
    // Thoi gian ket thuc dang tin
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company_id;      // Id cua cong ty dang tin

    @OneToMany(mappedBy = "job")
    private List<AppliedJob> appliedJobList;


    public Job() {
    }

    public Job(int jobId, String name, String field, Boolean isFullTime, String rank, String experience, int salary, String description, int hiringNumber, String gender, String timePost, String timeEnd, Company company_id, Integer company_getID) {
        this.jobId = jobId;
        this.name = name;
        this.field = field;
        this.isFullTime = isFullTime;
        this.rank = rank;
        this.experience = experience;
        this.salary = salary;
        this.description = description;
        this.hiringNumber = hiringNumber;
        this.gender = gender;
        this.timePost = timePost;
        this.timeEnd = timeEnd;
        this.company_id = company_id;

    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Boolean getFullTime() {
        return isFullTime;
    }

    public void setFullTime(Boolean fullTime) {
        isFullTime = fullTime;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHiringNumber() {
        return hiringNumber;
    }

    public void setHiringNumber(int hiringNumber) {
        this.hiringNumber = hiringNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTimePost() {
        return timePost;
    }

    public void setTimePost(String timePost) {
        this.timePost = timePost;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Company getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Company company_id) {
        this.company_id = company_id;
    }
}
