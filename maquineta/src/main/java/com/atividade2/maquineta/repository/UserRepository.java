package com.atividade2.maquineta.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.atividade2.maquineta.model.User;

@RepositoryRestResource(collectionResourceRel = "User", path = "User")
public interface UserRepository extends PagingAndSortingRepository<User, Integer>{

}
