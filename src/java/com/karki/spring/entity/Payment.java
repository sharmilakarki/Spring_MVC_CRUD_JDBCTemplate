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
public class Payment {

    private int paymentId;
    private Date paymentDate;
    private double dues;
    private String paymentType;
    private Facilities facilities;
   

    public Payment() {
    }

    public Payment(int paymentId, String paymentType, Date paymentDate, double dues /*, Facilities facilities, Customer customer, Enrollment enrollment */) {
        this.paymentId = paymentId;
        this.paymentType = paymentType;
        this.paymentDate = paymentDate;
        this.dues = dues;
//        this.facilities = facilities;
//        this.customer = customer;
//        this.enrollment = enrollment;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getDues() {
        return dues;
    }

    public void setDues(double dues) {
        this.dues = dues;
    }


   
   
}
