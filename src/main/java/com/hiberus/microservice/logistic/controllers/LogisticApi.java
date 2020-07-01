package com.hiberus.microservice.logistic.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hiberus.microservice.logistic.util.ResponseGenerics;

import io.swagger.annotations.ApiOperation;

/**
 * Enpoint REST Logistic
 *
 * @author Roxana Andrea Jaramillo Cobos
 * @version 0.0.1
 */
@CrossOrigin("*")
@RequestMapping("/logistic")
public interface LogisticApi {

	/**
	 * Generate shipping order
	 * 
	 * @param Long idOrder
	 * @return ResponseGenerics
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/generateShippingOrder/{idOrder}", produces = "application/json; charset=UTF-8")
	@ApiOperation(value = "Generate shipping order", notes = "Generate shipping order")
	ResponseGenerics generateShippingOrder(@PathVariable Long idOrder);

}