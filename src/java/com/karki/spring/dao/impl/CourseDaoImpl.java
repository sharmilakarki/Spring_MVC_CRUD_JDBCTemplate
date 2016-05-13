/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.spring.dao.impl;

import com.karki.spring.constant.CourseSQL;
import com.karki.spring.dao.CourseDao;
import com.karki.spring.entity.Course;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sharmila
 */
@Repository
public class CourseDaoImpl implements CourseDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Course course) throws ClassNotFoundException, SQLException {
        return jdbcTemplate.update(CourseSQL.Course_insert, new Object[]{course.getCourseName(), course.getCourseDescription(), course.getDurationType(), course.getFees(), course.getDuration(), course.isStatus()});
    }

    @Override
    public int update(Course course) throws ClassNotFoundException, SQLException {
        return jdbcTemplate.update(CourseSQL.UPDATE, new Object[]{course.getCourseName(), course.getCourseDescription(), course.getDurationType(), course.getFees(), course.getDuration(), course.isStatus(),course.getId()});
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        return jdbcTemplate.update(CourseSQL.DELETE, new Object[]{id});
    }

    @Override
    public List<Course> getAll() throws ClassNotFoundException, SQLException {
        return jdbcTemplate.query(CourseSQL.GETALL, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
               return mapData(rs);
            }
        });
    }

    @Override
    public Course getById(int id) throws ClassNotFoundException, SQLException {
        return jdbcTemplate.queryForObject(CourseSQL.GETBYID, new Object[]{id}, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            
            }
        });
    }

    private Course mapData(ResultSet rs) throws SQLException {
        Course course = new Course();
        course.setId(rs.getInt("id"));
        course.setCourseName(rs.getString("course_name"));
        course.setCourseDescription(rs.getString("course_description"));
        course.setDurationType(rs.getString("duration_type"));
        course.setFees(rs.getDouble("fees"));
        course.setDuration(rs.getInt("duration"));
        course.setAddedDate(rs.getDate("added_date"));
        course.setModifiedDate(rs.getDate("modified_date"));
        course.setStatus(rs.getBoolean("status"));
        return course;
    }

    @Override
    public Course searchByName(String name) throws ClassNotFoundException, SQLException {
        
        return jdbcTemplate.queryForObject(CourseSQL.GETBYNAME, new Object[]{name}, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
               return mapData(rs);
            }
        });
    }
}
