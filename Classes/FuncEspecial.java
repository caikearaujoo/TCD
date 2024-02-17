package tcd;

public class FuncEspecial extends Funcionario{
	private double bonusSal;
	private int numHotelRegistrado = 0; //Ou voce deixa 0 aqui, ou no construtor
	
	public double getBonusSal() {
		return bonusSal;
	}
	public void setBonusSal(double bonusSal) {
		this.bonusSal = bonusSal;
	}
	
	public Hotel registraHotel(String CNPJ, String nome, String nomeDivulg, int diaCria, int mesCria, int anoCria, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, int numEstrelas, int accPet, int numQuartos, String msgDivulg, String desc, String cidade, int hCheckin, int minCheckin, int segCheckin, int hCheckout, int minCheckout, int segCheckout) {
	    Hotel h = new Hotel(CNPJ, nome, nomeDivulg, endLogradouro, diaCria, mesCria, anoCria, endNumero, endBairro, endCidade, endUf, endCep, numEstrelas, accPet, numQuartos, msgDivulg, desc, cidade, hCheckin, minCheckin, segCheckin, hCheckout, minCheckout, segCheckout);
	    numHotelRegistrado = numHotelRegistrado + 1;
	    return h;
	}

}
