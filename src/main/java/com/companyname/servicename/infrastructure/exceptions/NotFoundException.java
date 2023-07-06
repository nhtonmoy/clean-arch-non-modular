package com.companyname.servicename.infrastructure.exceptions;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException {
	private static final long serialVersionUID = -6870732210014274010L;

	public NotFoundException(final String message) {
		super(message);
	}

}
