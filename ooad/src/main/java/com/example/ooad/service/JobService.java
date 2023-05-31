package com.example.ooad.service;

import com.example.ooad.controller.JobController;
import com.example.ooad.entity.Company;
import com.example.ooad.entity.Job;
import com.example.ooad.responsitory.CompanyResponsitory;
import com.example.ooad.responsitory.JobResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private EntityManager entityManager;

    @Autowired
    private CompanyResponsitory companyResponsitory;

    @Autowired
    private JobResponsitory jobResponsitory;




}
