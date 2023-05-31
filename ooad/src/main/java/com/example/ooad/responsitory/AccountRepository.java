//package com.example.ooad.responsitory;
//
//import com.example.ooad.entity.Account;
//import com.example.ooad.entity.AppliedJob;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import java.util.List;
//
//public interface AccountRepository extends JpaRepository<Account, Integer> {
//    @Query("SELECT e FROM Account e WHERE e.workexperiences>=(:exp) and e.skill=(:skill) and e.MinWage<(:salary) and e.MaxWage>(:salary) and e.location =(:location) ")
//    public List<Account> get(@Param("exp") String exp, @Param("skill") String skill, @Param("salary") Integer salary, @Param("location") String location);
//}
