/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.spring.dao.impl;

import com.karki.spring.dao.FacilitatorDao;
import com.karki.spring.entity.Facilitator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.StringTokenizer;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sharmila
 */
@Repository
public class FacilitatorDaoImpl implements FacilitatorDao {
     @Override
    public int insert(Facilitator facilitator) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Facilitator facilitator) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Facilitator getById(int facilitatorId) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int facilitatorId) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Facilitator> getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Facilitator> search(String param) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadData(String path) throws IOException, ClassNotFoundException, SQLException {
        Facilitator fac = new Facilitator();
        String line = "";
        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
        while ((line = reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line, ",");
            fac.setId(Integer.parseInt(tokenizer.nextToken()));
            fac.setName(tokenizer.nextToken());
            fac.setSalary(Double.parseDouble(tokenizer.nextToken()));
            insert(fac);
        }
        reader.close();
    }

    @Override
    public void exportData(String filename, String content) throws IOException, ClassNotFoundException, SQLException {
        FileWriter fileWriter = new FileWriter(new File(filename));
        fileWriter.write(content);
        fileWriter.close();
    }

    private Facilitator mapData(ResultSet rs) throws ClassNotFoundException, SQLException {
      Facilitator  facilitator = new Facilitator();
        facilitator.setId(rs.getInt("id"));
        facilitator.setName(rs.getString("facilitator_name"));

        return facilitator;
    }

   
}
