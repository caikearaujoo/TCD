package tcd;

import java.time.LocalTime;
import java.util.Date;
import java.time.LocalDate;
public class Carros 
{
	private String modelo;
	private String marca;
	private double motor;
	private int numAssentos;
	private String tipo;
	private double diariaSDesc;
	private double desconto;
	private double diariaCDesc;
	private final static double taxa = 0.10;
	private int diaRetirada;
	private int mesRetirada;
	private int anoRetirada;
	private LocalDate dataRetirada;
	private int horaRetirada;
	private int minRetirada;
	private int segRetirada;
	private int horaDevolucao;
	private int minDevolucao;
	private int segDevolucao;
    private LocalTime tempoRetirada;
    private LocalDate dataDevolucao;
    private int diaDevolucao;
	private int mesDevolucao;
	private int anoDevolucao;
    private LocalTime tempoDevolucao;
	
    public void setTempoRetirada(int horaRetirada,int minChegada,int segChegada) {
        if((horaRetirada<0) || (horaRetirada>23)) {
            horaRetirada = -1;
            minRetirada = -1;
            segRetirada = -1;
        }
        
        if((minChegada<0) || (minChegada>59)) {
            horaRetirada = -1;
            minChegada = -1;
            segChegada = -1;
        }
        
        if((segChegada<0) || (segChegada>59)) {
            horaRetirada = -1;
            minChegada = -1;
            segChegada = -1;
        }
        
        if((horaRetirada != -1) && (minChegada!= -1) && (segChegada != -1)) {
            this.tempoRetirada = LocalTime.of(horaRetirada, minChegada, segChegada);
        }
    }
    
    public void setTempoDevolucao(int horaDevolucao,int minDevolucao,int segDevolucao) {
        if((horaDevolucao<0) || (horaDevolucao>23)) {
            horaDevolucao = -1;
            minDevolucao = -1;
            segDevolucao = -1;
        }
        
        if((minDevolucao<0) || (minDevolucao>59)) {
            horaDevolucao = -1;
            minDevolucao = -1;
            segDevolucao = -1;
        }
        
        if((segDevolucao<0) || (segDevolucao>59)) {
            horaDevolucao = -1;
            minDevolucao = -1;
            segDevolucao = -1;
        }
        
        if((horaDevolucao != -1) && (minDevolucao!= -1) && (segDevolucao != -1)) {
            this.tempoDevolucao = LocalTime.of(horaDevolucao, minDevolucao, segDevolucao);
        }
    }
    
	public double getDiariaCDesc() {
		return diariaCDesc;
	}

	public void setDiariaCDesc(double diariaCDesc) {
		this.diariaCDesc = diariaCDesc;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if(modelo != null) this.modelo = modelo;
		else this.modelo = null;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if(marca != null) this.marca = marca;
		else this.marca = null;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		if(motor == 1.0 || motor == 1.6 || motor == 2.0) this.motor = motor;
		else this.motor = -1;
	}

	public int getNumAssentos() {
		return numAssentos;
	}

	public void setNumAssentos(int numAssentos) {
		if(numAssentos>0) this.numAssentos = numAssentos;
		else this.numAssentos = -1;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo != null) this.tipo = tipo;
		else this.tipo = null;
	}

	public double getDiariaSDesc() {
		return diariaSDesc;
	}

	public void setDiariaSDesc(double diariaSDesc) {
		if(diariaSDesc>0) this.diariaSDesc = diariaSDesc;
		else this.diariaSDesc = -1;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		if(desconto>0) this.desconto = desconto;
		else desconto = -1;
	}

	public double getDiariaCdesc() {
		return diariaCDesc;
	}

	public void setDiariaCDesc() {
		this.diariaCDesc = diariaSDesc - desconto;
	}

	public static double getTaxa() {
		return taxa;
	}

	public void setDataRetirada(int dia,int mes,int ano) {
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
        
        if ((dia != -1) && (mes != -1) && (ano != -1)) {
            this.dataRetirada = LocalDate.of(ano, mes, dia);
        }        
    }
	
	public void setDataDevolucao(int dia,int mes,int ano) {
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
        
        if ((dia != -1) && (mes != -1) && (ano != -1)) {
            this.dataDevolucao = LocalDate.of(ano, mes, dia);
        }        
    }
	
	public Carros(String modelo, String marca, double motor, int numAssentos, String tipo, double diariaSDesc, double diariaCDesc, double desconto, int diaRetirada, int mesRetirada, int anoRetirada, int diaDevolucao, int mesDevolucao, int anoDevolucao, int horaRetirada, int minRetirada, int segRetirada)
	{
		setModelo(modelo);
		setMarca(marca);
		setMotor(motor);
		setNumAssentos(numAssentos);
		setTipo(tipo);
		setDiariaSDesc(diariaSDesc);
		setDiariaCDesc();
		setDesconto(desconto);
	}
	
	public void alugaCarro(Carros carro, int diaDevolucao, int mesDevolucao, int anoDevolucao, int diaRetirada, int mesRetirada, int anoRetirada, int horaRetirada, int minRetirada, int segRetirada, int horaDevolucao, int minDevolucao, int segDevolucao)
	{
		setDataDevolucao(diaDevolucao, mesDevolucao, anoDevolucao);
		setDataRetirada(diaRetirada, mesRetirada, anoRetirada);
		setTempoRetirada(horaRetirada, minRetirada, segRetirada);
		setTempoDevolucao(horaDevolucao, minDevolucao, segDevolucao);
	}
}
