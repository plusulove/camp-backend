package com.bookingcamp.camp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class BookInfoEntity {
    @Id
    @Column
    private String user_id;

    @Column
    private String book_d;

    @Column
    private String camp_name;

    @Column
    private Integer book_cnt;

    @Column
    private java.util.Date reg_dt;
}
