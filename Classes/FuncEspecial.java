package udidecola;

public class FuncEspecial extends Funcionario{
	private static double bonusSal = 0.02;
	private int numHotelRegistrado = 0; //Ou voce deixa 0 aqui, ou no construtor
	
	public FuncEspecial(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, String cpf, int diaNasc, int mesNasc, int anoNasc, String carteiraTrab, int hoteisCad, int numHotelRegistrado) {
		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, cpf, diaNasc, mesNasc, anoNasc, carteiraTrab, hoteisCad);
		setNumHotelRegistrado(numHotelRegistrado);
	}
	
	public int getNumHotelRegistrado() {
		return numHotelRegistrado;
	}

	public void setNumHotelRegistrado(int numHotelRegistrado) {
		if (numHotelRegistrado >= 0) this.numHotelRegistrado = numHotelRegistrado;
		else this.numHotelRegistrado = -1;
	}

	public double getBonusSal() {
		return bonusSal;
	}
	
	public double calculaSalario(int numHotelRegistrado) {
		double salarioTotal = getSalarioFixo() + (getSalarioFixo() * bonusSal * numHotelRegistrado);
		return salarioTotal;
	}
	
	public Hotel registraHotel(String CNPJ, String nome, String nomeDivulg, int diaCria, int mesCria, int anoCria, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, int numEstrelas, int accPet, int numQuartos, String msgDivulg, String desc, String cidade, int hCheckin, int minCheckin, int segCheckin, int hCheckout, int minCheckout, int segCheckout) {
	    Hotel h = new Hotel(CNPJ, nome, nomeDivulg, endLogradouro, diaCria, mesCria, anoCria, endNumero, endBairro, endCidade, endUf, endCep, numEstrelas, accPet, numQuartos, msgDivulg, desc, cidade, hCheckin, minCheckin, segCheckin, hCheckout, minCheckout, segCheckout);
	    numHotelRegistrado = numHotelRegistrado + 1;
	    return h;
	}	
}
