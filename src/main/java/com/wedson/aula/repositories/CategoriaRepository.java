package com.wedson.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedson.aula.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
}
