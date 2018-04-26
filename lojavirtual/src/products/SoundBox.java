package products;

public class SoundBox extends Products {
		
	public SoundBox(long quantidade) {
		super(quantidade);
		this.nome = "Caixa de som";
		this.cod = 001;
		this.preco = 199.90;
		this.subtotal = this.preco * quantidade;
	}	
}
