package com.wedson.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedson.aula.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
