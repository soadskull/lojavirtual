package products;

public abstract class Products {
	
	protected String nome;
	protected long cod;
	protected long quantidade;
	protected double preco;
	protected double subtotal;
	
	public Products(long quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public long getCod() {
		return cod;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public double getSubtotal() {
		return subtotal;
	}

		
}
