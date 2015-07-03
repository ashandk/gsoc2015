/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.apache.stratos.healthstatistics.rest.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import java.util.Date;


public class Member {

	private static final long serialVersionUID = -7788619177798333711L;
	
	private String id;
        private String memoryConsumption;
        private Date memoryConsumptionTime;
        private String loadAverage;
        private Date loadAverageTime;
        private String requestOnFlight;
        private Date requestOnFlightTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemoryConsumption() {
        return memoryConsumption;
    }

    public void setMemoryConsumption(String memoryConsumption) {
        this.memoryConsumption = memoryConsumption;
    }

    @JsonSerialize(using=DateSerializer.class)
    public Date getMemoryConsumptionTime() {
        return memoryConsumptionTime;
    }

    public void setMemoryConsumptionTime(Date memoryConsumptionTime) {
        this.memoryConsumptionTime = memoryConsumptionTime;
    }

    public String getLoadAverage() {
        return loadAverage;
    }

    public void setLoadAverage(String loadAverage) {
        this.loadAverage = loadAverage;
    }

    @JsonSerialize(using=DateSerializer.class)
    public Date getLoadAverageTime() {
        return loadAverageTime;
    }

    
    public void setLoadAverageTime(Date loadAverageTime) {
        this.loadAverageTime = loadAverageTime;
    }

    public String getRequestOnFlight() {
        return requestOnFlight;
    }

    public void setRequestOnFlight(String requestOnFlight) {
        this.requestOnFlight = requestOnFlight;
    }

    @JsonSerialize(using=DateSerializer.class)
    public Date getRequestOnFlightTime() {
        return requestOnFlightTime;
    }

    public void setRequestOnFlightTime(Date requestOnFlightTime) {
        this.requestOnFlightTime = requestOnFlightTime;
    }
        
	
	
	
}
