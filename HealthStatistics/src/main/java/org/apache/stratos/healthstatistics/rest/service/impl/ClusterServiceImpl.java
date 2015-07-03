/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.apache.stratos.healthstatistics.rest.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.stratos.healthstatistics.rest.dao.ClusterDAO;
import org.apache.stratos.healthstatistics.rest.exception.RequiredFieldException;
import org.apache.stratos.healthstatistics.rest.service.ClusterService;
import org.springframework.beans.factory.annotation.Autowired;


public class ClusterServiceImpl extends BaseService implements ClusterService{
    @Autowired
    private ClusterDAO clusterDAO;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    


    public List<String> getAllClusters() throws RequiredFieldException{
        return getRequiredFieldArray(clusterDAO.getAllClusters(),"Id");
    }

    public List<Object[]> getMemoryConsumption(String clusterId, String startTime, String endTime) throws RequiredFieldException,ParseException{
        
        return getRequiredFieldsArray(clusterDAO.getMemoryConsumption(clusterId, df.parse(startTime), df.parse(endTime)),"MemoryConsumption","MemoryConsumptionTime");
    }

    public List<Object[]> getLoadAverage(String clusterId, String startTime, String endTime) throws RequiredFieldException,ParseException{
        return getRequiredFieldsArray(clusterDAO.getLoadAverage(clusterId, df.parse(startTime), df.parse(endTime)),"LoadAverage","LoadAverageTime");
    }

    public List<Object[]> getRequestOnFlight(String clusterId, String startTime, String endTime) throws RequiredFieldException,ParseException{
        return getRequiredFieldsArray(clusterDAO.getRequestOnFlight(clusterId, df.parse(startTime), df.parse(endTime)),"RequestOnFlight","RequestOnFlightTime");
    }
    
}
