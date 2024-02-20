package meuPacote;

public class verificaPlaca {
	public static boolean validaPlaca(String placa){
		   boolean valido = true;
		   if(placa.length() != 7){
		      valido = false;
		   }
		   if(!placa.substring(0, 3).matches("[A-Z]*")){
		      valido = false;
		   }
		   if(!placa.substring(3).matches("[0-9]*")){
		      valido = false;
		   }
		   return valido;
		} //Código retirado da alura: https://www.alura.com.br/artigos/verificar-se-e-letra-ou-numero-no-java
}
