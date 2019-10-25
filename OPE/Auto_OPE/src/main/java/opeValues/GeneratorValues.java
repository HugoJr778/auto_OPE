package opeValues;

import java.util.HashMap;
import java.util.Random;

import utils.UtilsOPE;

public class GeneratorValues {

	private static HashMap<String, String> data = new HashMap<String, String>();

	public static HashMap<String, String> getData() {
		generator();
		if(data == null) {
			System.out.println(">>> GENERATOR FAILED <<<");
			UtilsOPE.failed();
			return null;
		} else {
			System.out.println("<-------------------------------------------------->\n" + ">>> Name: "
					+ data.get("nome") + "\n" + ">>> CEP: " + data.get("cep") + "\n" + ">>> CPF: " + data.get("cpf")
					+ "\n" + ">>> Phone: " + data.get("telefone") + "\n" + ">>> Car: " + data.get("carro") + "\n"
					+ ">>> Board: " + data.get("placa") + "\n" + ">>> Color: " + data.get("cor") + "\n"
					+ ">>> Password: " + data.get("password") + "\n"
					+ "<-------------------------------------------------->");
			return data;
		}
	}
	
	private static void generator() {
		Random sort = new Random();
		final String[] TITULOS = {"nome","cep", "cpf", "telefone", "carro", "placa", "cor", "password"};
		String[] letras = {"a","b","c","d","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};
		String[] ceps = {"06634000", "06013003", "06311000", "01010010", "06401000", "06600900", "05059000"}; 
		String name = "", cpf = "", tel = "", carro = "", placa = "", cor = "", password = "";
		
		for(int posi = 0; posi < 11; posi++) {
			name += letras[sort.nextInt(letras.length)];
			cpf += sort.nextInt(10);
			tel += sort.nextInt(10);
			carro += letras[sort.nextInt(letras.length)];
			placa += letras[sort.nextInt(letras.length)];
			cor += letras[sort.nextInt(letras.length)];
			password += ('a' + Math.abs(sort.nextInt() % 30));
		}
		final String[] VALUES_GENERATOR = {name, 
											ceps[sort.nextInt(ceps.length)], 
											  cpf, 
											  	("119" + (tel.substring(0, 8))), 
											  	  (carro.substring(3, carro.length()) + " 2019"), 
											  	    (placa.substring(0,3) + "123"), 
											  	      cor.substring(0, 7),
											  	        password.substring(0, 10)};
		for(int i = 0; i < VALUES_GENERATOR.length; i++) {
			data.put(TITULOS[i], VALUES_GENERATOR[i]);
		}
	}
}