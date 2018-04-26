package main;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import products.*;
import system.*;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void menu() throws IOException {

		String opcao;
		int a;
		opcao = JOptionPane.showInputDialog("O que deseja?\n1 - Efetuar compra\n2 - Obter ajuda\n3 - Sair");
		a = Integer.parseInt(opcao);
		switch (a) {
		case 1:
			compra();
			break;
		case 2:
			ajuda();
			menu();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Opção válida não selecionada.");
			menu();
			break;
		}
	}

	public static void ajuda() {
		JOptionPane.showMessageDialog(null,
				"Para efetuar compra basta, no menu principal, apertar 1 e para sair aperte 3.");
	}

	public static void compra() throws IOException {

		String nome;
		String cpf;
		int formaDePagamento = 0;
		long n;

		Client c = new Client();

		System.out.println("--------------- Cadastro do cliente ---------------");
		System.out.println("");
		System.out.print("Cadastre seu nome: ");
		nome = scan.nextLine();

		while (nome.equalsIgnoreCase("")) {
			System.out.print("Digite um nome válido: ");
			nome = scan.nextLine();
		}
		c.setNome(nome);

		System.out.print("Cadastre seu CPF: ");
		cpf = scan.nextLine();

		if ((cpf.equalsIgnoreCase("")) || (cpf.length() < 11)) {
			boolean isValid = false;
			while (isValid == false) {
				System.out.print("Digite um CPF válido: ");
				cpf = scan.nextLine();
				if (cpf.length() == 11) {
					isValid = true;
				}
			}
		}
		c.setCpf(cpf);

		formaDePagamento = Integer.parseInt(
				JOptionPane.showInputDialog("Qual a forma de pagamento?\n1 - Dinheiro\n2 - Crédito\n3 - Débito"));
		if ((formaDePagamento < 1) || (formaDePagamento > 3)) {
			boolean isValid = false;
			while (isValid == false) {
				formaDePagamento = Integer.parseInt(JOptionPane
						.showInputDialog("Qual a forma de pagamento?\n1 - Dinheiro\n2 - Crédito\n3 - Débito"));
				if ((formaDePagamento >= 1) && (formaDePagamento <= 3)) {
					isValid = true;
				}
			}
		}
		c.setFormaDePagamento(formaDePagamento);

		System.out.println("");
		System.out.println("--------------- Compra de produtos ---------------");
		System.out.println("");
		System.out.println("Insira a quantidade de mouse's que você deseja comprar: ");
		n = scan.nextLong();
		if (n < 0) {
			while (n < 0) {
				System.out.println("Insira um valor válido:");
				n = scan.nextLong();
			}
		}
		Mouse m = new Mouse(n);

		System.out.println("Insira a quantidade de teclados que você deseja comprar: ");
		n = scan.nextLong();
		if (n < 0) {
			while (n < 0) {
				System.out.println("Insira um valor válido:");
				n = scan.nextLong();
			}
		}
		Keyboard k = new Keyboard(n);

		System.out.println("Insira a quantidade de fones de ouvido que você deseja comprar: ");
		n = scan.nextLong();
		if (n < 0) {
			while (n < 0) {
				System.out.println("Insira um valor válido:");
				n = scan.nextLong();
			}
		}
		Headphone h = new Headphone(n);

		System.out.println("Insira a quantidade de placas de vídeo que você deseja comprar: ");
		n = scan.nextLong();
		if (n < 0) {
			while (n < 0) {
				System.out.println("Insira um valor válido:");
				n = scan.nextLong();
			}
		}
		GraphicsCard gc = new GraphicsCard(n);

		System.out.println("Insira a quantos pentes de memoria RAM que você deseja comprar: ");
		n = scan.nextLong();
		if (n < 0) {
			while (n < 0) {
				System.out.println("Insira um valor válido:");
				n = scan.nextLong();
			}
		}
		PentRam pr = new PentRam(n);

		System.out.println("Insira a quantidade de monitores que você deseja comprar: ");
		n = scan.nextLong();
		if (n < 0) {
			while (n < 0) {
				System.out.println("Insira um valor válido:");
				n = scan.nextLong();
			}
		}
		Screen s = new Screen(n);

		System.out.println("Insira a quantidade de caixas de som que você deseja comprar: ");
		n = scan.nextLong();
		if (n < 0) {
			while (n < 0) {
				System.out.println("Insira um valor válido:");
				n = scan.nextLong();
			}
		}
		SoundBox sb = new SoundBox(n);

		// vendedor

		Salesman odc = new Salesman();

		double total = k.getSubtotal() + m.getSubtotal() + s.getSubtotal() + h.getSubtotal() + pr.getSubtotal()
				+ sb.getSubtotal() + gc.getSubtotal();

		BillOfSale.geraBillOfSale(c, odc, s, h, sb, gc, pr, m, k, total);

		String opcao;
		int a;
		opcao = JOptionPane.showInputDialog("Efetuar nova compra?\n1 - Sim\n2 - Não");
		a = Integer.parseInt(opcao);
		switch (a) {
		case 1:
			scan.reset();
			compra();
			break;
		case 2:
			System.out.println("Final da Execução.");
			System.exit(0);
			break;
		default:
			System.out.println("Opção válida não selecionada.");
			menu();
			break;
		}

	}

	public static void main(String[] args) throws IOException {
		menu();
		scan.close();
	}

}