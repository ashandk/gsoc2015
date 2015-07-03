/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.apache.stratos.healthstatistics.rest.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.apache.stratos.healthstatistics.rest.dao.MemberDAO;
import org.apache.stratos.healthstatistics.rest.exception.RequiredFieldException;
import org.apache.stratos.healthstatistics.rest.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;


public class MemberServiceImpl extends BaseService implements MemberService{
    @Autowired
    private MemberDAO memberDAO;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    


    public List<String> getAllMembers() throws RequiredFieldException{
        return getRequiredFieldArray(memberDAO.getAllMembers(),"Id");
    }

    public List<Object[]> getMemoryConsumption(String clusterId, String startTime, String endTime) throws RequiredFieldException,ParseException{
        
        return getRequiredFieldsArray(memberDAO.getMemoryConsumption(clusterId, df.parse(startTime), df.parse(endTime)),"MemoryConsumption","MemoryConsumptionTime");
    }

    public List<Object[]> getLoadAverage(String clusterId, String startTime, String endTime) throws RequiredFieldException,ParseException{
        return getRequiredFieldsArray(memberDAO.getLoadAverage(clusterId, df.parse(startTime), df.parse(endTime)),"LoadAverage","LoadAverageTime");
    }

    public List<Object[]> getRequestOnFlight(String clusterId, String startTime, String endTime) throws RequiredFieldException,ParseException{
        return getRequiredFieldsArray(memberDAO.getRequestOnFlight(clusterId, df.parse(startTime), df.parse(endTime)),"RequestOnFlight","RequestOnFlightTime");
    }
    
}
