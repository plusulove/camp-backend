package com.bookingcamp.camp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CampInfoEntity {
    @Id
    @Column
    private String camp_name;

    @Column
    private Double room_rate;

    @Column
    private String camp_info;

    @Column
    private java.util.Date reg_dt;
}
