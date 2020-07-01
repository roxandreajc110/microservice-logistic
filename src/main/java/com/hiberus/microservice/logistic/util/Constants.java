package com.hiberus.microservice.logistic.util;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	/* Validation response messages */
	public static final String MSN_VALID_NULL = ": null is not allowed, please fill in this field.";
	public static final String MSN_VALID_LENGTH = ": supports a length of ";

	/* Data test */
	public static final Map<String, Long> TRANSPORT_COMPANY = new HashMap<String, Long>() {
		{
			put("AIRBOX", new Long(2000));
			put("FEDEX", new Long(2000));
			put("ACOTRAL", new Long(2000));
		}
	};

}
