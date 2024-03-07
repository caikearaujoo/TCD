package tcd;

public class FuncEspecial extends FuncHotel {
	// atributos específicos
	private static double bonusSal;
	private int hoteisCad;
	
	// construtor completo
	public FuncEspecial(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, 
			            String cpf, int diaNasc, int mesNasc, int anoNasc, 
			            String carteiraTrab) {
		
		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, 
			  cpf, diaNasc, mesNasc, anoNasc, 
			  carteiraTrab);
		setHoteisCad(0);
	}
	
	// construtor com funcionário e data de nascimento
	public FuncEspecial(FuncHotel f, int diaNasc, int mesNasc, int anoNasc) {
		super(f.getNome(), f.getEndLogradouro(), f.getEndNumero(), f.getEndBairro(), f.getEndCidade(), f.getEndUf(), f.getEndCep(), 
			  f.getCpf(), diaNasc, mesNasc, anoNasc, 
			  f.getCarteiraTrab());
		
		setHoteisCad(0);
	}

	public static double getBonusSal() {
		return bonusSal;
	}

	public static void setBonusSal(double bonusSal) {
		if (bonusSal > 0) FuncEspecial.bonusSal = bonusSal;
		else FuncEspecial.bonusSal = -1;
	}

	public int getHoteisCad() {
		return hoteisCad;
	}

	public void setHoteisCad(int hoteisCad) {
		this.hoteisCad = hoteisCad;
	}

	// método: definir bônus salarial dos funcionários especiais
	public void definirBonus(double bonus) {
		setBonusSal(bonus);
	}

	// método: salário do funcionário especial
	public double calculaSalario(int numHotelRegistrado) {
		double salario = getSalarioFixo() + (getSalarioFixo() * bonusSal * hoteisCad);
		return salario;
	}
	
	// método: registro de hoteis
	public Hotel registraHotel(String CNPJ, String nomeOfi, String nomeDiv, 
			                   int diaCria, int mesCria, int anoCria, 
			                   String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, 
			                   int numEstrelas, boolean petAceito, int numQuartos, String msgDivulg, String descricao,
			                   int hCheckin,int minCheckin,int segCheckin,
			      		       int hCheckout,int minCheckout,int segCheckout) {
		
		Hotel h = new Hotel(CNPJ, nomeOfi, nomeDiv, 
				            endLogradouro, diaCria, mesCria, anoCria, endNumero, endBairro, endCidade, endUf, endCep, 
				            numEstrelas, petAceito, numQuartos, msgDivulg, descricao,
				            hCheckin, minCheckin, segCheckin,
			    		    hCheckout, minCheckout, segCheckout);
		
		hoteisCad++;
		return h;
	}	
}
