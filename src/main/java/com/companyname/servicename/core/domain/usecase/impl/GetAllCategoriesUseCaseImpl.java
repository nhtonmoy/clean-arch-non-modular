package com.companyname.servicename.core.domain.usecase.impl;

import java.util.Collection;

import com.companyname.servicename.core.domain.model.Category;
import com.companyname.servicename.core.domain.persistence.port.CategoryPersistencePort;
import com.companyname.servicename.core.domain.usecase.GetAllCategoriesUseCase;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class GetAllCategoriesUseCaseImpl implements GetAllCategoriesUseCase {
	private final CategoryPersistencePort categoryPersistencePort;
	
	public Collection<Category> execute() {
		log.info("in core use case");
		return categoryPersistencePort.getAllCategories();
	}

}
