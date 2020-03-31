package com.atividade2.maquineta.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.atividade2.maquineta.model.Card;

@RepositoryRestResource(collectionResourceRel = "Card" , path = "Card")
public interface CardRepository extends PagingAndSortingRepository<Card, String>{

}
