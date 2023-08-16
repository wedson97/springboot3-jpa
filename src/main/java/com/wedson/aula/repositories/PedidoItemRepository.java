package com.wedson.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedson.aula.entities.PedidoItem;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long>{

}
