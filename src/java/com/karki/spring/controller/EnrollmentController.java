/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.spring.controller;

import com.karki.spring.dao.EnrollmentDao;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author sharmila
 */
@Controller
@RequestMapping(value = "/enrollment")
public class EnrollmentController {

    @Autowired
    private EnrollmentDao enrollmentDao;
   
    @RequestMapping("deleteEnrollment")
    public ModelAndView delete(ModelMap mv) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
