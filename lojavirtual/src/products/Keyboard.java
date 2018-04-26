package products;

public class Keyboard extends Products {
	
	public Keyboard(long quantidade) {
		super(quantidade);
		this.nome = "Teclado";
		this.cod = 006;
		this.preco = 120.00;
		this.subtotal = this.preco * quantidade;
	}
	
	
}
