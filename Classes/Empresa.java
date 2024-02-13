package tcd;

public class Empresa {
	
	private String CNPJ;
	private String nome;
	private String nomeDivulg;
	private int diaCria;
	private int mesCria;
	private int anoCria;
	private String endLogradouro;
	private int endNumero;
	private String endBairro;
	private String endCidade;
	private String endUf;
	private String endCep;
	
	public Empresa(String CNPJ, String nome, String nomeDivulg, int diaCria, int mesCria, int anoCria, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep)
	{
		this.CNPJ = CNPJ;
		
		if (nome != null && !nome.isEmpty()) 
		{
	        this.nome = nome;
		}
		else nome = null;
		
		this.nomeDivulg = nomeDivulg;
		this.diaCria = diaCria;
		this.mesCria = mesCria;
		this.anoCria = anoCria;
		this.endLogradouro = endLogradouro;
		this.endNumero = endNumero;
		this.endBairro = endBairro;
		this.endCidade = endCidade;
		this.endUf = endUf;
		this.endCep = endCep;
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
		this.endUf = endUf;
	}
	public String getEndCep() {
		return endCep;
	}
	public void setEndCep(String endCep) {
		this.endCep = endCep;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getNomeDivulg() {
		return nomeDivulg;
	}
	public void setNomeDivulg(String nomeDivulg) {
		this.nomeDivulg = nomeDivulg;
	}
	public int getDiaCria() {
		return DiaCria;
	}
	public void setDiaCria(int diaCria) {
		DiaCria = diaCria;
	}
	public int getMesCria() {
		return MesCria;
	}
	public void setMesCria(int mesCria) {
		MesCria = mesCria;
	}
	public int getAnoCria() {
		return AnoCria;
	}
	public void setAnoCria(int anoCria) {
		AnoCria = anoCria;
	}

}
