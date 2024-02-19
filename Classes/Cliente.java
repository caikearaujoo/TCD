import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	private LocalDate dataCad;
	private String email;
	private int numCompras;
	private List<Compras> compras;
	
	
	public Cliente(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, String cpf, int diaNasc, int mesNasc, int anoNasc, int diaCad, int mesCad, int anoCad, String email, int numCompras) {
		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, cpf, diaNasc, mesNasc, anoNasc);
		setDataCad(diaCad, mesCad, anoCad);
		setEmail(email);
		setNumCompras(numCompras);
		this.compras = new ArrayList<>();
	}
	
	public List<Compras> getCompras() {
        return compras;
    }

    public void adicionarCompra(Compras compra) { //Adiciona em um vetor que guarda as compras realizadas pelo cliente
        compras.add(compra);
    }

    public void removerCompra(Compras compra) {
        compras.remove(compra);
    }
    
	public Cliente(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	public Cliente() {
		
	}
	
	public LocalDate getDataCad() {
		return dataCad;
	}

	public void setDataCad(int dia, int mes, int ano) {
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
        
        this.dataCad = LocalDate.of(ano, mes, dia);        
    }

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNumCompras() {
		return numCompras;
	}
	
	public void setNumCompras(int numCompras) {
		if (numCompras >= 0) this.numCompras = numCompras;
		else this.numCompras = -1;
	}
}
