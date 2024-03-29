package com.company.project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class Vacation extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private int month;
    private String startdate;
    private String enddate;
    private int fordate;
    private String classname;
    private String name;
    private String birthdate;
    private String address;
    private String phonenumber;
    private String reason;
    private String reasondate;

}
