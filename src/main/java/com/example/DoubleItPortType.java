package com.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-04-11T20:01:01.870+02:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://www.example.org/contract/DoubleIt", name = "DoubleItPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface DoubleItPortType {

    @WebMethod(operationName = "DoubleIt")
    @RequestWrapper(localName = "DoubleIt", targetNamespace = "http://www.example.org/schema/DoubleIt", className = "com.example.DoubleIt")
    @ResponseWrapper(localName = "DoubleItResponse", targetNamespace = "http://www.example.org/schema/DoubleIt", className = "com.example.DoubleItResponse")
    @WebResult(name = "doubledNumber", targetNamespace = "")
    public int doubleIt(
        @WebParam(name = "numberToDouble", targetNamespace = "")
        int numberToDouble
    );
}