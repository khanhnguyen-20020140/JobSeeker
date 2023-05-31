package com.example.ooad.responsitory;

import com.example.ooad.entity.AppUser;
import com.example.ooad.entity.Job;
import org.apache.catalina.util.Introspection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobResponsitory extends JpaRepository<Job,Integer> {

//    @Query("SELECT e FROM Employee e WHERE e.employeeName IN (:names)")     // 2. Spring JPA In cause using @Query
//    List<Employee> findByEmployeeNames(@Param("names")List<String> names);

    @Query("SELECT e FROM Job e WHERE e.company_id.companyId IN (:id)")
    public List<Job> getJobByDestination(@Param("id") List<Integer> company_id);

    @Query("SELECT e FROM Job e WHERE e.company_id.companyId IN (:id) and e.field = (:field)")
    public List<Job> getJobByDestinationandField(@Param("id") List<Integer> company_id,@Param("field") String field);


    @Query("SELECT e FROM Job e WHERE e.field = :field")
    public List<Job> getByField(@Param("field") String field);


    @Query("SELECT e FROM Job e WHERE e.company_id.appUser.userName = :name")
    public List<Job> getByOwner(@Param("name") String name);

    @Query("SELECT e FROM Job e WHERE e.jobId = :id")
    public List<Job> getJobTest(@Param("id") Integer company_id);

}
