package com.companyname.servicename.core.domain.persistence.port;

import java.util.Collection;

import com.companyname.servicename.core.domain.model.Category;


public interface CategoryPersistencePort {

	public Collection<Category> getAllCategories();
	
	public void saveCategory(Category category) ;

	public Boolean doesCategoryNameExists(String name);
}
