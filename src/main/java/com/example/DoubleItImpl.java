package com.example;

import org.apache.cxf.annotations.SchemaValidation;

import javax.jws.WebService;

@WebService
//@SchemaValidation
public class DoubleItImpl implements DoubleItPortType {

    @Override
    public int doubleIt(int numberToDouble) {
        return 0;
    }
}
