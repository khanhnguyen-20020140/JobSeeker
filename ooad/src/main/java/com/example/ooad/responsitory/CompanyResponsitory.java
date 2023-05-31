package com.example.ooad.responsitory;


import com.example.ooad.entity.AppliedJob;
import com.example.ooad.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyResponsitory extends JpaRepository<Company,Integer> {
    @Query("SELECT e FROM Company e WHERE e.appUser.userName=(:name)")
    public List<Company> getByName(@Param("name") String name);

}
