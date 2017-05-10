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
@Table(name = "CARD")
public class Card
{
    @Id
    @Column(name = "CARD_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;
    @Column(name = "CARD_NUMBER")
    private Long cardNumber;
    @Column(name = "EXPIRY")
    private Date expiry;
    @Column(name = "CVV")
    private String cvv;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATE")
    private Date date;

}
