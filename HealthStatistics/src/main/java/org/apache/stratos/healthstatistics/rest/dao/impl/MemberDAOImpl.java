/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.stratos.healthstatistics.rest.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.stratos.healthstatistics.rest.dao.MemberDAO;
import org.apache.stratos.healthstatistics.rest.model.Cluster;
import org.apache.stratos.healthstatistics.rest.model.Member;


public class MemberDAOImpl implements MemberDAO {

    public List<Member> getAllMembers() {
        List<Member> members = new ArrayList< Member>();
        Member member1 = new Member();

        member1.setLoadAverageTime(new Date());
        member1.setId("memberOne");
        members.add(member1);

        Member member2 = new Member();

        member2.setId("memberTwo");
        members.add(member2);

        return members;

    }

    public List<Member> getMemoryConsumption(String clusterId, Date startTime, Date endTime) {
        List<Member> members = new ArrayList<Member>();
        Member member1 = new Member();

        member1.setLoadAverageTime(new Date());
        member1.setMemoryConsumptionTime(new Date());
        member1.setMemoryConsumption("10.3");
        members.add(member1);

        Member member2 = new Member();
        member2.setMemoryConsumptionTime(new Date());
        member2.setMemoryConsumption("20.1");
        members.add(member2);

        return members;
    }

    public List<Member> getLoadAverage(String clusterId, Date startTime, Date endTime) {
        List<Member> members = new ArrayList<Member>();
        Member member1 = new Member();

        member1.setLoadAverageTime(new Date());
        member1.setLoadAverage("30.1");
        members.add(member1);

        Member member2 = new Member();
        member2.setLoadAverageTime(new Date());
        member2.setLoadAverage("40.1");
        members.add(member2);

        return members;
    }

    public List<Member> getRequestOnFlight(String clusterId, Date startTime, Date endTime) {
        List<Member> members = new ArrayList<Member>();
        Member member1 = new Member();

        member1.setRequestOnFlightTime(new Date());
        member1.setRequestOnFlight("50.5");
        members.add(member1);

        Member member2 = new Member();
        member2.setRequestOnFlightTime(new Date());
        member2.setRequestOnFlight("50.5");
        members.add(member2);

        return members;
    }

}
