/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.spring.dao;

import com.karki.spring.entity.Batch;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sharmila
 */
public interface BatchDao {
     int insert(Batch course) throws ClassNotFoundException,SQLException;
   int update(Batch course)throws ClassNotFoundException,SQLException;
   int delete(int id)throws ClassNotFoundException,SQLException;
   List<Batch> getAll()throws ClassNotFoundException,SQLException;
   Batch getById(int id) throws ClassNotFoundException,SQLException;
}
