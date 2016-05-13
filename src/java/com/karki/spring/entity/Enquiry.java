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
public class Enquiry {

    private int enquiryId;
    private Date enquiryDate;
    private String enquiryType;
     private java.sql.Date addedDate;
   
    public Enquiry() {

    }

    public Enquiry(int enquiryId, Date enquiryDate, String enquiryType) {
        this.enquiryId = enquiryId;
        this.enquiryDate = enquiryDate;
        this.enquiryType = enquiryType;
    }

    public java.sql.Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(java.sql.Date addedDate) {
        this.addedDate = addedDate;
    }

   
    public String getEnquiryType() {
        return enquiryType;
    }

    public void setEnquiryType(String enquiryType) {
        this.enquiryType = enquiryType;
    }

    public int getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(int enquiryId) {
        this.enquiryId = enquiryId;
    }

    public Date getEnquiryDate() {
        return enquiryDate;
    }

    public void setEnquiryDate(Date enquiryDate) {
        this.enquiryDate = enquiryDate;
    }

    @Override
    public String toString() {
        return "Enquiry{" + "enquiryId=" + enquiryId + ", enquiryDate=" + enquiryDate + ", enquiryType=" + enquiryType + '}';
    }

    public String toCSV() {
        return "Enquiry{" + "enquiryId=" + enquiryId + ", enquiryDate=" + enquiryDate + ", enquiryType=" + enquiryType + '}';

    }

}
