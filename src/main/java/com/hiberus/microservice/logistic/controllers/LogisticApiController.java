package com.hiberus.microservice.logistic.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hiberus.microservice.logistic.service.ILogisticService;
import com.hiberus.microservice.logistic.util.ResponseGenerics;

/**
 * Controller REST Logistic
 *
 * @author Roxana Andrea Jaramillo Cobos
 */

@RestController
public class LogisticApiController implements LogisticApi {

	private ILogisticService logisticService;

	@Autowired
	public LogisticApiController(final ILogisticService logisticService) {
		this.logisticService = logisticService;
	}

	@Override
	public ResponseGenerics generateShippingOrder(@PathParam("idOrder") Long idOrder) {
		return logisticService.generateShippingOrder(idOrder);
	}
}