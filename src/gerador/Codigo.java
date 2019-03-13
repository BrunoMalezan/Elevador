package gerador;

import java.util.Random;

public class Codigo {
	
	public int geracodigo() {
		
		Random retorno = new Random();
		
		return retorno.nextInt();
		
	}

}
