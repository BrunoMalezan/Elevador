package gerador;

import objeto.Pessoa;
import gerador.Codigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Peso {
	
	private static int quantidade_minima = 0;
	private static int quantidade_maxima = 30;
	
	private static int peso_minimo = 3;
	private static int peso_maximo = 150;
	
	public List<Pessoa> gerapessoas(){
		
		Codigo codigo = new Codigo();
		
		List<Pessoa> guardadados = new ArrayList<>();
		Random gerapeso = new Random();
		
		int auxiliar = gerapeso.nextInt((quantidade_maxima - quantidade_minima) + 1) + quantidade_minima;
		
		for(int i = 0; i < auxiliar; i++) {
			int peso = gerapeso.nextInt((peso_maximo -  peso_minimo) + 1) + peso_minimo;
			int cod = codigo.geracodigo();
			guardadados.add(new Pessoa(cod, peso));
			
		}
		
		return guardadados;
	}

}
