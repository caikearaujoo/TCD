import meuPacote.ValidaCNPJ;
import java.util.Date;

public class Empresa {
	
	private String CNPJ; //Definido por meio de um método auxiliar com o uso do pacote ValidaCNPJ
	private String nome;
	private String nomeDivulg;
	private Date dataCria;
	private String endLogradouro;
	private int endNumero;
	private String endBairro;
	private String endCidade;
	private String endUf;
	private String endCep;
	
	public Empresa(String CNPJ,String nome, String nomeDivulg,Date dataCria, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep)
	{
		setCNPJ(CNPJ);
		
		setNome(nome); // Sem restrições
		
		setNomeDivulg(nomeDivulg);
		
		setDataCria(dataCria);
       
		setEndLogradouro(endLogradouro); //Pode ser o que ele quiser
		setEndNumero(endNumero); //Pode ser o que ele quiser
		setEndBairro(endBairro); //Pode ser o que ele quiser
		setEndCidade(endCidade); //Pode ser o que ele quiser
		
		setEndUf(endUf);
		
		setEndCep(endCep);
	}
	
	public String getEndLogradouro() {
		return endLogradouro;
	}
	
	public void setEndLogradouro(String endLogradouro) {
		this.endLogradouro = endLogradouro;
	}
	
	public int getEndNumero() {
		return endNumero;
	}
	
	public void setEndNumero(int endNumero) {
		this.endNumero = endNumero;
	}
	
	public String getEndBairro() {
		return endBairro;
	}
	
	public void setEndBairro(String endBairro) {
		this.endBairro = endBairro;
	}
	
	public String getEndCidade() {
		return endCidade;
	}
	
	public void setEndCidade(String endCidade) {
		this.endCidade = endCidade;
	}
	
	public String getEndUf() {
		return endUf;
	}
	
	public void setEndUf(String endUf) {
		
		if(endUf.length()<=2) {
			this.endUf = endUf;
		} else {
			this.endUf = null;
		}
	}
	
	public String getEndCep() {
		return endCep;
	}
	
	public void setEndCep(String endCep) {
		
		if(endCep.length()==9) {
			this.endCep = endCep;
		} else {
			this.endCep = null;
		}
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String CNPJ) {
		
		if(ValidaCNPJ.isCNPJ(CNPJ) == true) {
			this.CNPJ = CNPJ;
		} else {
			this.CNPJ = null;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String Nome) {
		nome = Nome;
	}
	
	public String getNomeDivulg() {
		return nomeDivulg;
	}
	
	public void setNomeDivulg(String nomeDivulg) {
		if(nomeDivulg.length()<=20) { // Nome de divulgação menor ou igual a 20 caracteres
			this.nomeDivulg = nomeDivulg;
		} else {
			this.nomeDivulg = null;
		}
	}

	public Date getDataCria() {
		return dataCria;
	}

	public void setDataCria(Date dataCria) {
		this.dataCria = dataCria;
	}
	
}