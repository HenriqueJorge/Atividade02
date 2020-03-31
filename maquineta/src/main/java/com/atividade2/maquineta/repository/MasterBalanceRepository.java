package com.atividade2.maquineta.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.atividade2.maquineta.model.MasterBalance;

@RepositoryRestResource(collectionResourceRel = "MasterBalance" , path = "MasterBalance")
public interface MasterBalanceRepository extends PagingAndSortingRepository<MasterBalance, Integer>{

}
