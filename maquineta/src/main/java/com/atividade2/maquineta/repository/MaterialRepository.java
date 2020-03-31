package com.atividade2.maquineta.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.atividade2.maquineta.model.Material;

@RepositoryRestResource(collectionResourceRel = "Material", path = "Material")
public interface MaterialRepository extends PagingAndSortingRepository<Material, Integer>{

}
