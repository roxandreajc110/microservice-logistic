package com.hiberus.microservice.logistic.service;

import com.hiberus.microservice.logistic.util.ResponseGenerics;

/**
 * Interface Service Logistic
 * 
 * @author Roxana Andrea Jaramillo Cobos
 * @version 0.0.1
 */

public interface ILogisticService {

	/**
	 * Generate shipping order
	 * 
	 * @param Long idOrder
	 * @return ResponseGenerics
	 */
	ResponseGenerics generateShippingOrder(Long idOrder);

}
