package com.companyname.servicename.infradetails.persistence.mapper;

import java.io.Serializable;

public interface RepositoryConverter<T extends Serializable, P extends Serializable> {

	default T mapToEntity(final P persistenceObject) {
		throw new UnsupportedOperationException();
	}

	default P mapToModel(final T tableObject) {
		throw new UnsupportedOperationException();
	}

}
