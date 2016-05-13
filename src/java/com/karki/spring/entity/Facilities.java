/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.spring.entity;

import java.util.Date;

/**
 *
 * @author sharmila
 */
public class Facilities {
    private int facilityId;
    private String name;
    private double fee;
    private int facilitiesDuration;
     private java.sql.Date addedDate;
    private java.sql.Date modifiedDate;
    private boolean status;
    public Facilities() {
    }

    public Facilities(int facilityId, String name, double fee) {
        this.facilityId = facilityId;
        this.name = name;
        this.fee = fee;
    
    }

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getFacilitiesDuration() {
        return facilitiesDuration;
    }

    public void setFacilitiesDuration(int facilitiesDuration) {
        this.facilitiesDuration = facilitiesDuration;
    }

}
