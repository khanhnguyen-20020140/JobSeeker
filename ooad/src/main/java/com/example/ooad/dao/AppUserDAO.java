package com.example.ooad.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;



import com.example.ooad.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AppUserDAO {

    @Autowired
    private EntityManager entityManager;

    public AppUser findUserAccount(String userName) {
        try {
            String sql = "Select e from " + AppUser.class.getName() + " e " //
                    + " Where e.userName = :userName ";

            Query query = entityManager.createQuery(sql, AppUser.class);
            query.setParameter("userName", userName);

            return (AppUser) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

//    public AppUser findUserAccountByid(String id) {
//        try {
//            String sql = "Select e from " + AppUser.class.getName() + " e " //
//                    + " Where e.id = :id ";
//
//            Query query = entityManager.createQuery(sql, AppUser.class);
//            query.setParameter("id", id);
//
//            return (AppUser) query.getSingleResult();
//        } catch (NoResultException e) {
//            return null;
//        }
//    }

}

