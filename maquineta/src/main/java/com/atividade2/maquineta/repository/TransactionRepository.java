package com.atividade2.maquineta.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.atividade2.maquineta.model.Transaction;

@RepositoryRestResource(collectionResourceRel = "Transaction" , path = "Transaction")
public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Integer>{

}
