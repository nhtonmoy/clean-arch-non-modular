package com.companyname.servicename.infradetails.persistence.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companyname.servicename.core.domain.model.Category;
import com.companyname.servicename.infradetails.persistence.entity.CategoryEntity;

//@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

	public Collection<Category> findByName(String name);
}
