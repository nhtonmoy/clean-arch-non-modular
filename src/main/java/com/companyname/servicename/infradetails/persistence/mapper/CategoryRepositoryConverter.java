package com.companyname.servicename.infradetails.persistence.mapper;

import com.companyname.servicename.core.domain.model.Category;
import com.companyname.servicename.infradetails.persistence.entity.CategoryEntity;

public class CategoryRepositoryConverter implements RepositoryConverter<CategoryEntity, Category> {

	@Override
	public CategoryEntity mapToEntity(final Category persistenceObject) {
		return new CategoryEntity(persistenceObject.getId(), persistenceObject.getName(), persistenceObject.getAvailable());
	}

	@Override
	public Category mapToModel(final CategoryEntity entityObject) {
		return new Category(entityObject.getId(), entityObject.getName(), entityObject.getAvailable());
	}
}
