package com.example2;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.validation.Valid;

import org.apache.cxf.annotations.SchemaValidation;

@WebService
@SchemaValidation
public class PersonWS {

	@WebMethod
	public String process(@Valid Person person){

		return "ok";

	}
}
