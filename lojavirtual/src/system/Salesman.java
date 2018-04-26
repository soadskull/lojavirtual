package system;

import java.util.ArrayList;
import java.util.Random;

public class Salesman {
	
		private ArrayList<String> nome;
		private int id;
		private Random r;
		private String vendedor;
		
		public Salesman() {
			
			this.nome = new ArrayList<>();
			this.nome.add("Geraldo Alckmin");
			this.nome.add("Power Guido");
			this.nome.add("Clein Torres");
			this.nome.add("Nego Bam");			
			this.nome.add("Paula Tejano");			
			this.r = new Random();
			this.id = r.nextInt(5);
			this.vendedor = this.nome.get(this.id);
		}

		public String getVendedor() {
			return vendedor;
		}
		
		
}
