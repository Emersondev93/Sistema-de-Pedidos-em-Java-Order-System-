package entidades;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidadesEnum.StatusPedido;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento: ");
		LocalDate dataNascimento = LocalDate.parse(sc.next(), fmt1);
		System.out.println();

		Cliente c1 = new Cliente(nome, email, dataNascimento);

		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Estado: ");
		String status = sc.next();
		sc.nextLine();
		System.out.print("Quantidade de itens no pedido: ");
		int qtdItens = sc.nextInt();
		Pedido pedido = new Pedido(LocalDateTime.now(), StatusPedido.valueOf(status.toUpperCase()));
		sc.nextLine();
		for (int i = 0; i < qtdItens; i++) {
			System.out.println("Entre com os dados do " + (i + 1) + "° item: ");
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			sc.nextLine();
			Produto produto = new Produto(nomeProduto, preco);
			ItemPedido itemPedido = new ItemPedido(quantidade, preco, produto);
			pedido.adicionarPedido(itemPedido);

		}

		System.out.println("\nRESUMO DO PEDIDO:");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Momento do pedido: " + pedido.getMomento().format(fmt2));
		System.out.println("Status do pedido: " + pedido.getStatus());
		System.out.println(
				"Cliente: " + c1.getNome() + " (" + c1.getDataNascimeto().format(fmt1) + ")" + " - " + c1.getEmail());
		System.out.println("Itens do pedido: ");

		for (ItemPedido itens : pedido.getItens()) {
			System.out.println("Nome do produto: " + itens.getProduto().getNome() + " \nPreço unitario: "
					+ itens.getProduto().getPreco() + " \nQuantidade: " + itens.getQuantidade() + " \nSubTotal: "
					+ itens.subTotal());
		}
		DecimalFormat format = new DecimalFormat("#0.00");
		System.out.println("Preço total: " + format.format(pedido.total()));
		sc.close();
	}

}
