package products;

public class PentRam extends Products {
	
	public PentRam(long quantidade) {
		super(quantidade);
		this.nome = "Pente de mem�ria RAM";
		this.cod = 003;
		this.preco = 199.99;
		this.subtotal = this.preco * quantidade;
	}


}
