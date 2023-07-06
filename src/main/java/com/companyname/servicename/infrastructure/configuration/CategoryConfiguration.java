package com.companyname.servicename.infrastructure.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.companyname.servicename.core.domain.persistence.port.CategoryPersistencePort;
import com.companyname.servicename.core.domain.usecase.GetAllCategoriesUseCase;
import com.companyname.servicename.core.domain.usecase.impl.GetAllCategoriesUseCaseImpl;
import com.companyname.servicename.infradetails.persistence.adapter.CategoryPersistencePortImpl;
import com.companyname.servicename.infradetails.persistence.mapper.CategoryRepositoryConverter;
import com.companyname.servicename.infradetails.persistence.repository.CategoryRepository;

@Configuration
public class CategoryConfiguration {

	
	@Autowired
	private CategoryRepository categoryRepository;


	@Bean
	public CategoryRepositoryConverter createCategoryRepositoryConverter() {
		return new CategoryRepositoryConverter();
	}
	
	@Bean
	public CategoryPersistencePort createCategoryPersistencePortImpl() {
		return new CategoryPersistencePortImpl(categoryRepository, createCategoryRepositoryConverter());
	}

	@Bean
	public GetAllCategoriesUseCase createGetAllCategoriesUseCase() {
		return new GetAllCategoriesUseCaseImpl(createCategoryPersistencePortImpl());
	}

}