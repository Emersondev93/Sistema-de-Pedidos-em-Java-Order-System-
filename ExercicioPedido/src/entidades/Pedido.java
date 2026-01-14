package entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entidadesEnum.StatusPedido;

public class Pedido {
	private LocalDateTime momento;
	private StatusPedido status;
	List <ItemPedido> pedidos = new ArrayList();
	
	public Pedido(LocalDateTime momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
	}
	public Pedido() {
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public void adicionarPedido(ItemPedido pedido) {
		pedidos.add(pedido);
	}

	public void removerPedido(ItemPedido pedido) {
		pedidos.remove(pedido);

	}
	public List<ItemPedido>getItens(){
		return pedidos;
	}
	
	public double total() {
		double soma = 0;
		for (ItemPedido item : pedidos) {
			soma += item.subTotal();
		}
		return soma;
	}

}
