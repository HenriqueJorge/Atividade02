package com.atividade2.maquineta.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.atividade2.maquineta.model.Voucher;

@RepositoryRestResource(collectionResourceRel = "Voucher", path = "Voucher")
public interface VoucherRepository extends PagingAndSortingRepository<Voucher, String>{

}
