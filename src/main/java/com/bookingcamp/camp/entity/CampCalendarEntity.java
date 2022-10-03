package com.bookingcamp.camp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CampCalendarEntity {
    @Id
    @Column
    private String book_d;

    @Column
    private String camp_name;

    @Column
    private Integer room_c;

    @Column
    private Integer alloc_c;

    @Column
    private String close_yn;

    @Column
    private java.util.Date reg_dt;
}
