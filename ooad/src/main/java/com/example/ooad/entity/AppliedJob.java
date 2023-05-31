package com.example.ooad.entity;


import javax.persistence.*;

@Entity
@Table(name="applied_job")
public class AppliedJob {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name="job_id")
    private Job job;

    @ManyToOne
    @JoinColumn(name="id_account")
    private AppUser appUser;

    


    public AppliedJob() {
    }

    public AppliedJob(int id, Job job) {
        this.id = id;
        this.job = job;

    }
//    public AppliedJob(int id, Job job, Account account, String cvFile) {
//        this.id = id;
//        this.job = job;
//        this.account = account;
//        this.cvFile = cvFile;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }

    public AppliedJob(int id, Job job, AppUser appUser) {
        this.id = id;
        this.job = job;
        this.appUser = appUser;

    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }


}
