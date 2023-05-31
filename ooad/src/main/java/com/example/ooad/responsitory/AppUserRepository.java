package com.example.ooad.responsitory;

import com.example.ooad.entity.AppUser;
import com.example.ooad.entity.AppliedJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
//DESC LIMIT 1
//    @Query(value="SELECT e FROM app_user e  ", nativeQuery = true)
//    public List<AppUser> idUserRole();
@Query("Select e from AppUser e WHERE   e.workexperiences=(:kn) and e.location=(:dd) and e.education=(:hv) ")
public List<AppUser> Suggestion(@Param("kn") String kn, @Param("dd") String dd, @Param("hv") String hv);

}
