package com.bookingcamp.camp.repository;

import com.bookingcamp.camp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    @Query(value = "SELECT USER_ID, USER_PASS, USER_NAME FROM USER", nativeQuery=true)
    List<UserEntity> findAll();
    //http://localhost:8080/test/search

    @Query(value = "SELECT USER_ID, USER_PASS, USER_NAME FROM USER WHERE NAME = :name", nativeQuery=true)
    List<UserEntity> searchParamRepo(@Param("name") String name);
    //http://localhost:8080/test/searchParamRepo?name=이보람
}