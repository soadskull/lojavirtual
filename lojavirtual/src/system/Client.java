package system;

public class Client {
	
	private String nome;
	private String formaDePagamento;
	private String cpf;
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(int formaDePagamento) {
	
		switch(formaDePagamento) {
			case 1:
				this.formaDePagamento = "Dinheiro";
				break;
			case 2:
				this.formaDePagamento = "Crédito";
				break;
			case 3:
				this.formaDePagamento = "Débito";
				break;
			default:
				System.out.println("Forma de pagamento não cadastrada. Encerrando compra.");
				System.exit(0);
				break;
		}
	}
	
}