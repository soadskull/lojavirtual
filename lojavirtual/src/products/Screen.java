package products;

public class Screen extends Products {
	
	public Screen(long quantidade) {
		super(quantidade);
		this.nome = "Monitor";
		this.cod = 005;
		this.preco = 500.00;
		this.subtotal = this.preco * quantidade;
	}
}
