package com.wedson.aula.entities.enums;

public enum PedidoStatus {
	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int codigo;
	
	private PedidoStatus(int numero) {
		this.codigo = numero;
	}
	
	public int getCodigo() {
		return this.codigo;
	}

	public static PedidoStatus ValueOf(int code) {
		for(PedidoStatus value: PedidoStatus.values()) {
			if(value.getCodigo() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Codigo de status de pedido invalido");
	}
	
}
