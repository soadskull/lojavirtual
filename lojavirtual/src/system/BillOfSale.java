package system;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import products.*;

public class BillOfSale {
	public static void geraBillOfSale(Client x, Salesman y, Products a, Products b, Products c, Products d,
			Products e, Products f, Products g, double total) {

		try {

			File file = new File("Nota Fiscal.txt");
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();

			pw.println("-----------------------------------------------------------------------------");
			pw.println("Nota fiscal de compra - TechShop Daora");
			pw.println("-----------------------------------------------------------------------------");
			pw.println("Data: " + dtf.format(now));
			pw.println("\nCliente: " + x.getNome());
			pw.println("CPF: " + x.getCpf());
			pw.println("\nOperador de caixa: " + y.getVendedor());

			if (a.getQuantidade() > 0) {
				pw.println("\n" + a.getCod() + " - " + a.getNome() + "\n\tPreço unitário: \t" + a.getPreco()
						+ "\n\tQtde comprada: \t\t" + a.getQuantidade() + "\n\tSubtotal: \t\t\t" + a.getSubtotal());
				pw.println();
			}

			if (b.getQuantidade() > 0) {
				pw.println("\n" + b.getCod() + " - " + b.getNome() + "\n\tPreço unitário: \t" + b.getPreco()
						+ "\n\tQtde comprada: \t\t" + b.getQuantidade() + "\n\tSubtotal: \t\t\t" + b.getSubtotal());
				pw.println();
			}

			if (c.getQuantidade() > 0) {
				pw.println("\n" + c.getCod() + " - " + c.getNome() + "\n\tPreço unitário: \t" + c.getPreco()
						+ "\n\tQtde comprada: \t\t" + c.getQuantidade() + "\n\tSubtotal: \t\t\t" + c.getSubtotal());
				pw.println();
			}

			if (d.getQuantidade() > 0) {
				pw.println("\n" + d.getCod() + " - " + d.getNome() + "\n\tPreço unitário: \t" + d.getPreco()
						+ "\n\tQtde comprada: \t\t" + d.getQuantidade() + "\n\tSubtotal: \t\t\t" + d.getSubtotal());
				pw.println();
			}

			if (e.getQuantidade() > 0) {
				pw.println("\n" + e.getCod() + " - " + e.getNome() + "\n\tPreço unitário: \t" + e.getPreco()
						+ "\n\tQtde comprada: \t\t" + e.getQuantidade() + "\n\tSubtotal: \t\t\t" + e.getSubtotal());
				pw.println();
			}

			if (f.getQuantidade() > 0) {
				pw.println("\n" + f.getCod() + " - " + f.getNome() + "\n\tPreço unitário: \t" + f.getPreco()
						+ "\n\tQtde comprada: \t\t" + f.getQuantidade() + "\n\tSubtotal: \t\t\t" + f.getSubtotal());
				pw.println();
			}

			if (g.getQuantidade() > 0) {
				pw.println("\n" + g.getCod() + " - " + g.getNome() + "\n\tPreço unitário: \t" + g.getPreco()
						+ "\n\tQtde comprada: \t\t" + g.getQuantidade() + "\n\tSubtotal: \t\t\t" + g.getSubtotal());
				pw.println();
			}

			pw.println("-----------------------------------------------------------------------------");
			pw.println("Total da compra: \t\t" + total);
			pw.println("Forma de pgto: \t\t\t" + x.getFormaDePagamento());
			pw.println("Total pago: \t\t\t" + total);
			pw.println("-----------------------------------------------------------------------------");
			pw.println("Obrigado pela preferência, volte sempre! ;D");
			pw.println("-----------------------------------------------------------------------------");
			pw.flush();
			pw.close();
			
		} catch (IOException ioe) {
			
			ioe.printStackTrace();
			
			
		}
	
	}
}
