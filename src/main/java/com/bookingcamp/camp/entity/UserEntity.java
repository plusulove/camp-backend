package com.bookingcamp.camp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class UserEntity {
    @Id
    @Column
    private String user_id;

    @Column
    private String user_pass;

    @Column
    private String user_name;

    @Column
    private java.util.Date reg_dt;
}
