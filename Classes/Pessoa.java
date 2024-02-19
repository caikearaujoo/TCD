import meuPacote.VerificaCPF;
import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String endLogradouro;
	private int endNumero;
	private String endBairro;
	private String endCidade;
	private String endUf;
	private String endCep;
	private String cpf;
	private LocalDate dataNasc;
	
	public Pessoa(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, String cpf, int diaNasc, int mesNasc, int anoNasc) {
		setNome(nome);
		setEndLogradouro(endLogradouro);
		setEndNumero(endNumero);
		setEndBairro(endBairro);
		setEndCidade(endCidade);
		setEndUf(endUf);
		setEndCep(endCep);
		setCpf(cpf);
		setDataNasc(diaNasc, mesNasc, anoNasc);
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
		if (endUf.length() == 2) this.endUf = endUf;
		else endUf = null;
	}
	
	public String getEndCep() {
		return endCep;
	}
	
	public void setEndCep(String endCep) {
		if (endCep.length() == 8) this.endCep = endCep;
		else endCep = null;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (VerificaCPF.isCPF(cpf)) this.cpf = cpf;
		else this.cpf = null;
	}
	
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	
    public void setDataNasc(int dia, int mes, int ano) {
        if (ano < 0) {
        	dia = -1;
            mes = -1;
            ano = -1;
        }
        
        if ((mes < 0) && (mes > 13)) {
            dia = -1;
            mes = -1;
            ano = -1;
        }
        
        if (dia < 0) {
        	dia = -1;
        	mes = -1;
        	ano = -1;
        }
        
        if ((mes == 2) && (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
            if ((dia < 0) && (dia > 29)) {
                dia = -1;
                mes = -1;
                ano = -1;
            }
        } else if ((mes == 2) && (dia < 0) && (dia > 28)) {
        	dia = -1;
            mes = -1;
            ano = -1;
        }
        
        if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
        	if ((dia < 0) && (dia > 31)) {
        		dia = -1;
        		mes = -1;
        		ano = -1;
        	}
        }
        
        if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
        	if ((dia < 0) && (dia > 30)) {
        		dia = -1;
        		mes = -1;
        		ano = -1;
        	}
        }
        
        this.dataNasc = LocalDate.of(ano, mes, dia);        
    }
}
