package com.atividade2.maquineta.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.atividade2.maquineta.model.Terminal;

@RepositoryRestResource(collectionResourceRel = "Terminal", path = "Terminal")
public interface TerminalRepository extends PagingAndSortingRepository<Terminal, Integer>{

}
