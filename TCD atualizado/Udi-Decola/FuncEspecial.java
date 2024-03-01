package udidecola;

public class FuncEspecial extends FuncHotel {
	// atributos específicos
	private static double bonusSal;
	
	public FuncEspecial(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, 
			            String cpf, int diaNasc, int mesNasc, int anoNasc, 
			            String carteiraTrab, int hoteisCad) {
		
		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, 
			  cpf, diaNasc, mesNasc, anoNasc, 
			  carteiraTrab, hoteisCad);
	}

	public static double getBonusSal() {
		return bonusSal;
	}

	public static void setBonusSal(double bonusSal) {
		if (bonusSal > 0) FuncEspecial.bonusSal = bonusSal;
		else FuncEspecial.bonusSal = -1;
	}

	// método: definir bônus salarial dos funcionários especiais
	public void definirBonus(double bonus) {
		setBonusSal(bonus);
	}

	// método: salário do funcionário especial
	public double calculaSalario(int numHotelRegistrado) {
		double salarioTotal = getSalarioFixo() + (getSalarioFixo() * bonusSal * super.getHoteisCad());
		return salarioTotal;
	}
	
	// método: registro de hoteis
	public Hotel registraHotel(String CNPJ, String nomeOfi, String nomeDiv, 
			                   int diaCria, int mesCria, int anoCria, 
			                   String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, 
			                   int numEstrelas, boolean petAceito, int numQuartos, String msgDivulg, String descricao,
			                   int hCheckin,int minCheckin,int segCheckin,
			      		       int hCheckout,int minCheckout,int segCheckout) {
		
		Hotel h = new Hotel(CNPJ, nomeOfi, nomeDiv, 
				            diaCria, mesCria, anoCria, 
				            endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, 
				            numEstrelas, petAceito, numQuartos, msgDivulg, descricao,
				            hCheckin, minCheckin, segCheckin,
			    		    hCheckout, minCheckout, segCheckout);
		
		super.setHoteisCad((super.getHoteisCad()) + 1);
		return h;
	}	
}
