package tcd;

// item IJ: funcionários responsáveis por parcerias com hoteis
// item 4: funcionário (que cadastra) hotel é subclasse de funcionário
public class FuncHotel extends Funcionario {
	private static double bonusSal; // Item 5
	private int hoteisCad; // item IJ: número de hoteis cadastrados

	// item 3D: construtor criado por nós
	public FuncHotel(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf,
			String endCep, String cpf, int diaNasc, int mesNasc, int anoNasc, String carteiraTrab) {

		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, cpf, diaNasc, mesNasc, anoNasc,
				carteiraTrab);
		setHoteisCad(0);
	}

	// item 3D: construtor criado por nós
	public FuncHotel(FuncHotel f, int diaNasc, int mesNasc, int anoNasc) {
		super(f.getNome(), f.getEndLogradouro(), f.getEndNumero(), f.getEndBairro(), f.getEndCidade(), f.getEndUf(),
				f.getEndCep(), f.getCpf(), diaNasc, mesNasc, anoNasc, f.getCarteiraTrab());

		setHoteisCad(0);
	}

	public static double getBonusSal() {
		return bonusSal;
	}

	public static void setBonusSal(double bonusSal) {
		if (bonusSal > 0)
			FuncHotel.bonusSal = bonusSal;
		else
			FuncHotel.bonusSal = -1;
	}

	public int getHoteisCad() {
		return hoteisCad;
	}

	public void setHoteisCad(int hoteisCad) {
		this.hoteisCad = hoteisCad;
	}

	// item IJ: método para definir bônus salarial dos funcionários especiais
	public void definirBonus(double bonus) {
		setBonusSal(bonus);
	}

	// item IJ: método para calcular salário do funcionário
	public double calculaSalario(int numHotelRegistrado) {
		double salario = getSalarioFixo() + (getSalarioFixo() * bonusSal * hoteisCad);
		return salario;
	}

	// item IJ: método para registro de hoteis
	public Hotel registraHotel(String CNPJ, String nomeOfi, String nomeDiv, int diaCria, int mesCria, int anoCria,
			String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep,
			int numEstrelas, boolean petAceito, int numQuartos, String msgDivulg, String descricao, int hCheckin,
			int minCheckin, int segCheckin, int hCheckout, int minCheckout, int segCheckout) {

		Hotel h = new Hotel(CNPJ, nomeOfi, nomeDiv, endLogradouro, mesCria, anoCria, diaCria, endNumero, endBairro,
				endCidade, endUf, endCep, numEstrelas, petAceito, numQuartos, msgDivulg, descricao, hCheckin,
				minCheckin, segCheckin, hCheckout, minCheckout, segCheckout);

		hoteisCad++;
		return h;
	}
}
