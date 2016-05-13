/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.spring.controller;

import com.karki.spring.dao.CourseDao;
import com.karki.spring.entity.Course;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sharmila
 */
@Controller
@RequestMapping(value = "/")
public class CourseController {

    @Autowired
    private CourseDao courseDao;

    @RequestMapping(value = "/index", method = RequestMethod.GET)

    public String index(ModelMap mv) throws ClassNotFoundException, SQLException {

        int id = 1;
        mv.addAttribute("course", courseDao.getAll());
        mv.addAttribute("c", courseDao.getById(id));
        return "index";

    }

    @RequestMapping(value = "/searchCourse", method = RequestMethod.GET)
    public String about(ModelMap mv)  throws ClassNotFoundException, SQLException {
        Course course =new Course();
        String name="java";
        mv.addAttribute("s",courseDao.searchByName(name));
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcomePage() {
        return "/welcomePage";
    }

    @RequestMapping("delete")
    public ModelAndView deleteCourse(@RequestParam int id) throws ClassNotFoundException, SQLException {
        courseDao.delete(id);
        return new ModelAndView("redirect:index");
    }

    @RequestMapping("edit")
    public ModelAndView editCourse(@RequestParam int id, @ModelAttribute Course course) throws ClassNotFoundException, SQLException {
        Course courseObj = courseDao.getById(id);
        return new ModelAndView("EditPage", "courseObj", courseObj);
    }

    @RequestMapping(value = "/addCourse")
    public ModelAndView addCourse(@ModelAttribute Course course, BindingResult result) {
        return new ModelAndView("addCourse");
    }

    @RequestMapping("/saveCourse")
    public ModelAndView registerUser(@ModelAttribute("course") Course course) throws ClassNotFoundException, SQLException {
        courseDao.insert(course);
        System.out.println(course.toString());
        return new ModelAndView("redirect:/index");
    }

    @RequestMapping(value = "/editCourse",method = RequestMethod.PUT)
    public ModelAndView updateCourse(@ModelAttribute("course") Course course, @PathVariable Integer id) throws ClassNotFoundException, SQLException {

       
        courseDao.update(course);
        return new  ModelAndView("redirect:index");
    }

}
