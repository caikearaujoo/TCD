import java.time.LocalDate;
import java.time.LocalTime;

public class PesquisasTrechosVoos {
	
	private LocalDate dataVoo;
	private String origem;
	private String destino;
	private LocalTime horaSaida;
	private LocalTime horaChegada;
	private CompanhiaAerea nomeCompA;
	private double valorMax;
	
	private LocalTime horaPesquisa;
    private LocalDate dataPesquisa;
	
	public PesquisasTrechosVoos(int diaVoo,int mesVoo,int anoVoo,String origem,String destino,int hSaida,int minSaida,int hChegada,int minChegada,CompanhiaAerea nomeCompA,double valorMax) {
		
		setDataVoo(diaVoo,mesVoo,anoVoo);
		setOrigem(origem);
		setDestino(destino);
		setHoraSaida(hSaida,minSaida,0);
		setHoraChegada(hChegada,minChegada,0);
		setNomeCompA(nomeCompA);
		setValorMax(valorMax);
		setHoraPesquisa();
		setDataPesquisa();
	}
	
	public LocalDate getDataVoo() {
		return dataVoo;
	}

	public void setDataVoo(int diaVoo,int mesVoo,int anoVoo) {

		if(anoVoo<=2024) {
			diaVoo = -1;
			mesVoo = -1;
			anoVoo = -1;
		}
        
        if(mesVoo<0 && mesVoo>13) {
        	diaVoo = -1;
			mesVoo = -1;
			anoVoo = -1;
        }
        
        if (diaVoo < 0) {
            diaVoo = -1;
            mesVoo = -1;
            anoVoo = -1;
        }
        
        if(mesVoo == 2 && (anoVoo % 4 == 0) && ((anoVoo % 100 != 0) || (anoVoo % 400 == 0)))
        {
            if(diaVoo<0 && diaVoo>29) {
            	diaVoo = -1;
    			mesVoo = -1;
    			anoVoo = -1;
            }
        }
        else if(mesVoo == 2 && diaVoo<0 && diaVoo>28) {
        		diaVoo = -1;
        		mesVoo = -1;
        		anoVoo = -1;
        }
        else if(diaVoo<0 && diaVoo>31) {
        		diaVoo = -1;
        		mesVoo = -1;
        		anoVoo = -1;
        }
        
        this.dataVoo = LocalDate.of(anoVoo, mesVoo, diaVoo);
        
        
	}
	
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int hSaida,int minSaida,int segSaida) {
		if((hSaida<0) || (hSaida>23)) {
			hSaida = -1;
			minSaida = -1;
			segSaida = -1;
		}
		
		if((minSaida<0) || (minSaida>59)) {
			hSaida = -1;
			minSaida = -1;
			segSaida = -1;
		}
		
		if((segSaida<0) || (segSaida>59)) {
			hSaida = -1;
			minSaida = -1;
			segSaida = -1;
		}
		
		this.horaSaida = LocalTime.of(hSaida, minSaida, segSaida);
		
		
	}

	public LocalTime getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(int hChegada,int minChegada,int segChegada) {
		if((hChegada<0) || (hChegada>23)) {
			hChegada = -1;
			minChegada = -1;
			segChegada = -1;
		}
		
		if((minChegada<0) || (minChegada>59)) {
			hChegada = -1;
			minChegada = -1;
			segChegada = -1;
		}
		
		if((segChegada<0) || (segChegada>59)) {
			hChegada = -1;
			minChegada = -1;
			segChegada = -1;
		}
		
		this.horaChegada = LocalTime.of(hChegada, minChegada, segChegada);
	}

	public CompanhiaAerea getNomeCompA() {
		return nomeCompA;
	}

	public void setNomeCompA(CompanhiaAerea nomeCompA) {
		this.nomeCompA = nomeCompA;
	}

	public double getValorMax() {
		return valorMax;
	}

	public void setValorMax(double valorMax) {
		if(valorMax < 0) {
			this.valorMax = -1;
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
