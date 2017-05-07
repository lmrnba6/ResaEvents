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
@Table(name = "BUSINESS")
public class Business
{
    @Id
    @Column(name = "BUSINESS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long businessId;
    @Column(name = "NAME")
    private String name;
    @OneToOne
    @Column(name = "ADDRESS")
    private Address address;
    @OneToOne
    @Column(name = "CONTACT")
    private Contact contact;
    @OneToOne
    @Column(name = "AVAILABILITY")
    private Availability Availability;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToOne
    @Column(name = "CATEGORY")
    private Category category;
    @OneToOne
    @Column(name = "USER_ID")
    private User user;
    @Column(name = "IMAGE")
    private String image;
    @Column(name = "WEBSITE")
    private String website;
    
    
    
}
