package products;

public class GraphicsCard extends Products {
		
	public GraphicsCard(long quantidade) {
		super(quantidade);
		this.nome = "Placa de v�deo";
		this.cod = 002;
		this.preco = 1499.90;
		this.subtotal = this.preco * quantidade;
	}
	
}
