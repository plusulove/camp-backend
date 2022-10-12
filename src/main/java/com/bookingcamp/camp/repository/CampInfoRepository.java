package com.bookingcamp.camp.repository;

import com.bookingcamp.camp.entity.CampInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CampInfoRepository extends JpaRepository<CampInfoEntity, String> {

    @Query(value = "SELECT CAMP_NAME, ROOM_RATE, CAMP_INFO, REG_DT FROM CAMPCALENDAR WHERE CAMP_NAME = :name", nativeQuery=true)
    List<CampInfoEntity> searchCampInfo(@Param("name") String name);
    //http://localhost:8080/test/searchCampInfo

    @Query(value = "SELECT CAMP_NAME, ROOM_RATE, CAMP_INFO, REG_DT FROM CAMPCALENDAR", nativeQuery=true)
    List<CampInfoEntity> searchCampInfoAll();
    //http://localhost:8080/test/searchCampInfoAll

}