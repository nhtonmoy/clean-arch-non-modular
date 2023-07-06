package com.companyname.servicename.infrastructure.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.companyname.servicename.core.domain.model.Category;
import com.companyname.servicename.core.domain.usecase.GetAllCategoriesUseCase;

//import com.companyname.servicename.core.domain.model.Category;
//import com.companyname.servicename.core.domain.usecase.GetAllCategoriesUseCase;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/clean-arch/api/private/v1/category")
@RequiredArgsConstructor
@Slf4j
public class CategoryController {
	@Value("${test.property}")
	private String test;
	
	private final GetAllCategoriesUseCase getAllCategoriesUseCase;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<Category> getCategories() {
		log.info("in infrastructure controller " + test);
		return getAllCategoriesUseCase.execute();
	}
	
	@GetMapping(params = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
	public String test() {
		return "";
	}

}
