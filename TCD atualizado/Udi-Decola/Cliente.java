package tcd;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Pessoa {
	
	private LocalDate dataCad;
	private String email;
	private int numCompras;
	private ArrayList<Pesquisas> pesquisas; //Cada cliente terá um ArrayList de pesquisas associada a ele (Extra)
	private ArrayList<Compras> compras; //Cada cliente terá um ArrayList de compras associada a ele (Extra)
	
	public Cliente(String nome, String endLogradouro, int endNumero, String endBairro, String endCidade, String endUf, String endCep, String cpf, int diaNasc, int mesNasc, int anoNasc, int diaCad, int mesCad, int anoCad, String email, int numCompras) {
		super(nome, endLogradouro, endNumero, endBairro, endCidade, endUf, endCep, cpf, diaNasc, mesNasc, anoNasc);
		setDataCad(diaCad, mesCad, anoCad);
		setEmail(email);
		setNumCompras(numCompras);
		this.pesquisas = new ArrayList<>();
		this.compras = new ArrayList<>();
	}
	
	public void transformaEmVip() //Função feita para transformar um cliente em VIP a partir do número de compras do mesmo
	{
		if(numCompras ==20) {
			ClienteVip clienteVip = new ClienteVip(this, getDataNasc().getDayOfMonth(), getDataNasc().getMonthValue(), getDataNasc().getYear(), getDataCad().getDayOfMonth(), getDataCad().getMonthValue(), getDataCad().getYear());
			ArrayList<Compras> comprasCliente = getCompras();
			
			for(int i = 0; i < comprasCliente.size(); i++) { //percorre o array de compras do cliente
				Compras compra = comprasCliente.get(i); //pega o valor do elemento
				clienteVip.adicionarCompra(compra); //adiciona na lista de compras do clienteVip
			}
		}
	}
	public void adicionarCompra(Compras compra) {
        this.compras.add(compra);
	numCompras++;
    }

    public ArrayList<Compras> getCompras() {
        return compras;
    }
    
	public Cliente(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	public Cliente() {
		
	}
	
	public void adicionarPesquisa(Pesquisas p1){
		this.pesquisas.add(p1);
	}
	
	public ArrayList<Pesquisas> getPesquisas() {
		return pesquisas;
	}

	public void setPesquisas(ArrayList<Pesquisas> pesquisas) {
		this.pesquisas = pesquisas;
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
