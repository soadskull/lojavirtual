package products;

public class Mouse extends Products{
	
	public Mouse(long quantidade) {
		super(quantidade);
		this.nome = "Mouse";
		this.cod = 007;
		this.preco = 79.90;
		this.subtotal = this.preco * quantidade;
	}
	
}
