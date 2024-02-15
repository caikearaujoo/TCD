import java.util.Date;

class CompanhiaAerea extends Empresa{
	
	public CompanhiaAerea(String CNPJ, String nome, String nomeDivulg, Date dataCria, String endLogradouro,
			int endNumero, String endBairro, String endCidade, String endUf, String endCep) {
		super(CNPJ, nome, nomeDivulg, dataCria, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep);
	}

	final static double taxaUdi = 0.05;
	
	
	public double getTaxaUdi() {
		return taxaUdi;
	}
	
	
}

