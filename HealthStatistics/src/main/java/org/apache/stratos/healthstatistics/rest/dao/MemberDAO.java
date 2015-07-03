/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.apache.stratos.healthstatistics.rest.dao;

import java.util.Date;
import java.util.List;
import org.apache.stratos.healthstatistics.rest.model.Cluster;
import org.apache.stratos.healthstatistics.rest.model.Member;


public interface MemberDAO {
     public List<Member> getAllMembers();

    public List<Member> getMemoryConsumption(String clusterId, Date startTime, Date endTime);

    public List<Member> getLoadAverage(String clusterId, Date startTime, Date endTime);

    public List<Member> getRequestOnFlight(String clusterId, Date startTime, Date endTime);

    
}
