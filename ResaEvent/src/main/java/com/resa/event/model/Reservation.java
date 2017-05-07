package com.resa.event.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RESERVATION")
public class Reservation
{
    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    @Column(name = "RESERVATION_NUMBER")
    private Long reservationNumber;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "END_DATE")
    private Date endDate;
    @OneToOne
    @JoinColumn(name = "BUSINESS_ID")
    private Business business;
    @Column(name = "PEOPLE_NUMBER")
    private Long peopleNumber;
    @Column(name = "STATUS")
    private String status;
    @OneToOne
    @JoinColumn(name = "USER_ID")
    private User user;
    @Column(name = "COMMENT")
    private String comment;
    @Column(name = "PRICE")
    private Double price;
    
    
}
