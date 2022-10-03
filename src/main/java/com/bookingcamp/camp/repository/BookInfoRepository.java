package com.bookingcamp.camp.repository;

import com.bookingcamp.camp.entity.BookInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookInfoRepository extends JpaRepository<BookInfoEntity, String> {

    @Query(value = "SELECT USER_ID, BOOK_D, CAMP_NAME, BOOK_CNT, REG_DT FROM BOOKINFO", nativeQuery=true)
    List<BookInfoEntity> searchBookInfo();
    //http://localhost:8080/test/searchBookInfo

}