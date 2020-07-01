package com.hiberus.microservice.logistic.service;

import java.util.Date;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hiberus.microservice.logistic.models.entity.ShippingOrder;
import com.hiberus.microservice.logistic.models.repository.ShippingOrderRepository;
import com.hiberus.microservice.logistic.util.Constants;
import com.hiberus.microservice.logistic.util.ResponseGenerics;

/**
 * Interface Implementation Logistic
 * 
 * @author Roxana Andrea Jaramillo Cobos
 * @version 0.0.1
 */
@Service
public class LogisticServiceImpl implements ILogisticService {

	protected Logger logger = LogManager.getLogger(LogisticServiceImpl.class);
	private final ShippingOrderRepository shippingOrderRepository;

	@Autowired
	public LogisticServiceImpl(ShippingOrderRepository shippingOrderRepository) {
		this.shippingOrderRepository = shippingOrderRepository;
	}

	@Override
	public ResponseGenerics generateShippingOrder(Long idOrder) {
		/*
		 * Shipping order creation NOTE: Constant handling and mock functions for
		 * practical purposes only
		 */
		try {
			ShippingOrder shippingOrder = new ShippingOrder();
			shippingOrder.setCreationDate(new Date());
			shippingOrder.setIdOrder(idOrder);
			shippingOrder.setIdTransportCompany(Constants.TRANSPORT_COMPANY.get("FEDEX"));
			shippingOrder.setShippingCost(new Long(12000));
			Long responseTrackingNumber = assignTrackingNumber(Constants.TRANSPORT_COMPANY.get("FEDEX"));
			shippingOrder.setTrackingNumber(responseTrackingNumber);
			ShippingOrder result = shippingOrderRepository.save(shippingOrder);
			if (result != null) {
				return new ResponseGenerics(HttpStatus.OK.toString(),
						"Successful shipping assignment; Track by carrier FEDEX with the tracking number: "
								+ responseTrackingNumber + " date: " + new Date(),
						null);
			} else {
				return new ResponseGenerics(HttpStatus.CONFLICT.toString(),
						"Shipping assignment process failed for order id " + idOrder + " , contact your administrator",
						null);
			}
		} catch (Exception ex) {
			logger.error("ERROR: " + Thread.currentThread().getStackTrace()[1].getMethodName() + ex.getMessage());
			return new ResponseGenerics(HttpStatus.INTERNAL_SERVER_ERROR.toString(),
					"The operation could not be completed, contact your administrator", null);
		}
	}

	/* Method that simulates the response of the transport company service */
	private Long assignTrackingNumber(Long idTransportCompany) {
		long x = 1234L;
		long y = 23455555L;
		Random r = new Random();
		return x+((long)(r.nextDouble()*(y-x)));
	}

}
