/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.spring.constant;

/**
 *
 * @author sharmila
 */
public class EnquirySQL {
    public final static String Batch_insert = "INSERT INTO " + TableConstant.TABLE_ENQUIRY + "(id,code,name,added_date,modified_date,status)"
            + "Values(?,?,?,?,?,?)";
    public final static String GETALL = "select * from " + TableConstant.TABLE_ENQUIRY;
    public final static String GETBYID = "select * from " + TableConstant.TABLE_ENQUIRY + " where id = ?";
    public final static String UPDATE="Update table "+TableConstant.TABLE_ENQUIRY +" id=?,code=?,name=?,added_date=?,modified_date=?,status=?  where id=?";
    public final static String DELETE="Delete from "+TableConstant.TABLE_ENQUIRY +" WHERE id =?";
    public final static String GETBYNAME="select * from "+TableConstant.TABLE_ENQUIRY +" Where name=?";
           
}
