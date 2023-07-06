package com.companyname.servicename.infradetails.persistence.adapter;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;

import com.companyname.servicename.core.custom.annotation.Transactional;
import com.companyname.servicename.core.domain.model.Category;
import com.companyname.servicename.core.domain.persistence.port.CategoryPersistencePort;
import com.companyname.servicename.infradetails.persistence.mapper.CategoryRepositoryConverter;
import com.companyname.servicename.infradetails.persistence.repository.CategoryRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CategoryPersistencePortImpl implements CategoryPersistencePort {

	@Value("${test.property}")
	private String test;

	private final CategoryRepository categoryRepository;

	private final CategoryRepositoryConverter categoryRepositoryConverter;

	@Override
	@Transactional
	public Collection<Category> getAllCategories() {
		log.info("in details port impl " + test);
		return categoryRepository.findAll().stream()
				.map(entity -> categoryRepositoryConverter.mapToModel(entity))
				.collect(Collectors.toList());
		
	}

	@Override
	public void saveCategory(final Category category) {
		categoryRepository.save(categoryRepositoryConverter.mapToEntity(category));
	}

	public Boolean doesCategoryNameExists(final String name) {
		return !categoryRepository.findByName(name).isEmpty();
	}

}
