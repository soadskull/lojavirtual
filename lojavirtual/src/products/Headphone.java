package products;

public class Headphone extends Products {
	
	public Headphone(long quantidade) {
		super(quantidade);
		this.nome = "Headset";
		this.cod = 004;
		this.preco = 89.90;
		this.subtotal = this.preco * quantidade;
	}
	
}
