package com.example.ooad.responsitory;

import com.example.ooad.entity.AppliedJob;
import com.example.ooad.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface AppliedJobRepository extends JpaRepository<AppliedJob,Integer> {

//    @Query("SELECT e FROM AppliedJob e WHERE e.account.id=(:id)")
//    public List<AppliedJob> getByID(@Param("id") Integer id);


    @Query("SELECT e FROM AppliedJob e WHERE e.appUser.userName=(:name)")
    public List<AppliedJob> getByName(@Param("name") String name);

    @Query("Select e from AppliedJob e WHERE e.job.jobId=(:id) order by e.job.jobId")
    public List<AppliedJob> ID(@Param("id") Integer id);

    @Query("Select e from AppliedJob e WHERE e.job.company_id.appUser.userName=(:name) order by e.job.jobId")
    public List<AppliedJob> NTDGET(@Param("name") String name);



}
