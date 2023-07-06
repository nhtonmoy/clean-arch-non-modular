package com.companyname.servicename.infrastructure.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class BadRequestException extends RuntimeException{

	private static final long serialVersionUID = -5330068136795055851L;

	public BadRequestException(final String message) {
		super(message);
	}

}
