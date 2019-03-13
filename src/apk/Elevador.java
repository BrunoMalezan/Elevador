/*Deve ser gerado de 0 a 30 pessoas, onde, cada peso varia de 3 a 150...
 O elevador somente deve se mover quando tiver até 15 pessoas com ate 1050 kg...
 Se estiver vazio não se move... Se ultrapassar o peso não se move, 
 se ultrapasar a quantia de pessoas não se move*/


package apk;

import java.util.List;

import objeto.Pessoa;
import gerador.Peso;

public class Elevador {
	
	private static int quantidade_maximo = 15;
	private static int peso_maximo = 1050;
	
	private static Peso peso = new Peso();
	
	public static void main(String[] agrs) {
		System.out.println(validar(peso.gerapessoas()));
		
	}
	
	private static String validar(List<Pessoa> pessoa) {
		if(pessoa.isEmpty())
			return "O elevador está vazio!";
		
		if(pessoa.size() > quantidade_maximo)
			return "Quantidade máxima (" + quantidade_maximo + " pessoas) excedida. Quantidade atual = " + pessoa.size();
		
		int pesosomado = pessoa.stream().mapToInt(Pessoa::getPeso).sum();
		if(pesosomado > peso_maximo)
			return "Peso máximo (" + peso_maximo + " KG) excedido. Peso total = " + pesosomado;
		
		return "Elevador em movimento...";
		
	}

}
