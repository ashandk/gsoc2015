/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.apache.stratos.healthstatistics.rest.exception;


public class RequiredFieldException extends Exception{
    private static final long serialVersionUID = 1L;

    public RequiredFieldException(String message) {
        super(message);
    }
    
}
