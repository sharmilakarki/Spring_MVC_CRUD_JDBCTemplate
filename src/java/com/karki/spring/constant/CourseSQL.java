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
public class CourseSQL {

    public final static String Course_insert = "INSERT INTO " + TableConstant.TABLE_COURSE + "(course_name,course_description,duration_type,fees,duration,status)"
            + "Values(?,?,?,?,?,?)";
    public final static String GETALL = "select * from " + TableConstant.TABLE_COURSE;
    public final static String GETBYID = "select * from " + TableConstant.TABLE_COURSE + " where id = ?";
    public final static String UPDATE="Update table "+TableConstant.TABLE_COURSE +" SET course_name=?, course_description=?, duration_type=?, fees=?,"
            + "course_duration=?,status=? where id=?";
    public final static String DELETE="Delete from "+TableConstant.TABLE_COURSE +" WHERE id =?";
    public final static String GETBYNAME="select * from "+TableConstant.TABLE_COURSE +" Where course_name=?";
            
}
