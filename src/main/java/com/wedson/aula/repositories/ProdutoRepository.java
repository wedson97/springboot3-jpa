package com.wedson.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedson.aula.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
}
