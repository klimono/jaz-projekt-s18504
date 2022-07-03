package com.example.projektBank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
import java.util.Date;

@Entity
public class CurrencyEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String st_date;
    String nd_date;
    Date time;

    float value;

    public CurrencyEntity( String st_date, String nd_date, float value) {
        this.st_date = st_date;
        this.nd_date = nd_date;
        this.value = value;
        this.time = Date.from(Instant.now());
    }

    public CurrencyEntity() {

    }

    public String getSt_date() {
        return st_date;
    }

    public void setSt_date(String st_date) {
        this.st_date = st_date;
    }

    public String getNd_date() {
        return nd_date;
    }

    public void setNd_date(String nd_date) {
        this.nd_date = nd_date;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
