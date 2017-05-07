package com.resa.event.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hsqldb.types.DateTimeType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AVAILABILITY")
public class Availability
{
    @Id
    @Column(name = "AVAILABILITY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long availabilityId;
    @Column(name = "OPENING")
    private DateTimeType opening;
    @Column(name = "CLOSING")
    private DateTimeType closing;   
    
}
