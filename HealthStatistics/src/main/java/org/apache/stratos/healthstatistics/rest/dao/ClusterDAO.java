/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.stratos.healthstatistics.rest.dao;

import java.util.Date;
import java.util.List;
import org.apache.stratos.healthstatistics.rest.model.Cluster;


public interface ClusterDAO {

    public List<Cluster> getAllClusters();

    public List<Cluster> getMemoryConsumption(String clusterId, Date startTime, Date endTime);

    public List<Cluster> getLoadAverage(String clusterId, Date startTime, Date endTime);

    public List<Cluster> getRequestOnFlight(String clusterId, Date startTime, Date endTime);

}
