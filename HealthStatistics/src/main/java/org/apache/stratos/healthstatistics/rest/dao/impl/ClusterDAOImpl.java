/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.stratos.healthstatistics.rest.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.stratos.healthstatistics.rest.dao.ClusterDAO;
import org.apache.stratos.healthstatistics.rest.model.Cluster;


public class ClusterDAOImpl implements ClusterDAO {

    public List<Cluster> getAllClusters() {
        List<Cluster> clusters = new ArrayList<Cluster>();
        Cluster cluster1 = new Cluster();

        cluster1.setLoadAverageTime(new Date());
        cluster1.setId("clusterOne");
        clusters.add(cluster1);

        Cluster cluster2 = new Cluster();

        cluster2.setId("clusterTwo");
        clusters.add(cluster2);

        return clusters;

    }

    public List<Cluster> getMemoryConsumption(String clusterId, Date startTime, Date endTime) {
        List<Cluster> clusters = new ArrayList<Cluster>();
        Cluster cluster1 = new Cluster();

        cluster1.setLoadAverageTime(new Date());
        cluster1.setMemoryConsumptionTime(new Date());
        cluster1.setMemoryConsumption("10.3");
        clusters.add(cluster1);

        Cluster cluster2 = new Cluster();
        cluster2.setMemoryConsumptionTime(new Date());
        cluster2.setMemoryConsumption("20.1");
        clusters.add(cluster2);

        return clusters;
    }

    public List<Cluster> getLoadAverage(String clusterId, Date startTime, Date endTime) {
        List<Cluster> clusters = new ArrayList<Cluster>();
        Cluster cluster1 = new Cluster();

        cluster1.setLoadAverageTime(new Date());
        cluster1.setLoadAverage("30.1");
        clusters.add(cluster1);

        Cluster cluster2 = new Cluster();
        cluster2.setLoadAverageTime(new Date());
        cluster2.setLoadAverage("40.1");
        clusters.add(cluster2);

        return clusters;
    }

    public List<Cluster> getRequestOnFlight(String clusterId, Date startTime, Date endTime) {
        List<Cluster> clusters = new ArrayList<Cluster>();
        Cluster cluster1 = new Cluster();

        cluster1.setRequestOnFlightTime(new Date());
        cluster1.setRequestOnFlight("50.5");
        clusters.add(cluster1);

        Cluster cluster2 = new Cluster();
        cluster2.setRequestOnFlightTime(new Date());
        cluster2.setRequestOnFlight("50.5");
        clusters.add(cluster2);

        return clusters;
    }

}
