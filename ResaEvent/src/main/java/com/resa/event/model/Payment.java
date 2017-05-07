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
@Table(name = "PAYMENT")
public class Payment
{
    @Id
    @Column(name = "PAYMENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    @Column(name = "USER_ID")
    private User user;
    @Column(name = "RESERVATION_ID")
    private Reservation reservation;
    @Column(name = "CARD_ID")
    private Card card;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATE")
    private Date date;

}
