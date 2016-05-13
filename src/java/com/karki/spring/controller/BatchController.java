/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.spring.controller;

import com.karki.spring.dao.BatchDao;
import com.karki.spring.entity.Batch;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author sharmila
 */
@Controller
@RequestMapping(value ={ "/","/batch"})
public class BatchController {
    
    @Autowired
    private BatchDao batchDao;
   
    @RequestMapping(value = "/editBatch",method = RequestMethod.GET)
    public String editPage(Model model,@ModelAttribute Batch batch){
        model.addAttribute("hello", "hii");
        return "batch/EditBatch";
    }
    @RequestMapping("deleteBatch")
    public ModelAndView delete(@RequestParam int id) throws SQLException, ClassNotFoundException {
        batchDao.delete(id);
        return new ModelAndView("redirect:batchindex");
    }

    
    public ModelAndView insert() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public ModelAndView update(ModelMap mv) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
