package com.hiberus.microservice.logistic.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.hiberus.microservice.logistic.models.entity.ShippingOrder;

/**
 * Interface DAO extends of CrudRepository
 * 
 * @author Roxana Andrea Jaramillo Cobos
 * @version 0.0.1
 */

public interface ShippingOrderRepository extends CrudRepository<ShippingOrder, Long> {

}