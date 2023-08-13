package com.wedson.aula.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wedson.aula.entities.enums.PedidoStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_pedido")
public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'z'", timezone = "GMT")
	private Instant momento;
	
	private Integer pedidoStatus;
	
	@ManyToOne
	@JoinColumn(name="idCliente")
	private User cliente;
	
	
	public Pedido() {
	}


	public Pedido(Long id, Instant momento, User cliente, PedidoStatus pedidoStatus) {
		super();
		this.id = id;
		this.momento = momento;
		this.cliente = cliente;
		setPedidoStatus(pedidoStatus);
	}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Instant getMomento() {
		return momento;
	}


	public void setMomento(Instant momento) {
		this.momento = momento;
	}


	public User getCliente() {
		return cliente;
	}


	public void setCliente(User cliente) {
		this.cliente = cliente;
	}

	
	public PedidoStatus getPedidoStatus() {
		return PedidoStatus.ValueOf(pedidoStatus);
	}


	public void setPedidoStatus(PedidoStatus pedidoStatus) {
		if(pedidoStatus!=null) {
			this.pedidoStatus = pedidoStatus.getCodigo();
		}
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
