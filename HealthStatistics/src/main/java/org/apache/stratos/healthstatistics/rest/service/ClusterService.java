/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.apache.stratos.healthstatistics.rest.service;

import java.text.ParseException;
import java.util.List;
import org.apache.stratos.healthstatistics.rest.exception.RequiredFieldException;
import org.apache.stratos.healthstatistics.rest.model.Cluster;
import org.springframework.web.bind.annotation.PathVariable;


public interface ClusterService {
   public List<String> getAllClusters()  throws RequiredFieldException;
   public List<Object[]> getMemoryConsumption(String clusterId,String startTime,String endTime)throws RequiredFieldException,ParseException;
   public List<Object[]> getLoadAverage(String clusterId,String startTime,String endTime)throws RequiredFieldException,ParseException;
   public List<Object[]> getRequestOnFlight(String clusterId,String startTime,String endTime)throws RequiredFieldException,ParseException;
}
