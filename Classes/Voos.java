import java.time.LocalTime;
import java.time.LocalDate;

public class Voos {
	
	private LocalDate dataVoo;
	private LocalTime horaSaida;
	private LocalTime horaChegada;
	private int vagas;
	private double preco;
	private String evento;
	
	public Voos(int diaVoo,int mesVoo,int anoVoo,int hSaida,int minSaida,int segSaida,int hChegada,int minChegada,int segChegada,int vagas,double preco,String evento) {
		
		setDataVoo(diaVoo,mesVoo,anoVoo);
		setHoraSaida(hSaida,minSaida,segSaida);
		setHoraChegada(hChegada,minChegada,segChegada);
		setVagas(vagas);
		setEvento(evento);
		
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
        
        if((diaVoo != -1) && (mesVoo!= -1) && (anoVoo != -1)) {
        	this.dataVoo = LocalDate.of(anoVoo, mesVoo, diaVoo);
        }
        
        
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
		
		if((hSaida != -1) && (minSaida!= -1) && (segSaida != -1)) {
        	this.horaSaida = LocalTime.of(hSaida, minSaida, segSaida);
        }
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
		
		if((hChegada != -1) && (minChegada!= -1) && (segChegada != -1)) {
        	this.horaChegada = LocalTime.of(hChegada, minChegada, segChegada);
        }
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		
		if(vagas<0) {
			this.vagas = 0;
		} else {
			this.vagas = vagas;
		}
		
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}
	
}
