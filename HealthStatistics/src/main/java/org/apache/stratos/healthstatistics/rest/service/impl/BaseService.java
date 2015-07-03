/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.stratos.healthstatistics.rest.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.stratos.healthstatistics.rest.exception.RequiredFieldException;


public class BaseService {

    protected List<String> getRequiredFieldArray(List modelObjectList, String fieldName) throws RequiredFieldException {
        List fieldList = new ArrayList();
        try {
            for (Object object : modelObjectList) {
                Class<?> clazz = object.getClass();
                Method method = clazz.getMethod("get" + fieldName, null);
                method.setAccessible(true);
                Object fieldValue = method.invoke(object, null);
                fieldList.add(fieldValue);
            }

        } catch (Exception e) {
            throw new RequiredFieldException(e.getMessage());
        }

        return fieldList;
    }
    protected List<Object[]> getRequiredFieldsArray(List modelObjectList, String fieldOneName, String fieldTwoName) throws RequiredFieldException {
        //TODO refactor this mthod to support more than two fields
        List <Object[]>fieldList = new ArrayList<Object[]>();
        try {
            for (Object object : modelObjectList) {
                Class<?> clazz = object.getClass();
                Method methodOne = clazz.getMethod("get" + fieldOneName, null);
                methodOne.setAccessible(true);
                Object fieldOneValue = methodOne.invoke(object, null);
                
                Method methodTwo = clazz.getMethod("get" + fieldTwoName, null);
                methodTwo.setAccessible(true);
                Object fieldTwoValue = methodTwo.invoke(object, null);
                Object [] objectList= {fieldOneValue,fieldTwoValue};
                fieldList.add(objectList);
            }
        } catch (Exception e) {
            throw new RequiredFieldException(e.getMessage());
        }
        return fieldList;
    }

}
