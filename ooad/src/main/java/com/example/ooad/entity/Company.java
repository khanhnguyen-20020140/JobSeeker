package com.example.ooad.entity;
import com.example.ooad.responsitory.CompanyResponsitory;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "company")

public class Company  {
    @Id
    @GeneratedValue
    private int companyId;
    private String name;
    private String description;
    private String size;            // Quy mo cong ty. Ex: 1000-2000 nguoi
    private String AddressDetail;   // So nha, duong, phuong, quan
    private String addressCity;

    private String img;

    @ManyToOne
    @JoinColumn(name="id_account")
    AppUser appUser;

    @OneToMany(mappedBy = "company_id", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (Person) (1 địa điểm có nhiều người ở)
    // MapopedBy trỏ tới tên biến Address ở trong Person.
    private Collection<Job> jobs;

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Company() {
    }

//    public Account getAccountCompany() {
//        return accountCompany;
//    }
//
//    public void setAccountCompany(Account accountCompany) {
//        this.accountCompany = accountCompany;
//    }

//    public Company(int companyId, String name, String description, String size, String addressDetail, String addressCity, String img, Account accountCompany) {
//        this.companyId = companyId;
//        this.name = name;
//        this.description = description;
//        this.size = size;
//        AddressDetail = addressDetail;
//        this.addressCity = addressCity;
//        this.img = img;
//        this.accountCompany = accountCompany;
//    }

    public Company(int companyId, String name, String description, String size, String addressDetail, String addressCity, String img, AppUser appUser) {
        this.companyId = companyId;
        this.name = name;
        this.description = description;
        this.size = size;
        AddressDetail = addressDetail;
        this.addressCity = addressCity;
        this.img = img;
        this.appUser = appUser;
    }

    public Company(int companyId, String name, String description, String size, String addressDetail, String addressCity, String img) {
        this.companyId = companyId;
        this.name = name;
        this.description = description;
        this.size = size;
        AddressDetail = addressDetail;
        this.addressCity = addressCity;
        this.img = img;

    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAddressDetail() {
        return AddressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.AddressDetail = addressDetail;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
