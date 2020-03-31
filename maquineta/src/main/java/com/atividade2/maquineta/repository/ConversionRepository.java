package com.atividade2.maquineta.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.atividade2.maquineta.model.Conversion;

@RepositoryRestResource(collectionResourceRel = "Conversion" , path = "Conversion")
public interface ConversionRepository extends PagingAndSortingRepository<Conversion, Integer>{

}
