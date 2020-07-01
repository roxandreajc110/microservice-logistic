package com.hiberus.microservice.logistic.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hiberus.microservice.logistic.util.Constants;

import io.swagger.annotations.ApiModelProperty;

/**
 * Business entity ShippingOrder.
 * 
 * @author Roxana Andrea Jaramillo Cobos
 * @version 0.0.1
 */
@Entity
@Table(name = "shipping_order")
public class ShippingOrder implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", nullable = false, length = 10)
	@ApiModelProperty(value = "Shipping Order Identifier", name = "id", dataType = "Long", example = "strategy = GenerationType.IDENTITY")
	private Long id;

	@NotNull(message = "Id order " + Constants.MSN_VALID_NULL)
	@Column(nullable = false, length = 10)
	@ApiModelProperty(value = "Identification Order", name = "idOrder", dataType = "Long", example = "101")
	private Long idOrder;

	@Column(nullable = false, length = 10)
	@ApiModelProperty(value = "Identification transport company", name = "idTransportCompany", dataType = "Long", example = "4000")
	private Long idTransportCompany;

	@Column(nullable = false, length = 10)
	@ApiModelProperty(value = "Tracking number assigned by the transport company", name = "trackingNumber", dataType = "Long", example = "42220")
	private Long trackingNumber;

	@ApiModelProperty(value = "Shipping cost", name = "shippingCost", dataType = "Long", example = "12000")
	@Column(nullable = false)
	private Long shippingCost;

	@Column(name = "creation_date", nullable = false, insertable = true, updatable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "COT")
	@ApiModelProperty(value = "Order date shipping order ", name = "creationDate", dataType = "Date", example = "12-04-2020")
	private Date creationDate;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the idOrder
	 */
	public Long getIdOrder() {
		return idOrder;
	}

	/**
	 * @param idOrder the idOrder to set
	 */
	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}

	/**
	 * @return the idTransportCompany
	 */
	public Long getIdTransportCompany() {
		return idTransportCompany;
	}

	/**
	 * @param idTransportCompany the idTransportCompany to set
	 */
	public void setIdTransportCompany(Long idTransportCompany) {
		this.idTransportCompany = idTransportCompany;
	}

	/**
	 * @return the trackingNumber
	 */
	public Long getTrackingNumber() {
		return trackingNumber;
	}

	/**
	 * @param trackingNumber the trackingNumber to set
	 */
	public void setTrackingNumber(Long trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	/**
	 * @return the shippingCost
	 */
	public Long getShippingCost() {
		return shippingCost;
	}

	/**
	 * @param shippingCost the shippingCost to set
	 */
	public void setShippingCost(Long shippingCost) {
		this.shippingCost = shippingCost;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
