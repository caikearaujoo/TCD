
class CompanhiaAerea extends Empresa{
	private final static double taxaUdi = 0.05;

	//item 1c) cadastro de companhias aéreas
	public CompanhiaAerea(String CNPJ, String nome, String nomeDivulg, String endLogradouro, int diaCria, int mesCria,
			int anoCria, int endNumero, String endBairro, String endCidade, String endUf,
			String endCep) {
		super(CNPJ, nome, nomeDivulg, endLogradouro, diaCria, mesCria, anoCria, endNumero, endBairro, endCidade,
				endUf, endCep);
	}
	
	public static double getTaxaUdi() {
		return taxaUdi;
	}
	
	
	
}

