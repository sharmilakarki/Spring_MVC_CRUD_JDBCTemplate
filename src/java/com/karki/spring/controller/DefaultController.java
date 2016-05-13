/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.spring.controller;

import java.sql.SQLException;
import org.springframework.ui.ModelMap;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author sharmila
 */
public interface DefaultController {
    ModelAndView delete(ModelMap mv) throws SQLException,ClassNotFoundException;
    ModelAndView insert(ModelMap mv) throws SQLException,ClassNotFoundException;
    ModelAndView update(ModelMap mv) throws SQLException,ClassNotFoundException;
}
