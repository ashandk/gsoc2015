package org.apache.stratos.healthstatistics.rest.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.apache.stratos.healthstatistics.rest.exception.RequiredFieldException;
import org.apache.stratos.healthstatistics.rest.service.ClusterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ClusterController {

    private static final Logger logger = LoggerFactory.getLogger(ClusterController.class);
    private static final String GET_ALL_CLUSTERS = "/cluster/getAllClusters";
    private static final String GET_MEMORY_CONSUMPTION = "/cluster/getMemoryConsumption/{clusterId}/{startTime}/{endTime}";
    private static final String GET_LOAD_AVERAGE = "/cluster/getLoadAverage/{clusterId}/{startTime}/{endTime}";
    private static final String GET_REQUEST_ON_FLIGHT = "/cluster/getRequestOnFlight/{clusterId}/{startTime}/{endTime}";
    
    @Autowired
    private ClusterService clusterService;

    @RequestMapping(value = GET_ALL_CLUSTERS, method = RequestMethod.GET)
    public @ResponseBody List<String> getAllClusters() {
        logger.info("Start getAllClusters");
        
        List<String> idList= new ArrayList<String>();
        try {
            idList = clusterService.getAllClusters();
        } catch (RequiredFieldException ex) {
            logger.error("RequiredFieldException: ",ex);
        }
        return idList;
    }

    @RequestMapping(value = GET_MEMORY_CONSUMPTION, method = RequestMethod.GET)
    public @ResponseBody List<Object[]> getMemoryConsumption(@PathVariable("clusterId") String clusterId,@PathVariable("startTime") String startTime,@PathVariable("endTime") String endTime) {
        logger.info("Start getMemoryConsumption");
        List<Object[]> memConsList= new ArrayList<Object[]>();
        try {
            memConsList = clusterService.getMemoryConsumption(clusterId, startTime, endTime);
        } catch (RequiredFieldException ex) {
            logger.error("RequiredFieldException: ",ex);
        } catch (ParseException ex) {
            logger.error("ParseException: ",ex);
        }
        return memConsList;
    }
     @RequestMapping(value = GET_LOAD_AVERAGE, method = RequestMethod.GET)
    public @ResponseBody List<Object[]> getLoadAverage(@PathVariable("clusterId") String clusterId,@PathVariable("startTime") String startTime,@PathVariable("endTime") String endTime) {
        logger.info("Start getLoadAverage");
        List<Object[]> loadAvgList= new ArrayList<Object[]>();
        try {
            loadAvgList = clusterService.getLoadAverage(clusterId, startTime, endTime);
        } catch (RequiredFieldException ex) {
            logger.error("RequiredFieldException: ",ex);
        }catch (ParseException ex) {
            logger.error("ParseException: ",ex);
        }
        return loadAvgList;
    }
     @RequestMapping(value = GET_REQUEST_ON_FLIGHT, method = RequestMethod.GET)
    public @ResponseBody List<Object[]> getRequestOnFlight(@PathVariable("clusterId") String clusterId,@PathVariable("startTime") String startTime,@PathVariable("endTime") String endTime) {
        logger.info("Start getRequestOnFlight");
        List<Object[]> requestOnFlightList= new ArrayList<Object[]>();
        try {
            requestOnFlightList = clusterService.getRequestOnFlight(clusterId, startTime, endTime);
        } catch (RequiredFieldException ex) {
            logger.error("RequiredFieldException: ",ex);
        }catch (ParseException ex) {
            logger.error("ParseException: ",ex);
        }
        return requestOnFlightList;
    }

}
