package com.companyname.servicename.core.domain.usecase;

import java.util.Collection;

import com.companyname.servicename.core.domain.model.Category;

public interface GetAllCategoriesUseCase {

	public Collection<Category> execute();
	
}
