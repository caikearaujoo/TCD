import java.time.LocalTime;
import java.time.LocalDate;

public class PesquisasCarros {
	
	private String modelo;
	private String marca;
	private double motor;
	private int numAssentos;
	private String tipo;
	@SuppressWarnings("unused")
	private LocalDate dataRetirada;
	@SuppressWarnings("unused")
    private LocalTime tempoRetirada;
    @SuppressWarnings("unused")
    private LocalDate dataDevolucao;
    @SuppressWarnings("unused")
	private LocalTime tempoDevolucao;
    private double valorMax;
    
    private LocalTime horaPesquisa;
    private LocalDate dataPesquisa;
    
    public PesquisasCarros(String modelo, String marca, double motor, int numAssentos, String tipo, int diaDevolucao, int mesDevolucao, int anoDevolucao, int diaRetirada, int mesRetirada, int anoRetirada, int horaRetirada, int minRetirada, int segRetirada, int horaDevolucao, int minDevolucao, int segDevolucao,double valorMax)
	{
		setModelo(modelo);
		setMarca(marca);
		setMotor(motor);
		setNumAssentos(numAssentos);
		setTipo(tipo);
		setTempoRetirada(horaRetirada,minRetirada,0);
		setDataRetirada(diaRetirada,mesRetirada,anoRetirada);
		setTempoDevolucao(horaDevolucao,minDevolucao,0);
		setDataDevolucao(diaDevolucao,mesDevolucao,anoDevolucao);
		setValorMax(valorMax);
		setHoraPesquisa();
		setDataPesquisa();
	}
    
    public void setTempoRetirada(int horaRetirada,int minRetirada,int segRetirada) {
        if((horaRetirada<0) || (horaRetirada>23)) {
            horaRetirada = -1;
            minRetirada = -1;
            segRetirada = -1;
        }
        
        if((minRetirada<0) || (minRetirada>59)) {
            horaRetirada = -1;
            minRetirada = -1;
            segRetirada = -1;
        }
        
        if((segRetirada<0) || (segRetirada>59)) {
            horaRetirada = -1;
            minRetirada = -1;
            segRetirada = -1;
        }
        
        this.tempoRetirada = LocalTime.of(horaRetirada, minRetirada, segRetirada);
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
        
        this.tempoDevolucao = LocalTime.of(horaDevolucao, minDevolucao, segDevolucao);
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
        
        this.dataRetirada = LocalDate.of(ano, mes, dia);       
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
        
        this.dataDevolucao = LocalDate.of(ano, mes, dia);        
    }

	public double getValorMax() {
		return valorMax;
	}

	public void setValorMax(double valorMax) {
		if(valorMax < 0) {
			valorMax = -1;
		} else {
			this.valorMax = valorMax;
		}
	}
	
	public LocalTime getHoraPesquisa() {
		return horaPesquisa;
	}
	
	public void setHoraPesquisa() {
		this.horaPesquisa = LocalTime.now();
	}
	
	public LocalDate getDataPesquisa() {
		return dataPesquisa;
	}
	public void setDataPesquisa() { 
		this.dataPesquisa = LocalDate.now();
	}
	
	
}
