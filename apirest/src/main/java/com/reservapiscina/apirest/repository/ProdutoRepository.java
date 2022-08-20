package com.reservapiscina.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reservapiscina.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
}
