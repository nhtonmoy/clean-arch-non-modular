package com.companyname.servicename.core.domain.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Category implements Serializable{

	private Long id;
	
	private String name;

	private Boolean available;

	
}
